# Buổi 23 : FileIO3

1. Cấu tạo của file

Gồm 2 phần 
- Dữ liệu lưu trữ
- Định dạng tập tin hiển thị : txt, csv, docx, ...

```
         -> | Read  -> String -> convert | -> 
    file    |                            |     Quản lý
         -> | Write <- String <- convert | <- 
```

2. Ghi file
Các bước ghi file:
- Trỏ vào file cần làm việc : 
- Tạo mới file nếu file đó chưa tồn tại
- Mở file để ghi (dùng OuputStream)
- Ghi file (ghi String)
- Đóng file

> ### Lưu ý : Việc ghi file có thể xảy ra exception

- File không tồn tại (`FileNotFoundException`)
- Bị gián đoạn (đang ghi thì bị tiến trình khác xóa - `IOException`)
=> Sử dụng `try - catch` khi đọc ghi file

```java
    private String ghiFileArr(String input, String path) {
        String result = "";
        try {
			// 1 trỏ vào file
			File file = new File(path);
			// 2. Kiểm tra tồn tại
			if (!file.exists()) {
				file.getParentFile().mkdirs();
				file.createNewFile();
				result = "Tạo file thành công";
			}
			// 3. Mở File để ghi
			FileOutputStream fO = new FileOutputStream(file);
			byte[] byteArr = input.getBytes();
			fO.write(byteArr);
			// close
			fO.close();
		} catch (IOException e) {
			result = "Lỗi hệ thống !!!";
        }
        return result;
	}
```

3. Đọc file

Các bước ghi file:
- Trỏ vào file cần làm việc : 
- Kiểm tra nếu file đó chưa tồn tại thì thông báo
- Mở file để đọc (dùng InputStream)
- Đọc file (ghi String)
- Đóng file

```java
private String docFileArr(String path) {
    String data = "";
    try {
        // 1 trỏ vào file
        File file = new File(path);
        // 2. Kiểm tra tồn tại
        if (!file.exists()) {
            System.out.println("File cần đọc không tồn tại.");
            return null;
        }
        // 3. Mở File để đọc
        FileInputStream fI = new FileInputStream(file);
        byte[] arrByte = new byte[8192];
        int length = fI.read(arrByte);
        while (length != -1) {
            data += new String(arrByte, 0, length);
            length = fI.read(arrByte);
        }
        fI.close();
    } catch (IOException e) {
        System.out.println("Lỗi Hệ Thống");
    }
    return data;
}
```

4. Download file

Đăng ký đăng nhập

```
    interface đăng ký / đăng nhập
                     -> | Đăng ký   : Ghi vào file .txt
    user -> quản lý     | 
                     -> | Đăng nhập : Đọc file và kiểm tra
```


Bài 2:

Đối tượng


Ảnh 
- Thuộc tính: ID, Tên ảnh, dung lượng, thời gian, share(boolean)
- Phương thức: 
    + toString() 
        `ID_Tên ảnh_Thời gian_Dung lượng_share`
    + equals()
        `ID.equals(obj.getID)`
    + hienThi()
        `"Tên : " + name + ". Thời gian : " + date + ". Dung lượng " + size`

User
- Thuộc tính: 
```
    + Họ tên     |
    + SĐT        |
    + Ngày Sinh  |  `accout.txt`
    + Tài khoản  |
    + Mật khẩu   |

    + `ArrayList<Image>` danh sách ảnh,   |
    + `ArrayList<User>` bạn bè            |  `Tên_đăng_nhập.txt`
    + `ArrayList<User>` lời mời kết bạn   |
    + `ArrayList<User>` người lạ          |
```

- Phương thức: 
    + Ghi vào account.txt
        `Họ tên_SĐT_Ngày sinh_Tài khoản_Mật khẩu \n`
    + Ghi vào `Tên_đăng_nhập.txt`

