## Buổi 12: String

> 1. Khái niệm và cách khởi tạo `String`
- Khái niệm
    - Là một đối tượng được Java định nghĩa để xử lý các bài toán với chuỗi văn bản như: biểu diễn, xóa, cắt, duyệt các ký tự, chuỗi con.
    - Là kiểu đối tượng có cấu trúc
    - Là kiểu đối tượng `immutable` - nghĩa là giá trị của đối tượng String sau khi khởi tạo sẽ không bị thay đổi khi thực hiện hành vi của chính nó
- Cách khởi tạo
    - Cách 1: Khởi tạo đối tượng String tại vùng nhớ StringPool
    
        Cú pháp
        ```java
        String tenThamSo = "Chuỗi văn bản";
        String name = "Hoàng Anh";
        ```
        Ý nghĩa:
        - Đây là cách khởi tạo được ưu tiên sử dụng
        - Khởi tạo đối tượng ở vùng nhớ StringPool sẽ tiết kiệm được bộ nhớ vì 2 String có cùng giá trị sẽ nằm vào cùng một ô nhớ

    - Cách 2: Khởi tạo đối tượng tại vùng nhớ Heap
        
        Cú pháp
        ```java
        String name = new String("Hoàng Anh");
        ```
        Ý nghĩa
        - Đây là cách khởi tạo dùng trong một số trường hợp bắt buộc như chuyển đổi một dãy ký tự sang String hay 1 dãy các số byte sang String ...
        - Cách khởi tạo trên, đối tượng String sẽ được tạo mới và được lưu trữ tại vùng nhớ Heap.