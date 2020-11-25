# Buổi 10 - Cấu trúc vòng lặp trong java
> ## 1. Cấu trúc vòng lặp `do - while`

```java
Giá_trị_khởi_tạo;
do {
	// Công việc cần thực hiện
	Biểu_thức_bước_nhảy;
} while(Biểu_thức_điều_kiện_lặp);
```
- Tương tự các vòng lặp `while`, `for` tuy nhiên `do - while` khác ở chỗ là thực hiện công việc ít nhất một lần rồi mới kiểm tra điều kiện của biểu thức điều kiện.
> ## 2. Từ khóa `break`
- Lệnh `break` được dùng để ngắt khỏi vòng lặp `for`, `while`, `do - while` khi cần thiết
- Nếu có nhiều vòng lặp lồng nhau, thì `break` chỉ thoát được vòng lặp mà nó nằm trong đó.
- Được sử dụng cho các bài toán không biết trước đến khi nào thì cần phải dừng, hoặc biểu thức điều kiện lặp quá phức tạp phải biểu diễn bên trong vòng lặp
> ## 3. Từ khóa `continue`
- Lệnh `continue` được sử dụng để ngắt khỏi vòng lặp hiện tại rồi bắt đầu một vòng mới trong cấu trúc `for`, `while`, `do - while` khi cần thiết.
- Được sử dụng khi giá trị bên trong thân vòng lặp không thích hợp để thực hiện tiếp công việc cần bỏ qua để sang một lần tiếp theo.
