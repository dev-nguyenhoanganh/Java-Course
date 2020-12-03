# Buổi 13 : StringBuilder, StringBuffer
> 1. StringBuilder, StringBuffer

Khái niệm: 
- Là một đối tượng được java định nghĩa để xử lý các bài toán với chuỗi văn bản như: biểu diễn, xóa, cắt, duyệt các ký tự, chuỗi con
- Là kiểu đối tượng có cấu trúc
- Là kiểu đối tượng **mutable**. Có nghĩa là giá trị của đối tượng sau khởi tạo sẽ bị thay đổi khi thực hiện hành vi của nó
- `StringBuilder` về cơ bản giống `StringBuffer`, chỉ khác nhau duy nhất 1 điểm đó là các phương thức của `StringBuffer` được thực thực hiện tuần tự, đồng bộ còn các phương thức của đối tượng `StringBuilder` được thực hiện riêng biệt, chúng có thể chạy song song
- `StringBuffer` dùng để chạy đa luồng

> 2. Cách khởi tạo đối tượng StringBuilder, StringBuffer

```java
    StringBuilder str = new StringBuilder();
    StringBuffer  str = new StringBuffer();
```
> 3. Ứng dụng của StringBuilder, StringBuffer

- `StringBuffer` được sử dụng chủ yếu trong các bài toán đa luồng có thể gây xung đột dữ liệu

- `StringBuilder` được sử dụng trong các bài toán xử lý với chuỗi vì nó hỗ trợ nhiều phương thức giúp xử lý nhanh hơn đối tượng `String`. 
> 4. Các phương thức đặc trưng của StringBuilder, StringBuffer

```java
    /**
     * Nối thêm chuỗi ký tự vào chuỗi đã có
     */ 
    append(String str);

    /**
     * Xóa ký tự tại vị trí chỉ định
     */
    deleteCharAt(int pos); 

    /**
     * Xóa từ vị trí from đến vị trí to
     */
    delete(int from, int to); 
    
    /**
     * Chèn 1 chuỗi vào vị trí được chỉ định
     */
    insert(int pos, String str);

    /**
     * Đảo ngược chuỗi
     */
    reverse();

    /**
     * Dùng trong trường hợp ép kiểu từ StringBuilder về String
     */
     toString();
```

> Chú ý

REGEX (Biểu thức chính phương)
- Kiểm tra chuỗi có phù hợp yêu cầu hay không.
- Triết xuất dữ liệu từ một file
- Khi thi được sử dụng regex