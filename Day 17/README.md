# Buổi 17 : Thư viện Collections

> ### 1. Thư viện Collections là gì?

- Gói thư viện **java.util.Collections**
- Được sử dụng để giải quyết một số bài toán về danh sách như:
  - Thay thế toán bộ các phần tử trong danh sách bằng một giá trị mới
  - Tìm **max**, **min**
  - Đảo ngược vị trí các phần tử trong danh sách
  - Trộn vị trí các phần tử trong danh sách

> ### 2. Các phương thức của thư viện
|Phương thức |                        Cách sử dụng                                  |
|-----------:|:---------------------------------------------------------------------|
|  `fill()`  | Thay thế bằng một giá trị giống nhau cho tất cả các phần tử của mảng |
| `reverse()`| Đảo ngược vị trí các phần tử trong danh sách                         |
| `shuffle()`| Trộn ngẫu nhiên vị trí của các phần tử trong danh sách               |
| `min()`/`max()` | Duyệt để tìm kiếm và trả về các phần tử nhỏ nhất, lớn nhất trong danh sách. Để làm được điều này, các kiểu dữ liệu có cấu trúc do người dùng tự tạo phải ghi đè phương thức `equals()`. |

> ### Chú ý

- Phương thức tìm kiếm ưu tiên sử dụng `contain()` theo String, trả về.
- Hashmap, list, hashset, ... (Dùng để chứa dữ liệu nhưng có ưu nhược điểm khác nhau)
