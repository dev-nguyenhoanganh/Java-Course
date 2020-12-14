# Bài 3

Cho một ma trận vuông sau

```
   `1.  2   3   4   5   6   7  .8`
    7  `8.  2   3   6   4  .3`  2
    8   9  `3.  2   4  .3`  4   9
    0   4   7  `3. .4`  2   3   4
    9   8   7  .4` `3.  2   3   8
    8   7  .3`  4   3  `3.  2   3
    9  .7`  4   5   4   1  `8.  3
   .9`  8   4   3   7   5   9  `8.
```

Xây dựng chương trình **MatrixFun** có một đối tượng `MatrixFun` như sau:

- Thuộc tính mảng 2 chiều **matrix** gồm các phần tử như trên
- Phương thức :

  - Phương thức `void init()` để nhập dữ liệu cho mảng `matrix`
  - Phương thức void `calcSumArea()` tính và in ra màn hình tổng của mỗi vùng được ngăn cách bởi 2 đường chéo như hình mô tả bên trên. `Lưu ý` không được tính các phần tử trên đường chéo đó
  - Phương thức `void secondMax()` tìm và in ra phần tử lớn thứ 2 của ma trận đó

- Xây dựng đối tượng Main để thực thi test cho chương trình

> ### Yêu cầu

- Áp dụng các tính chất của lập trình hướng đối tượng để xây dựng chương trình
- Sử dụng các kiến thức đến bài Array để làm
