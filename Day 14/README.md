# Buổi 14: Array
> 1. Khái niệm mảng
- Mảng là một tập hợp hữu hạn các phần tử có cùng kiểu dữ liệu, có địa chỉ liên tiếp nhau trong bộ nhớ.
- Số lượng phần tử của mảng là cố định và được xác định khi khai báo mảng. Sau đó không thể thay đổi số lượng phần tử trong mảng.
- Mảng được sử dụng để giải quyết các bài toán về tập hợp như: duyệt, tìm kiếm, xóa, sắp xếp ...

- Cú pháp
```java
    // Mảng 1 chiều
    String array[]   = new String[6];
    String array[]   = new String[] {"abc", "abc", "abc", "abc", "abc"};

    // Mảng 2 chiều
    String array[][] = new String[SL_PHAN_TU][SL_THUOC_TINH];
    int array[][] = new int[][] {
        {1,2,3},
        {1,2,3},
        {1,2,3}
    };
```

|Phần Tử| Tên  |Lớp |Năm Sinh|
|:-----:|:----:|:--:|:------:|
|  HS1  |"Anh" |"10"| "1998" |
|  HS2  |"Hung"|"11"| "1998" |
|  HS3  |"Hoa" |"12"| "2003" |

Tìm và in ra vị trí số bé thứ hai trong mảng. Số lần xuất hiện, giá trị, vị trí từng lần xuất hiện. Kích thước 4x4

> 2. Duyệt mảng

