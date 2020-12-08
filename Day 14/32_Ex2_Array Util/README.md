# Bài 2
Xây dựng chương trình **ArrUtil** có đối tượng **`ArrayUtil`** được mô tả như sau:

- Thuộc tính:
    + **`int[] array`** : Biểu diễn một mảng các số nguyên dương.
    + **`int n`** : Biểu diễn số lượng phần tử của mảng **`array`**

- Phương thức:
    + **`ArrayUtil(int n)`** : Phương thức khởi tạo một tham số làm nhiệm vụ
        * Gián giá trị của tham số được truyền vào cho thuộc tính **`n`**
        * Khởi tạo mảng **`array`** có **`n`** phần tử, các giá trị của mỗi phần tử là ngẫu nhiên từ 1 đến 50
    + **`int findTriangle()`** : Phương thức này làm nhiệm vụ
        * Kiểm tra từng ***bộ 3 phần tử liền nhau*** trong mảng số nguyên xem có thể tạo thành một tam giác hay không? 
        * Nếu bộ 3 phần tử nào có thể tạo thành tam giác thì in bộ 3 đó ra màn hình. 
```
Ví dụ:
    array = {1, 5, 6, 4, 2, 3, 3, 4, 2}
    Chúng ta sẽ có các bộ sau là tam giác:
        {
            (5, 6, 4), 
            (4, 2, 3),
            (2, 3, 3),
            (3, 3, 4),
            (3, 2, 4)
        }
```

> ### Lưu ý
Điều kiện hợp thành một tam giác gồm:
- `a + b > c`
- `b + c > a`
- `c + a > b`