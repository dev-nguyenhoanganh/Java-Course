# Bài 4
Xây dựng đối tượng gồm có một huộc tính là số N và có các hành vi sau đây

- **checkSymmetry()** : Là phương thức kiểm tra xem N có phải số đối xứng hay không? [[1]](#Phương-thức-1)

    Lưu ý phải từ 2 chữ số trở lên. Ví dụ về các số đối xứng
    ```
        1221     121     12321     332233
    ``` 
- **findLargeArea()** : Là phương thức tìm và in ra các cặp số tự nhiên `(a,b)` từ 1 đến N thỏa mãn [[2]](#Phương-thức-2)
    + Tổng của `a + b < 50`
    + Số các ước chung của `a và b > 3`

- **findRectangle()** : Là phương thức tìm kiếm và in ra cặp 3 số tự nhiên 
`(a, b, c)` từ 1 đến N thỏa mãn là 3 số khác nhau và là 3 cạnh của một tam giác [[3]](#Phương-thức-3)


# Nội dung phương thức
### Phương thức 1
> **checkSymmetry()**

```java
/**
 * Phương thức kiểm tra xem N có phải số đối xứng hay không
 * <ul> Cách thức kiểm tra:
 * <li> Sử dụng 1 vòng while() để tìm chiều dài của số nguyên nhập vào </li>
 * <li> Dựa vào kích thước tìm được tính ra các số nguyên đứng đầu và 
 *      đứng cuối </li>
 * <li> So sánh chúng với nhau, nếu khác thì return false, 
 * 		nếu tất cả đều đúng thì return true </li></ul>
 * @return <ul>
 *  <li>true - Là số đối xứng</li>
 * 	<li>false - Không phải số đối xứng</li></ul>
 */
public boolean checkSymmetry() {
    if(number < 10) return false;
    int length = lengthOfNumber(number);
    int start, end;

    for(int i = length - 1; i > 0; i-=2) {
        start = (int) (number / Math.pow(10, i));
        end   = (int) (number % 10);

        if(start == end) 
        {
            number -= start * Math.pow(10, i);
            number /= 10;
            continue;
        }
        else return false;
    }
    return true;
}

/**
 * Phương thức tìm độ dài của một số nguyên
 * @param number - Giá trị của số nguyên
 * @return - Kích thước của số nguyên
 */
private int lengthOfNumber(long number) {
    int length = 1;
    while (number >= 10) {
        number /= 10;
        length++;
    }
    return length;
}
```
### Phương thức 2
> **findLargeArea()**

```java
/**
 * Phương thức tìm và trả về các cặp số tự nhiên thỏa mãn điều kiện: 
 * Tổng a + b < 50, 
 * Số các ước chung của a và b > 3
 * @return Các cặp số tự nhiên thỏa mãn điều kiện
 */
public String findLargeArea() {
    String result = "";
    boolean firstPair = true;
    for(int i = 6; i < 50; i++) 
    {
        for(int j = i; j < 50; j++) 
        {
            int count = 0;
            if(i + j < 50) 
            {
                for(int k = 1; k < i; k++)
                {
                    if((i % k == 0) && (j % k == 0)) 
                    {
                        if(++count > 3) 
                        {
                            if(firstPair) {
                                result += "(" + i + ", " + j + ")";
                                firstPair = false;
                            }
                            else
                                result += ", (" + i + ", " + j + ")";
                            count = 0; break;
                        }
                    }
                }
            }
            else break;
        }
    }
    return result;
}
```
### Phương thức 3
> **findRectangle()**

```java
/**
 * Phương thức tìm kiếm và in ra cặp 3 số tự nhiên (a, b, c) 
 * thỏa mãn điều kiện là 3 số khác nhau và là 3 cạnh của một tam giác
 * @return Chuỗi lưu giá trị các cặp 3 số tự nhiên theo định dạng
 * 		   (a1, b1, c1), (a2, b2, c2), ...
 */
public String findRectangle() {
    String result = "";
    boolean isFirstEdge = true;
    for(int i = 1; i < number; i++) 
    {
        for(int j = i + 1; j < number; j++) 
        {
            for(int k = j + 1; k < number; k++) 
            {
                if(isTriangle(i, j, k)) {
                    if(isFirstEdge) {
                        isFirstEdge = false;
                        result += "(" + i + ", " + j + ", " + k + ")";
                        continue;
                    }
                    result += ", (" + i + ", " + j + ", " + k + ")"; 
                }
            }
        }
    }
    return result;
}

/**
 * Phương thức kiểm tra xem 3 cạnh truyền vào có phải của một tam giác 
 * hay không
 * @param a - Độ dài cạnh a của tam giác
 * @param b - Độ dài cạnh b của tam giác
 * @param c - Độ dài cạnh c của tam giác
 * @return true - Là 3 cạnh của 1 tam giác
 * <li>false - Không phải 3 cạnh của một tam giác</li>
 */
private boolean isTriangle(int a, int b, int c) {
    if(a < 0 || b < 0 || c < 0) return false;
    else {
        if((a < b + c) && (b < c + a) && (c < a + b)) return true;
    }
    return false;
}
```