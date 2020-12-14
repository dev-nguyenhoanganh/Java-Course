# Buổi 15 : Thư viện Arrays

> ### 1. Thư viện Arrays

- Gói thư viện: `java.ulti.Arrays` 
- Được sử dụng để giải quyết một số bài toán về mảng như: 
    + Tạo dữ liệu mảng ban đầu cho phần tử
    + Sắp xếp các phần tử trong danh sách 
    + In mảng các phần tử
    + Cắt ngắt mảng phần tử
- `Arrays` là một đối tượng sử dụng để tác động vào một mảng cụ thể

> ### 2. Một vài phương thức đặc trưng

a) Phương thức `fill()`
- Khởi tạo các giá trị giống nhau cho tất cả các phần tử của mảng
```java
    Arrays.fill(array, value);
```

b) Phương thức `toString()`
- Phương thức trả về một chuỗi dạng `String`
- Để sử dụng được phương thức này, bắt buộc phải ghi đè phương thức `toString()` của một object nằm trong array đó.

c) Phương thức `sort()` 
- Được sử dụng để sắp xếp vị trí các phần tử của mảng theo 1 tiêu chí nào đó như: tăng dần, giảm dần ....
- Trước khi sắp xếp phải xác định được tiêu chí sắp xếp là gì

- Cách 1 : Viết hàm sắp xếp vào trong class của học sinh
```java
    @Override
	public int compareTo(Student spObj) {
		// Xếp tăng dần
		return this.age - spObj.age;

		// Xếp giảm dần
		// return spObj.age - this.age;
	}

    // Xếp theo tên
	@Override
	public int compareTo(Student obj) {

		return obj.getName().compareTo(this.name);
	}

	// So sánh kiểu dữ liệu double
	@Override
	public int compareTo(Student obj) {
		double result = this.score - obj.score; 
		return result > 0 ? 1 : (result < 0 ? 0 : -1) ;
	}
```
- Cách 2 : Viết vào đối tượng quản lý

```java
    Comparator <Student> orderByName = new Comparator <Student>() {
		@Override
		public int compare(Student o1, Student o2) {

			return o1.getName().compareTo(o2.getName());
		};
	};

	public void Sort() {
		Arrays.sort(students, orderByName);
	}
```

d) Phương thức `copyOf()`
- Được sử dụng để sao chép mảng hiện tại để tạo ra một mảng mới và trả về mảng kết quả

```java
VD1:
    int arr[] = new int[] {1,2,3,4};
    int newArr[] = new int Arrays.copyOf(arr, 9);
    // result = {1,2,3,4,0,0,0,0,0}

```

d) Phương thức `copyOfRange()`

```java
    int arr[] = new int[] {1,2,3,4};
    int newArr[] = new int Arrays.copyOfRange(arr, 2, 6);
    // result = {3,4,0,0}
```


> ### Chú ý

- Trong những bài toán quản lý: thường ghi đè 2  phương thức `toString()`, `toEqual()`
- Những đối tượng bị quản lý gồm các phương thức : `toString`, `equal`, `setter`, `getter`, khởi tạo có tham số và không có tham số
- test : split, for each, kiểu cấu trúc dữ liệu `set`
- `clone` từ khóa để tạo một thực thể sao lưu lại giá trị ban đầu
- `split`, `contains` là những công cụ rất mạnh của String