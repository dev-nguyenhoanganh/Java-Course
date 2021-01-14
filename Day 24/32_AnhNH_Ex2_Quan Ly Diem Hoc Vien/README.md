# Quản lý học sinh


Phân tích bài toán

<table>
    <thead>
        <tr>  
            <th> Đối tượng
            <th> Thuộc tính
            <th> Phương thức
    <tbody>            
        <tr>
            <td> Manager
            <td> Danh sách tất cả người dùng
            <td> 
                <li> Đăng nhập
                <li> Đăng ký 
                <li> Thêm User
                <li> Sửa User
                <li> Xóa User
                <li> Tìm kiếm User
                <li> Cấp quyền cho User
                <br><br>
                <li> Đọc File
                <li> Ghi File
        <tr>
            <td> User 
            <td>
                <li> <code>userID</code><br> 
				<li> <code>name</code><br>
				<li> <code>date</code><br>
				<li> <code>account</code><br>
				<li> <code>pass</code><br>
				<li> <code>priorityLevel</code>
                <li> <code>IuserAction</code> event
            <td> 
                <li>Interface<ul>
                    <li><code>Đăng nhập</code>
                    <li><code>Đăng ký</code></ul>
                <li>Tự động tạo ID
        <tr>
            <td> Teacher (Kế thừa <code>User</code>)
            <td>
                <code>Kế thừa các thuộc tính từ User</code>
                <br>
                Danh sách học sinh
            <td> 
                <li> Thêm học sinh
                <li> Sửa học sinh
                <li> Xóa học sinh
                <li> Hiển thị danh sách học sinh
                <li> Sửa điểm theo mã học sinh
        <tr>
            <td> Student (Kế thừa <code>User</code>)
            <td> 
                <code>Kế thừa các thuộc tính từ User</code><br>
                <li> Điểm Toán
                <li> Điểm Văn
                <li> Điểm Anh
                <li> Điểm trung bình
                <li> Lớp
            <td>
                <li> Hiển thị thông tin cá nhân
</table>


> ## Interface của User

```java
public interface IUserAction {

	public String signUp( String name, 
						  String date, 
						  String account, 
						  String pass,
						  String priorityLevel);

	public User signIn(String userID, String pass);

	public boolean addStudent(Student newStudent, User teacher);

	public boolean removeStudent(String studentID, User teacher);
}
```

Sử dụng đa hình để giải quyết bài toán, chính là dùng `interface` gọi đến phương thức của Manager để phân quyền cho từng `User`. Mỗi `User` chỉ được sử dụng một số phương thức nhất định:
### 1. Đăng nhập
+ Đầu vào: **`tài khoản`**, **`mật khẩu`**
+ Đầu ra: 1 thực thể **`Học Sinh`**, **`Giáo Viên`** cụ thể
+ Yêu cầu logic: Khi đăng nhập vào hệ thống, dữ liệu của **`User`** tự động được lấy ra từ **`database`**.

```java
    // Đối tượng quản lý
    public User signIn(String account, String pass) {
		for (User user : listUser) {
			if (user.getAccount().equals(account)) {
				if (user.getPass().equals(pass)) {
					if("TEACHER".equals(user.getPriorityLevel())) {
						return new Teacher(user, convertFileToTeacher(account));
					} else if ("STUDENT".equals(user.getPriorityLevel())) {
						return convertFileToStudent(account);
					}
				}
			}
		}
		return new User();
	}

    // Đối tượng User
    public User signIn(String account, String pass) {
		return event.signIn(account, pass);
    }
    
    // Đối tượng giáo viên
    @Override
	public String signUp() {
		listStudent = new ArrayList<Student>();
		return super.signUp();
    }
    
    // Đối tượng học sinh
    @Override
	public Student signIn(String account, String pass) {
		return (Student) super.signIn(account, pass);
	}
```

