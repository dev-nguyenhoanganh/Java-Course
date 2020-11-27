# Bài 1
Xây dựng chương trình đồ họa có chức năng vẽ các hình bằng các màu khác nhau trên giao diện. Các đối tượng phân tích được gồm:

- Đối tượng hình
    + Hình tròn
    + Hình tam giác
    + Hình chữ nhật
- Đối tượng vẽ
    + Bút xanh
    + Bút đỏ

> Thông số
- Có các loại hình cụ thể sau: Hình tròn, hình tam giác, hình chữ nhật
- Có các loại bút sau: bút màu xanh, bút màu đỏ
- Bút vẽ dùng để vẽ có thuộc tính màu vẽ
- Hình chỉ có một thuộc tính là bút vẽ (Không cần quan tâm đến các đặc điểm như tọa độ, kích thước)
- Đối tượng hình và bút đều có phương thức vẽ
- Khi gọi phương thức vẽ của bút thì in lên màn hình tên màu của bút đó.
- Khi gọi phương thức vẽ của hình thì in lên màn hình theo dạng sau: **"tên hình + được vẽ bằng + màu của bút vẽ"**

> Ví dụ
``` java
    butDo.ve();       // Kết quả in lên màn hình là "màu đỏ"
    hinhChuNhat.ve(); // Kết quả trên màn hình "Hình chữ nhật được vẽ bằng màu xanh"
```

# Lời giải
> Đối tượng bút

```java
public class DrawPen {
	private String color;

	/**
	 * Phương thức khởi tạo đối tượng bút vẽ
	 */
	public DrawPen(String color) {
		this.color = color;
	}
	
	/**
	 * Phương thức vẽ của đối tượng bút vẽ
	 */
	public void draw() {
		System.out.println(color);
	}
	
    /**
	 * @param drawColor the drawColor to set
	 */
	public void setDrawColor(String drawColor) {
		this.color = drawColor;
	}	
}
```

> Đối tượng hình vẽ
```java
public class Shape {
	private DrawPen pen = new DrawPen(null);

	/**
	 * Phương thức khởi tạo đối tượng hình dạng
	 * @param penColor - Màu sắc của bút vẽ
	 */
	public Shape(String penColor) {
		pen.setDrawColor(penColor);
	}
	
	/**
	 * Phương thức vẽ của đối tượng hình dạng
	 */
	public void draw() {
		pen.draw();
	}
}
```
> Đối tượng hình tam giác
```java
public class TriangleShape extends Shape {

    /**
     * Phương thức khởi tạo thực thể hình tam giác
     * @param color - Màu sắc của bút vẽ
     */
	public TriangleShape(String color) {
		super(color);
	}
    
    /**
     * Phương thức vẽ của đối tượng hình tam giác
     */
    @Override
	public void draw() {
		System.out.print("\nHình tam giác" + " được vẽ bằng ");
		super.draw();
	}
}
```
> Đối tượng hình chữ nhật
```java
public class RectangleShape extends Shape {

    /**
     * Phương thức khởi tạo hình chữ nhật
     * @param color - Màu sắc của bút vẽ
     */
	public RectangleShape(String color) {
		super(color);
	}
    
    /**
     * Phương thức vẽ của hình chữ nhật
     */
    @Override
	public void draw() {
		System.out.print("\nHình chữ nhật" + " được vẽ bằng ");
		super.draw();
	}
}
```
> Đối tượng hình tròn
```java
public class CircleShape extends Shape {
	
	/**
	 * Phương thức khởi tạo thực thể hình tròn
	 * @param color - Màu sắc của bút vẽ
	 */
	public CircleShape(String color) {
		super(color);
	}
	

	/**
	 * Phương thức vẽ của hình tròn
	 */
	@Override
	public void draw() {
		System.out.print("\nHình tròn" + " được vẽ bằng ");
		super.draw();
	}
}
```