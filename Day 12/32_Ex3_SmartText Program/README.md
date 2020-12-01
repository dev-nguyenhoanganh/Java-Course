# Bài 3
Xây dựng chương trình `SmartText` có 1 thuộc tính text và các phương thức sau:
- Phương thức khởi tạo để nhập giá trị cho text
- Phương thức sắp xếp và in ra các ký tự trong chuỗi theo mã ASCII giảm dần
- Phương thức đếm và in ra số lần xuất hiện của các ký tự có mặt trong chuỗi text. 
```
    VD: "Hello_e_h"
    + H : 1
    + e : 2
    + l : 2
    + o : 1
    + _ : 2
    + h : 1
```
- Phương thức trimExtra() để xóa các ký tự dấu cách thừa trong chuỗi
```
    VD: "_Hello___e_h__" => "Hello_e_h"
```
- Xóa dấu `Tiếng Việt` có trong chuỗi
```
    VD: "Nguyễn Hoàng Anh" => "Nguyen Hoang Anh"
```
---
Gợi ý: 
- Tạo các `final String UNICODE_A = "áàạảãăắằặẵẳâấầậẩẫ"` ...
- Duyệt từng ký tự chuỗi text, với mỗi ký tự kiểm tra xem có nằm trong UNICODE_A, UNICODE_E, ... hay không? Nếu nằm trong thì gán ký tự bằng 'a', 'e', ... tương ứng
