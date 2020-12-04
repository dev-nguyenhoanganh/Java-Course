# Bài 3
Cho 2 chuỗi số nguyên numA và numB, viết phương thức tính tổng của 2 chuỗi số đó mà không được chuyển hai chuỗi số đó qua số nguyên

```
    VD: String numA = "123"; 
        String numB = "234";

    =>  tinhTong() = 357;
```

> Gợi ý
- Bước 1: Kiểm tra xem `numA` với `numB` xem thằng nào ít ký tự hơn thì thêm `0` đằng trước cho cùng số lượng ký tự
- Bước 2: Duyệt từ đầu đến cuối `numA`, lấy ký tự thứ `(i)` của `numA` và `numB` ra, chuyển thành **`int`** rồi cộng vào nhau. Nhớ tạo ra 1 tham số **nhớ** khi phép cộng có tổng lớn hơn `10`.

