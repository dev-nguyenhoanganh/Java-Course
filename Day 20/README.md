# Buổi 20 : Exception 2

1. Cách khắc phục ngoại lệ

- B1: dự đoán lỗi gặp phải cho từng dòng lệnh hoặc khối lệnh mà chúng ta nghi ngờ bị exception
- B2: Cố gắng dùng `if` - `else` để loại bỏ các trường hợp bất thường
    + Nếu dùng được `if` - `else` thì xử lý trong khối `if` - `else`
    + Không được thì chuyển qua buowscc 3
- B3: Kiểm tra xem bắt bằng `try` - `catch` ở đó có được không
    + Được thì xử lý tiếp công việc trong khối `try` - `catch` ... `finally`
    + Không được thì dùng `throw` hoặc `throws` ném ra ngoại lệ sau đó dùng `try` - `catch` để bắt ở nơi gọi đến

2. Sử dụng `try` - `catch`

- Khi chương trình chạy, nếu đoạn lệnh trong khối `try {..}` mà bị lỗi thì khối `catch {...}` sẽ bắt và xử lý

```java

    // Multi catch exception
    try {
        // Đoạn code phát sinh ngoại lệ
    } catch (Exception | NullPoiterException e) {
        // Xử lý nếu bị lỗi
    } catch (....) {
        // Xử lý lỗi khác
    } ...
    finally {
        /* - Kiểu gì cũng phải vào finally, cho dù `return` ở 
         *   các khối lệnh trên thì cũng sẽ nhảy vào finally
         * - Khi mở kết nối với database thì dùng finally để đóng kết nối
         */
    }
```

3. `Throw`, `throws`



4. Cách `debug` chương trình

- Dừng chương trình ở số lần lặp chỉ định:
`Break point propertise` -> `Hit count` [`Dừng lại ở số lần tương ứng`];