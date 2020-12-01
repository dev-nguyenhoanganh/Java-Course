# Bài 2
Xây dựng chương trình ReverseInt có một thuộc tính là số nguyên và xây dựng phương thức reverseInt như sau:

```
    VD:    int soNguyen = 11;
```

- Chuyển số nguyên sang mã nhị phân bằng cách chia lấy dư cho 2 đến khi `soNguyen = 0`
```
    VD:
    11 % 2 = 1, soNguyen = soNguyen / 2 = 5
    5  % 2 = 1, soNguyen = soNguyen / 2 = 2
    2  % 2 = 0, soNguyen = soNguyen / 2 = 1
    1  % 2 = 1, soNguyen = soNguyen / 2 = 0
    
    => soNguyen được biểu diễn bằng chuỗi "1011"
```
- Đảo ngược chuỗi "1101" -> "1011"
- Chuyển mã nhị phân "1101" về cơ số 10:
```
    VD:
    1*2^0 + 0*2^1 + 1*2^3 = 1 + 0 + 4 + 8 = 13 
``` 
> Lưu ý: Xây dựng đối tượng `text` trong Main và gọi các phương thức để kiểm tra

