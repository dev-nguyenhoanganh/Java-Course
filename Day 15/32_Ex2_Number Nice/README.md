# Bài 2

Xây dựng chương trình **NumberNice**, có đối tượng `NumberNice` để thực hiện công việc sau

- Nhập vào một mảng số nguyên gồm 10 phần tử ngẫu nhiên có 5 chữ số

```java
    Random rd = new Random();
    int value = rd.nextInt(50);
```

- Sắp xếp các số trong mảng tăng dần
- Tìm kiếm và in ra phần tử có số lượng các chữ số là số lẻ lớn nhất. Ví dụ:

```
    Xét 12345 và 24794:
    Số 12345 có 3 chữ số lẻ (1,3,5)
    "lớn hơn"
    Số 24794 có 2 chữ số lẻ (7,9)
```

- Tìm kiếm và in ra bộ 3 phần tử trong mảng có tổng lớn nhất nhưng không vượt quá 50000
