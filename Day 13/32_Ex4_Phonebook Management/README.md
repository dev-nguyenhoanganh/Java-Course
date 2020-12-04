# Bài 4
Xây dựng một đối tượng Quản lý Danh Bạ như sau:

> ### 1. Xây dựng thuộc tính lớp danh bạ gồm

- Thuộc tính: Tên, Số điện thoại
- Phương thức: 
    + Phương thức khởi tạo để nhập dữ liệu cho thuộc tính 
    + Phương thức getTen
    + Phương thức getSDT
    + Phương thức setTen
    + Phương thức setSDT

> ### 2. Xây dựng lớp quản lý gồm

Thuộc tính: DanhBa[] listDB; `gồm 5 phần tử`

Phương thức:
    
+ Phương thức khởi tạo không tham số

+ Phương thức kiểm tra tồn tại (String gtSDT)

    Duyệt và kiểm tra xem trong danh sách có phần tử `DanhBa` nào có SĐT trùng với `gtSDT` là tham số đầu vào không? Nếu có thì trả về `true`, không thì trả về `false`

+ Phương thức thêm danh bạ `(int index, String gtTen, String gtSDT)` để thêm dữ liệu vào `listDB`

    Trong phương thức này, chú ý là phải kiểm tra xem SDT này đã tồn tại hay chưa? Nếu tồn tại thì thông báo là `"Danh bạ này đã tồn tại"` còn nếu chưa thì thì thực hiện tạo mới một phần tử `DanhBa` để thêm vào `listDB`, sau đó hiển thị thông báo `"Đã thêm danh bạ thành công"`

+ Phương thức sửa danh bạ `(String gtriSDT, String SDTmoi)` để sửa lại SDT của phần tử `DanhBa` trong `listDB` mà có `SDT` khớp với `gtriSDT` được nhập vào. Nếu `SDTmoi` bị trùng với một danh bạ nào đó đã có trong `listDB` thì không được sửa.

+ **`[Nâng cao]`** Phương thức tìm kiếm danh bạ `(String gtTen)` như sau:
    - Tìm kiếm tất cả các `DanhBa` có chứa tên trùng với `gtTen` đã nhập theo quy tắc
        ```
            VD: listDB bao gồm:
            1. Thang 0123
            2. Tran Thanh 43534
            3. Hoai 0153
            4. To Hoang 345345
            6. To Thang 43534
            7. To Tien 34534
        ```
    - Nếu nhập chuỗi tìm kiếm là `Thang` thì kết quả tìm kiếm in ra trên màn hình như sau:
        ```
            Thang 0123
            To Hoang 0153
            To Thang 43534
        ```
        