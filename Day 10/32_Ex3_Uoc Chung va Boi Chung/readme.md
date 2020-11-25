# Bài 3
Viết chương trình tính:

- Ước chung lớn nhất của 2 số a, b. [[1]](#Phương-thức-1)
- Bội chung nhỏ nhất của 2 số a, b. [[2]](#Phương-thức-2)

# Nội dung phương thức
### Phương thức 1
> Ước chung lớn nhất của 2 số a, b

```java
    /**
	 * Phương thức tìm ước chung lớn nhất của 2 số num1 và num2
	 * @return - Ước chung lớn nhất của 2 số num1 và num2
	 */
	public int timUCLN() {
		int max  = (num1 <= num2) ? num2 : num1;
		int UCLN = 1;
		for(int i = 1; i <= max; i++) {
			if((num1 % i == 0) && (num2 % i == 0)) {
				UCLN = i;
			}
		}
		return UCLN;
	}
```
### Phương thức 2
> Bội chung nhỏ nhất của 2 số a, b

```java
    /**
	 * Phương thức tìm bội chung nhỏ nhất của 2 số num1 và num2
	 * @return - Bội chung nhỏ nhất của 2 số num1 và num2
	 */
	public int timBCNN() {
		int UCLN = timUCLN();
		return num1 * num2 / UCLN;
	}
```
### Phương thức khác
> Hiển thị kết quả ra console

```java
    /**
	 * Phương thức hiển thị kết quả tính ra màn hình console
	 */
	public void result() {
		System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là: " + timUCLN());
		System.out.println("Bội chung nhỏ nhất của " + num1 + " và " + num2 + " là: " + timBCNN());
	}
```