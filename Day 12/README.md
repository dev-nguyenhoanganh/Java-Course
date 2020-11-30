## Buổi 12: String

> 1. Khái niệm và cách khởi tạo `String`
- Khái niệm
    - Là một đối tượng được Java định nghĩa để xử lý các bài toán với chuỗi văn bản như: biểu diễn, xóa, cắt, duyệt các ký tự, chuỗi con.
    - Là kiểu đối tượng có cấu trúc
    - Là kiểu đối tượng `immutable` - nghĩa là giá trị của đối tượng String sau khi khởi tạo sẽ không bị thay đổi khi thực hiện hành vi của chính nó. 
    ```
    Các phương thức của String sẽ không làm thay đổi giá trị của thực thể
    ```
- Cách khởi tạo
    - Cách 1: Khởi tạo đối tượng String tại vùng nhớ `StringPool`
    
        Cú pháp
        ```java
        String tenThamSo = "Chuỗi văn bản";
        String name = "Hoàng Anh";
        ```
        Ý nghĩa:
        - Đây là cách khởi tạo được ưu tiên sử dụng
        - Khởi tạo đối tượng ở vùng nhớ `StringPool` sẽ tiết kiệm được bộ nhớ vì 2 String có cùng giá trị sẽ nằm vào cùng một ô nhớ

        Nhược điểm
        - Mất thời gian đi so sánh với từng giá trị cụ thể trong `StringPool`

    - Cách 2: Khởi tạo đối tượng tại vùng nhớ `Heap`
        
        Cú pháp
        ```java
        String name = new String("Hoàng Anh");
        ```
        Ý nghĩa
        - Đây là cách khởi tạo dùng trong một số trường hợp bắt buộc như chuyển đổi một dãy ký tự sang String hay 1 dãy các số byte sang String ...
        - Cách khởi tạo trên, đối tượng String sẽ được tạo mới và được lưu trữ tại vùng nhớ `Heap`
> 2. So sánh 2 `String`
- Nên dùng `equals` thay vì toán tử `==`. Vì toán tử `==` chỉ so sánh địa chỉ 2 ô nhớ với nhau, còn phương thức `equals` so sánh giá trị của 2 String.
```java
    String text1 = "Nam";
    String text2 = "Nam"
    boolean result = text1.equals("Nam"); // Return true;

    // Khi so sánh có 2 cách làm:
    text1.equals("0"); // Cách dùng này sẽ dễ gặp lỗi null pointer
    "0".equals(text1); // Cách dùng này sẽ tối ưu hơn
```

> 3. Các phương thức phổ biến của String
```java
    length(); // Trả về số lượng ký tự của chuỗi
    charAt(int index); // Trả về ký tự có vị trí *index* trong chuỗi
    
    /**
     * Trả về 
     * - true nếu 2 ký tự giống hệt nhau
     * - false trong trường hợp ngược lại
     */
    equals(String srt);  

    /**
     * So sánh không phân biệt hoa với thường
     */
    equalsIgnoreCase(String srt); 

    /**
     * Dựa vào bảng mã ASCII: this - another
     * - return  0 : 2 chuỗi giống hệt nhau
     * - return < 0: chuỗi 1 < chuỗi 2
     * - return > 0: chuỗi 1 > chuỗi 2
     */
    compareTo(String srt); 

    /**
     * Bắt đầu từ vị trí 0
     * return: vị trí đầu tiên xuất hiện chuỗi *srt* trong chuỗi this
     */
    indexOf(String srt); 

    /**
     * Tìm kiếm từ vị trí *start*
     * return: vị trí đầu tiên xuất hiện chuỗi *srt* trong chuỗi this
     */
    indexOf(String srt, int start); 

    /**
     * Trìm kiếm và trả về vị trí xuất hiện cuối cùng của chỗi *srt* trong
     * chuỗi this
     */
    lastIndexOf(String str); 

    /**
     * return true: chuỗi text bắt đầu với chuỗi *srt*
     * return false: chuỗi text không bắt đầu với chuỗi *srt*
     */ 
    startWith(String srt);

    /**
     * return true: chuỗi this chứa chuỗi *srt* 
     * return false: chuỗi this không chứa chuỗi *srt* 
     */
    contains(String srt);

    /**
     * return chuỗi sau khi đã cắt từ vị trí *begin* đến vị trí *end - 1*
     * Số lượng : end - begin
     */
    substring(int begin, int end); 

    /**
     * return true: nếu chuỗi *this* rỗng (length = 0)
     * return false: nếu chuỗi *this* không rỗng (length = 0)
     */ 
    isEmpty();

    /**
     * return chỗi sau khi đã chuyển tất cả các ký tự thành viết hoa
     */ 
    toUpperCase();

    /**
     * Trả về mảng chuỗi con được cắt rời thành từng đoạn
     * Không được dùng trong giai đoạn 2.1
     */ 
    split(String srt);
```

BTVN
```
    Đếm số lần xuất hiện của một chuỗi bất kỳ nằm trong một chuỗi khác.
    Xử lý các ngoại lệ để không bị chết chương trình.
    - Được sử dụng tất cả các phương thức của String
```