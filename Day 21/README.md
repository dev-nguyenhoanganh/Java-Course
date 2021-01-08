# Buổi 21 : FileIO

> ### 1. Đối tượng File

- Là đối tượng được java định nghĩa để quản lý tệp tin và thư mục nằm trong bộ nhớ

- Trỏ đến tập tin cần làm việc
```java
    File file = new
```

- Đường dẫn
    + Đường dẫn tuyệt đối : trỏ thẳng trực tiếp vào một thư mục cụ thể trong máy tính.
    + Đường dẫn tương đối : Lấy chương trình đang chạy làm mốc và dữ liệu 
```
    + Đường dẫn tuyệt đối : 
        D:\Java Programing Language\BTVN Project\Day 21\README.md
    + Đường dẫn tương đối : 
        .\File\sample.txt // Thư mục cùng cấp với src
        .\src\com\luvina
```    

> ### 2. Các phương thức lấy thông tin của File

- Kiểm tra sự tồn tại của tệp tin `exist()`
- Tạo tệp tin mới `creatNewFile()`

> ### Chú ý
- Phương thức `creatNewFile()` chỉ tạo được file mới khi các thư mục trên đường dẫn đã tồn tại.