# Bài tập thêm trên lớp
Cho mảng 2 chiều kích thước 4x4. Tìm số bé thứ hai trong mảng và in ra
- Giá trị 
- Số lần xuất hiện 
- Vị trí từng lần xuất hiện

# Ý tưởng

> Phương thức `findMin()`

Định nghĩa phương thức `findMin()` để tìm giá trị nhỏ nhất bên trong mảng.

```java
public static int findMin(int arr[][]) {
    int min = arr[0][0];
    for(int i = 0; i < arr.length; i++) {
        for(int j = 0; j < arr[0].length; j++) {
            if(arr[i][j] < min) {
                min = arr[i][j];
            }
        }
    }
    return min;
}
```

> Chương trình chính trong `main()`

Sau khi đã tìm được giá trị nhỏ nhất của mảng, tiến hành duyệt mảng thêm một lần nữa để tìm giá trị nhỏ thứ 2 trong mảng. Đồng thời lưu vị trí các lần xuất hiện vào biến `result`

```java
int 	min 	  = findMin(arr); 
int 	count     = 0;
int	 	secondMin = arr[0][0] + arr[0][1];
String  result 	  = "";

for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[0].length; j++) {
        if(arr[i][j] != min) {

            if(secondMin > arr[i][j]) {
                secondMin 	= arr[i][j];
                result 	  	= "(" + i + ", " + j + ")\n";
                count 		= 1;
            } else if (secondMin == arr[i][j]) {
                result += "(" + i + ", " + j + ")\n";
                count++;
            }
        }
    }
}

System.out.println("2nd Min Value: " + secondMin);
System.out.println("Time sequence: " + count);
System.out.println("Position of 2nd Min Value: \n" + result);
```

