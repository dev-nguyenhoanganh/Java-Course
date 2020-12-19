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
    </tr>
    <tr>
        <td>Quản lý
        <td>
            <li>Danh sách phim
            <li>Danh sách phòng chiếu
        </td>
        <td>
            <li>Tìm kiếm phòng chiếu theo tên và lịch chiếu
            <li>Đặt ghế cho khách hàng nếu phòng chiếu còn trống
            <li>Thêm mới phòng chiếu
            <li>Xóa phòng chiếu
        </td>
    </tr>
    <tr>
        <td>Phim
        <td>
            <li>ID
            <li>Thời lượng 
            <li>Nội dung 
            <li>Lịch chiếu
        </td>
        <td>
            <li>Getter & Setter các thuộc tính
        </td>
    </tr>
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
    </tr>
</table>