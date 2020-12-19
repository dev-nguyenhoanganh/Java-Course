# Bài 1

Xây dựng chương trình **Smart String** có một đối tượng `SmartString` như sau:

1. Viết phương thức `countCharacter(String text)` trả về số lần xuất hiện của ký tự `b` trong chuỗi text với điều kiện kí tự `b` đứng cách ký tự `a` một ký tự bất kỳ.
```
    VD:
    abc acb aab ab axxb => b xuất hiện 2 lần
```

> ### Lưu ý : Rà soát và xử lý tất cả các lỗi có thể xảy ra cho chương trình

2. Viết phương thức `checkPassword(String text)` trả về một chuỗi **String** chứa những password cách nhau bằng dấu cách (' '). Password phải thỏa mãn các điều kiện sau:
+ Độ dài từ 6 - 8 ký tự
+ Có ít nhất: 1 chữ thường, 1 chữ hoa, 1 chữ số
+ Không được bắt đầu bằng chữ số

> ### Yêu cầu
- Áp dụng các tính chất của lập trình hướng đối tượng để xây dựng chương trình
- Chỉ sử dụng các kiến thức liên quan đến bài `String` - `StringBuilder` - `StringBuffer` để làm.

---
# Bài 2
Xây dựng chương trình **Matrix Fun** có một đối tượng `MatrixFun` như sau:
- Thuộc tính: Mảng 2 chiều matrix 8*8
- Phương thức: 
    + Phương thức `void init()` để nhập dữ liệu vào cho mảng matrix
    + Phương thức `void findMax()` in ra phần tử bé nhất, lớn nhất, vị trí và số lần xuất hiện của phần tử đó. Ví dụ: 
```
7, (1;2), (2;4), (6;4)
Số lần xuất hiện: 3

1, (1;3), (5;7), (5;3)
Số lần xuất hiện: 3
```

> ### Yêu cầu: 
Áp dụng tính chất của lập trình hướng đối tượng để xây dựng chương trình

---
# Bài 3
Một ứng dụng quản lý rạp chiếu phim. Người quản lý có 2 thuộc tính đó là **danh sách phim** và **danh sách phòng chiếu**.

Người quản lý có thể 
- Tìm kiếm phòng chiếu theo tên và lịch chiếu,
- Đặt ghế cho khách nếu phòng chiếu còn ghế trống
- Thêm, xóa các phòng chiếu

Phim sẽ gồm có các thông tin sau: ID, thời lượng, nội dung, lịch chiếu.

Phòng chiếu sẽ gồm các thông tin sau: ID phòng chiếu, danh sách ghế còn trống, tên phòng chiếu, danh sách các bộ phim được chiếu. 

Phòng chiếu có thể thêm, xóa phim nó sẽ chiếu.

> ### Note
Chú ý các phương thức tìm kiếm phim, tìm kiếm phòng chiếu, đặt vé

---
# Phân tích bài toán

<table>
    <tr>
        <th>Đối tượng
        <th>Thuộc tính
        <th>Phương thức
    <tr>
        <td>Quản lý
        <td>
            <li>Danh sách phim
            <li>Danh sách phòng chiếu
        <td>
            <li>Tìm kiếm phòng chiếu theo tên và lịch chiếu
            <li>Đặt ghế cho khách hàng nếu phòng chiếu còn trống
            <li>Thêm mới phòng chiếu
            <li>Xóa phòng chiếu
    <tr>
        <td>Phòng chiếu
        <td>
            <li>ID phòng chiếu 
            <li>Danh sách ghế còn trống 
            <li>Tên phòng chiếu 
            <li>Danh sách các bộ phim được chiếu
        <td>
            <li> Thêm phim
            <li> Xóa phim
    <tr>
        <td>Phim
        <td>
            <li>ID
            <li>Thời lượng 
            <li>Nội dung 
            <li>Lịch chiếu
        <td>
            <li>Getter & Setter các thuộc tính
</table>