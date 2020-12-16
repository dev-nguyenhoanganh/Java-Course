# Buổi 16 : Buổi ArrayList

> ### 1. Định nghĩa ArrayList

- Là đối tượng được java định nghĩa để biểu diễn một danh sách các phần tử, mà số lượng các phần tử của danh sách có thể thay đổi được.
- Khác với mảng ArrayList giống như một bộ sưu tập, nó không cố định số lượng các phần tử mà có thể thêm / bớt các phần tử trong danh sách của mình
- Các phần tử trong ArrayList không nhất thiết phải nằm cạnh nhau mà có thể nằm ở nhiều nơi khác nhau trong bộ nhớ. ArrayList có nhiệm vụ liên kết và quản lý các phần tử
- Cùng kiểu dữ liệu, vẫn có chỉ số
- Khi thêm thì thêm liên kết, khi xóa thì cắt liên kết chứ không xóa thực thể

> ### 2. Cấu trúc ArrayList

- Chỉ có thể biểu **diễn danh sách các phần tử** có kiểu dữ liệu là **có cấu trúc**
- Cú pháp

```java
    ArrayList<Student> listStudent = new ArrayList<Student>();
```

- Ban đầu danh sách sẽ là rỗng vì không có phần tử nào. Kích thước danh sách sẽ được tăng lên khi thêm phần tử

> ### 3. Các phương thức của ArrayList

Các phương thức chính gồm có

| Phương thức            | Ý nghĩa                                       |
| ---------------------- | --------------------------------------------- |
| `size()`               | Trả về số lượng phần tử trong danh sách       |
| `add(KDL value)`       | Tự động thêm vào cuối danh sách               |
| `set(index, newValue)` | Đè giá trị mới vào phần tử thứ `index`        |
| `get(KDL value)`       | Trả về index của phần tử có giá trị tương ứng |
| `remove(KDL value)`    | Xóa thực thể đầu tiên gặp                     |
| `contains(KDL value)`  | Kiểm tra tính tồn tại của phần tử tương ứng   |
| `clear()`              | Xóa tất cả các phần tử trong danh sách        |

- Bài toán quản lý chỉ dùng ArrayList chứ không dùng Array
- Khi dùng phương thức `contains()`, `indexOf()` phải ghi đè phương thức `equals()` bên trong đối tượng học sinh

> ### 4. Duyệt danh sách ArrayList
