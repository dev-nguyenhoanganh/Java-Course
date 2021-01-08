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
    private void ghiFileArr(String input, String path) {
		try {
			// 1 trỏ vào file
			File file = new File(path);
			// 2. Kiểm tra tồn tại
			if (!file.exists()) {
				file.getParentFile().mkdirs();
				file.createNewFile();
				System.out.println("Tạo file thành công");
			}
			// 3. Mở File để ghi
			FileOutputStream fO = new FileOutputStream(file);
			byte[] byteArr = input.getBytes();
			fO.write(byteArr);
			// close
			fO.close();
		} catch (IOException e) {
			System.out.println("Lỗi hệ thống !!!");
		}
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

d