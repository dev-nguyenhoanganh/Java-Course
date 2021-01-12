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


