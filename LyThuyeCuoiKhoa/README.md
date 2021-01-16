# Câu hỏi ôn tập

### 1. Lý thuyết hướng đối tượng có mấy tính chất?
- Tính trừu tượng
- Tính kế thừa
- Tính đa hình
- Tính đóng gói và che dấu dữ liệu

### 2. Tính trừu tượng hóa
- Loại bỏ hoặc không chú ý đến một số thuộc tính, phương thức của đối tượng

### 3. Tính kế thừa
- Là sự thừa hưởng các phương thức, thuộc tính của đối tượng con từ một đối tượng cha mà không cần phải khai báo

### 4. Ghi đè phương thức là gì? Viết 1 class cha và 1 class con để minh họa?
(Ghi đè chỉ xuất hiện trong kế thừa)
- Định nghĩa lại phương thức trừu tượng đã được khai báo trong class cha được gọi là ghi đè
- Ví dụ minh họa
```java
public class TuGiac {
    int tinhDienTich();
    
	void tinhChuVi() {
	    // Nội dung phương thức
	}
}
----------------------------------------
public class HinhVuong externs TuGiac {
	@Override
	int tinhDienTich();
	
	@Override
	void tinhChuVi() {
	    // Nội dung phương thức
	    super.tinhChuVi();
	    // Tính chu vi tiếp    
	}
}
```

