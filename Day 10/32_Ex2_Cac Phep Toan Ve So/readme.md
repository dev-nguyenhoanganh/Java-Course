# Bài 2
Viết thêm các phương thức sau cho project **CacPhepToanVeSo**

- KiemTraSNT() : Để kiểm tra xem số A có phải số nguyên tố hay không?

    (Hành vi này xây dựng trả về kết quả) [[1]](#Phương-thức-1)
- phanTichThuaSoNguyenTo() : Để phân tích số A ra thành các thừa số nguyên tố 

    (Tái sử dụng hành vi ***kiemTraSNT()*** nếu cần) [[2]](#Phương-thức-2)
    + Ví dụ
    ```java
        15 = 3 * 5;
        20 = 2 * 2 * 5;
    ```

# Nội dung phương thức
### Phương thức 1
> KiemTraSNT()

```java
    /**
	 * Phương thức kiểm tra xem số nguyên nhập vào có phải là
	 * số nguyên tố hay không 
	 * @param number - Giá trị số nguyên cần kiểm tra
	 * @return <ul><li>true - Là số nguyên tố</li>
	 * <li>false - Không phải số nguyên tố</li></ul>
	 */
	private boolean kiemTraSNT(int number) {
		if(number < 2) return false;
		for(int i = 2; i < number; i++) {
			if(number % i == 0) return false;
		}
		return true;
	}
```
### Phương thức 2
> phanTichThuaSoNguyenTo()

```java
    /**
	 * Phương thức thực hiện hành vi phân tích thuộc tính <b>number</b>
	 * thành các thừa số nguyên tố
	 */
	public void phanTichThuaSo() {
		String 	factor  	  = "";
		boolean isFirstNumber = true;
		int 	tempNumber    = number;
		
		for (int i = 2; i <= number/2; i++) 
		{
			if(tempNumber % i == 0) {
				if(isFirstNumber) {
					isFirstNumber = false;
					tempNumber 	  = tempNumber / i;
					factor 		 += i--;
					continue;
				}
				tempNumber = tempNumber / i;
				factor 	  += " * "  + i--; 
			}
		}
		if(factor == "") factor = "1 * " + number;

		System.out.print("Thừa số nguyên tố của " + number + " là: ");
		System.out.println(factor);
	}
```
