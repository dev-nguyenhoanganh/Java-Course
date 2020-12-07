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

Các đặc điểm của mảng
- Số lượng phần tử trong mảng là cố định sau khi đã khởi tạo
- Vùng nhớ sẽ được cấp phát đủ cho các phần tử có trong mảng
- Giá trị mặc định của các phần tử trong mảng sau khi khởi tạo tương ứng như sau:
    + Bằng `null` nếu KDL mảng có cấu trúc
    + Bằng giá trị mặc định của KDL nguyên thủy
        * `int`, `long`, `short`, `byte` : 0
        * `float`, `double` : 0.0
        * `boolean` : false
        * `char` : ký tự có mã ASCII là 0

> 2. Duyệt mảng

a) Mảng một chiều
- Sử dụng một vòng **for** để duyệt từng phần tử mảng để giải quyết công việc
- Sử dụng giá trị đếm `index` để lấy giá trị từng phần tử của mảng rồi giải quyết công việc

VD: Sắp xếp mảng một chiều theo thứ tự tăng dần
```java
int array[] = new int[] {9,8,4,56,8,4,2};
int temp = array[0];
for(int i = 0; i < array.length; i++) {
    for (int j = i + 1; j < array.length; j++) {
        if(array[i] > array[j]) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}

System.out.println(Arrays.toString(array));
```

b) Duyệt mảng 2 chiều
- Sử dụng vòng lặp `for` thứ nhất để duyệt từng phần tử của mảng một chiều
- Sử dụng vòng lặp `for` thứ hai để duyệt từng thuộc tính của phần tử thứ `index` của mảng
- Sử dụng giá trị đếm `i`,`j` để lấy giá trị từng thuộc tính của từng phần tử mảng để giải quyết công việc

VD: Cho ma trận 4x4, tìm và in ra số nguyên nhỏ nhất, số lần xuất hiện và vị trí từng lần xuất hiện.
```java
// Code quy hoạch động
int arr[][] = new int[][] {
    {1,2,3,0},
    {2,1,3,0},
    {2,3,1,0},
    {2,3,0,1}
};

int min   = arr[0][0];
int count = 0;
String listIndex = "";

for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[0].length; j++) {
        if(min > arr[i][j]) {
            count = 1;
            min   = arr[i][j];
            listIndex = "(" + i + "," + j + ")\n"; 
        } else if(min == arr[i][j]) {
            count++;
            listIndex += "(" + i + "," + j + ")\n";
        }
    }
}

System.out.println("Min value: " + min);
System.out.println("So lan xuat hien: " + count);
System.out.println("Vi Tri: \n" + listIndex);
```
> Bài tập về nhà

Tìm và in ra vị trí số bé thứ hai trong mảng. Số lần xuất hiện, giá trị, vị trí từng lần xuất hiện. Kích thước 4x4