### 2. Đăng ký
- Đầu vào: Các thuộc tính của đối tượng, 
- Đầu ra: String báo kết quả
- Yêu cầu logic : Thêm người dùng mới vào list chung của quản lý (Quản lý sẽ có quyền quản lý tất cả các tài khoản trong hệ thống). Sau khi thêm thì chuyển danh sách người dùng thành dạng file lưu trong `database`

```java
    // Đối tượng quản lý
    public String signUp( String name, 
						  String date, 
						  String account, 
						  String pass,
						  String priorityLevel ) {

		User user = new Teacher(name, date, account, pass);
		
		if (listUser.contains(user)) {
			return "Tài khoản đã tồn tại";
		}

		// Thêm vào list và Ghi File
		listUser.add(user);
		boolean result1 = convertListToFile();
		boolean result2 = writeToFile("", SRC + user.getAccount() + ".txt");

		// Xử lý kết quả và trả về
		if (result1 && result2) {
			return "Tạo tài khoản thành công";
		} else {
			return "Lỗi hệ thống !!!";
		}
    }
    
    // Đối tượng User
    public String signUp() {
		return event.signUp(name, date, account, pass, priorityLevel);
    }
    
    // Đối tượng Teacher
    @Override
	public String signUp() {
		listStudent = new ArrayList<Student>();
		return super.signUp();
	}
```

### 3. Thêm học sinh
- Đầu vào: Học sinh mới, giáo viên quản lý học sinh này 
- Đầu ra: true, false - báo hiệu thêm thành công hoặc không thành công
- Xử lý logic: Thêm mới học sinh vào danh sách người dùng, đồng thời thêm vào danh sách giáo viên quản lý. Sau đó tiến hành ghi dữ liệu người dùng vào file

```java
// Đối tượng manager
public boolean addStudent(Student newStudent, User teacher) {
    listUser.add(newStudent);
    convertListToFile();
    writeToFile(newStudent.toAccountFile(), SRC + newStudent.getAccount() + ".txt");
    return writeToFile(teacher.toAccountFile(), SRC + teacher.getAccount() + ".txt");
}

    // Đối tượng User
    public boolean addStudent(Student newStudent) {
		return event.addStudent(newStudent, this);
    }

    // Đối tượng Teacher
    @Override
	public boolean addStudent(Student newStudent) {
		if (listStudent.contains(newStudent)) {
			return false;
		} else {
			listStudent.add(newStudent);
		}
		super.addStudent(newStudent);
		return true;
	}
```

### 4. Xóa học sinh
- Đầu vào: ID của học sinh, giáo viên quản lý học sinh này
- Đầu ra: true, false - Xóa thành công hoặc không thành công
- Xử lý logic: Xóa học sinh khỏi danh sách quản lý của giáo viên, sau đó xóa khỏi danh sách người dùng của quản lý. Rồi cập nhật lại danh sách User, danh sách học sinh bên trong Teacher và ghi lại vào file.

```java
    // Đối tượng Manager
    public boolean removeStudent(String studentID, User teacher) {
		int idx = listUser.indexOf(new User(studentID, "", "", "", "", ""));
		String fileName = listUser.get(idx).getAccount() + ".txt";
		
		// Check trong file account.txt
		if (idx == -1) {
			return false;
		}
		listUser.remove(idx);

		// Cập nhật lại danh sách User và danh sách học sinh bên trong Teacher
		if (convertListToFile()) {
			if (writeToFile(teacher.toAccountFile(), SRC + teacher.getAccount() + ".txt")) {
				if (deleteFile(SRC + fileName)) {
					return true;
				}
			}
		}
		return false;
    }
    
    // Đối tượng User
    public boolean removeStudent(String studentID) {
		return event.removeStudent(studentID, this);
	}

    // Đối tượng Teacher
    public boolean removeStudent(String studentID) {
		if (studentID.isEmpty()) {
			return false;
		}
		int index = -1;
		for (Student student : listStudent) {
			if (studentID.equals(student.getUserID())) {
				index = listStudent.indexOf(student);
			}
		}
		if (index == -1) {
			return false;
		}
		listStudent.remove(index);
		return super.removeStudent(studentID);
	}
```