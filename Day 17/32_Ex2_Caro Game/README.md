# Bài 2
Xây dựng project CaroGame - 7 hàng, 7 cột, độ rộng 50
```
  X
  |   _ _ _ _ _ _ _ _   
  0  |_|_|O|_|_|_|_|_|  0    |  ------------ CaroGame ------------
  1  |_|_|_|O|X|_|_|_|  1    |  Tỷ số hiện tại: 0 - 0
  2  |_|_|_|X|O|_|_|_|  2    |  Game over : O thắng
  3  |_|_|O|X|_|O|_|_|  3    |  ------------ Thao tác ------------
  4  |_|_|_|X|X|_|O|_|  4    |  A. Đánh cờ
  5  |_|_|_|X|_|_|_|_|  5    |  B. Xóa bàn cờ
  6  |_|_|_|_|_|_|_|_|  6    |  C. Chơi lại từ tỷ số 0 - 0
  7  |_|_|_|_|_|_|_|_|  7    |  D. Thoát
      0 1 2 3 4 5 6 7  
    
    Đến lượt người chơi 1 đánh
    X = 
    Y = 
``` 


**Gồm các đối tượng**:
1. `Quân cờ` 
- Thuộc tính
    + (x,y) : Vị trí quân cờ
    + Loại quân cờ : (X, O)

- Phương thức
    + Khởi tạo 3 tham số dùng để khởi tạo 1 quân cờ
    + Các phương thức `get` để lấy giá trị x, y, loại quân cờ khi cần thiết

2. `Bàn cờ`
- Thuộc tính hằng
    + `SỐ CỘT` 
    + `SỐ HÀNG`
    + `SIZE` của một ô vuông bàn cờ
- Thuộc tính
    + Màu sắc bàn cờ (xanh, đỏ, tím vàng), tỷ số trận đấu, người chơi 1, người chơi 2

- Phương thức
    + Khởi tạo 4 tham số dùng để khởi tạo các thông số của bàn cờ. Trong phương thức khởi tạo còn phải khởi tạo cả 2 người chơi và reset tỷ số trận đấu
    + `veBanCo()` dùng để vẽ lên bàn cờ trong màn hình giao diện đồ họa.
    + `xoaBanCo()` dùng để thực hiện xóa tất cả các quân cờ của 2 người chơi trên bàn cờ
    + `kiemTraThangCuoc()` dùng để kiểm tra xem người chơi nào là người thắng cuộc
    + `choiLai()` dùng để reset tỉ số trận đấu và đồng thời xóa các quân cờ của 2 người chơi trên bàn cờ
        - B1 : Kiểm tra xem tổng số quân cờ trên bàn cờ đã có ít nhất 9 quân chưa, nếu chưa thì return
        - B2 : Kiểm tra thắng cuộc theo hàng ngang, hàng dọc và 2 đường chéo (*Người chơi thắng cuộc là người có 5 quân cờ được đánh liền bên cạnh nhau teo hàng ngang, hàng dọc hoặc đường chéo*). 

Nếu tìm thấy người thắng cuộc tăng tỷ số trận đấu, in thông báo `Người chơi ... thắng cuộc`, `Tỷ số là: Thua ..., Thắng ...`

3. Người chơi
- Thuộc tính
    + Danh sách<Quân cờ>
    + Tên người chơi
    + Loại quân cờ (X, O)

- Phương thức
    + Khởi tạo 2 tham số dùng để khởi tạo người chơi với tên và loại quân cờ. Trong phương thức khởi tạo còn phải khởi tạo danh sách quân cờ của người chơi.</li>
    + `danhCo(int x, int y)` dùng để thực hiện đánh cờ bằng cách sinh ra một quân cờ và làm tuần tự các thao tác:
        - Kiểm tra tọa độ (x, y) có hợp lệ hay không. Nếu không hợp lệ thì `return` luôn 
        - Điều chỉnh (x, y) thành giá trị đúng để quân cờ được đánh vào giữa ô vuông

```
            Hợp lệ khi (x,y) nằm trong phạm vi bàn cờ: 
            x Ꞓ [0, (SỐ CỘT - 1)  * SIZE]
            y Ꞓ [0, (SỐ HÀNG - 1) * SIZE]
```
    
