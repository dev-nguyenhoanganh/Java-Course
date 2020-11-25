# Bài 1
Xây dựng chương trình Utils các thuộc tính là một số tự nhiên N và các hành vi sau:

- Nhập vào số tự nhiên N [[1]](#Phương-thức-1)
- Kiểm tra số tự nhiên N có phải số nguyên tố hay không? [[2]](#Phương-thức-2)
- Liệt kê các số nguyên tố nhỏ hơn N [[3]](#Phương-thức-3)
- Tìm tất cả các số tự nhiên nhỏ hơn N thỏa mãn là cạnh của hình vuông sao cho diện tích của hình nằm trong khoảng `[100, 200]` [[4]](#Phương-thức-4)
- Tìm tất cả các cặp 3 số tự nhiên nhỏ hơn N thỏa mãn là 3 cạnh của một tam giác [[5]](#Phương-thức-5)

# Nội dung phương thức
### Phương thức 1
> Nhập vào số tự nhiên N

```java
    /**
	 * Phương thức khởi tạo có tham số
	 * @param number - Giá trị khởi tạo truyền vào
	 */
	public Utils(int number) {
		this.number = number;
	}
```
### Phương thức 2
> Kiểm tra số tự nhiên N có phải số nguyên tố hay không?

```java
    /**
	 * Phương thức kiểm tra số nguyên tố
	 * @param number - Số cần kiểm tra
	 * @return <ul><li><b>true</b> - Là số nguyên tố</li>
	 * <li><b>false</b> - Không phải số nguyên tố</li></ul>
	 */
	public boolean isPrimeNumber(int number) {
		if(number < 2) return false;
		for(int i = 2; i < Math.sqrt(number); i++) {
			if(number % i == 0) return false;
		}
		return true;
	}
```
### Phương thức 3
> Liệt kê các số nguyên tố nhỏ hơn N

```java
    /**
	 * Phương thức in ra console danh sách các số nguyên tố 
	 * nhỏ hơn <b>number</b>
	 * @param number - Giá trị truyền vào làm ngưỡng dưới cho danh sách
	 */
	public void listPrimeLessThanNumber(int number) {
		String listNumber = "[2";
		for(int i = 3; i <= number; i++) {
			if(isPrimeNumber(i)) {
				listNumber += ", " + i;
			}
		}
		System.out.println("Các số nguyên tố nhỏ hơn " + number + " là: " + listNumber + "]");
	}
```

### Phương thức 4
> Tìm tất cả các số tự nhiên nhỏ hơn N thỏa mãn là cạnh của hình vuông sao cho diện tích của hình nằm trong khoảng `[100, 200]` 

```java
    /**
	 * Phương thức liệt kê các cạnh hình vuông, sao cho diện tích cạnh hình
	 * vuông này nằm trong khoảng [100, 200]
	 * @param number - Giá trị truyền vào làm ngưỡng dưới cho các số nguyên
	 */
	public void listSquareEdge(int number) {
		String listSquareEdge = "";
		boolean isFirstNumber = true;
		for(int i = 10; i < number; i++) {
			if((100 <= i*i) && (i*i <= 200)) {
				if(isFirstNumber) {
					listSquareEdge = "[" + i;
					isFirstNumber  = false;
					continue;
				}
				listSquareEdge += ", " + i;
				continue;
			}
			if(i*i > 200) break;
		}
		System.out.print("Danh sách các số nhỏ hơn " + number + " thỏa mãn điều kiện là: ");
		System.out.println(listSquareEdge + "]");
	}
```

### Phương thức 5
> Tìm tất cả các cặp 3 số tự nhiên nhỏ hơn N thỏa mãn là 3 cạnh của một tam giác

```java
    /**
	 * Phương thức in ra màn hình console danh sách các số nhỏ hơn <b>number</b> 
	 * thỏa mãn điều kiện là 3 cạnh của một tam giác
	 * @param number - Giá trị truyền vào làm ngưỡng dưới cho các số nguyên
	 */
	public void listTriangleEdge(int number) {
		String listTriangleEdge = "";
		boolean isFirstEdge = true;
		for(int i = 1; i < number; i++) 
		{
			for(int j = i; j < number; j++) 
			{
				for(int k = j; k < number; k++) 
				{
					if(isTriangle(i, j, k)) {
						if(isFirstEdge) {
							isFirstEdge = false;
							listTriangleEdge += "(" + i + ", " + j + ", " + k + ")";
							continue;
						}
						listTriangleEdge += ", (" + i + ", " + j + ", " + k + ")"; 
					}
				}
			}
		}
		System.out.println("Danh sách các số nhỏ hơn " + number + " thỏa mãn điều kiện là 3 cạnh của tam giác: ");
		System.out.println(listTriangleEdge);
	}
	
	/**
	 * Phương thức kiểm tra xem 3 cạnh truyền vào có phải của một tam giác 
	 * hay không
	 * @param a - Độ dài cạnh a của tam giác
	 * @param b - Độ dài cạnh b của tam giác
	 * @param c - Độ dài cạnh c của tam giác
	 * @return <ul><li>true - Là 3 cạnh của 1 tam giác</li>
	 * <li>false - Không phải 3 cạnh của một tam giác</li></ul>
	 */
	private boolean isTriangle(int a, int b, int c) {
		if(a < 0 || b < 0 || c < 0) return false;
		else {
			if((a < b + c) && (b < c + a) && (c < a + b)) return true;
		}
		return false;
	}
	
```