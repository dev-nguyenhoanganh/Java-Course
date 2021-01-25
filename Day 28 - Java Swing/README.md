# Buổi 28 - JavaSwing 4

> ### `I`. JList, JCombobox, JTable

1. JList
- Định nghĩa 
    + Giúp hiển thị dữ liệu danh sách theo chiều dọc hoặc chiều ngang
    + Cú pháp : `JList listName = new JList();`

- Các phương thức đặc trưng của `JList`

<table>
    <thead>
        <tr>  
            <th> Phương thức
            <th> Ý nghĩa
    <tbody>            
        <tr>
            <td> <code>setModel(DefaultListModel[KDL] model)</code>
            <td> Định nghĩa danh sách dữ liệu hiển thị trong 
            <code>JList</code>. Dữ liệu được hiển thị ra màn hình sẽ lấy từ <code>DefaultListModel</code>
        <tr>
            <td> <code>setSelectionMode (int mode)</code> 
            <td> Định nghĩa kiểu chọn <code>Item</code> trong danh sách
        <tr>
            <td> <code>setFixedCellHeight (int h)</code>
            <td> Cài đặt chiều cao cho khung chứa 1 <code>item</code>
        <tr>
            <td> <code>setFixedCellWidth (int w)</code> 
            <td> Cài đặt chiều rộng cho 1 khung chứa <code>item</code>
        <tr>
            <td> <code>setVisibleRowCount (int row)</code>
            <td> Cài đặt số lượng <code>item</code> có thể hiển thị trên 
            <code>list</code> mà không cần thanh cuộn
        <tr>
            <td> <code>setLayoutOrientation (int orient)</code>
            <td> Cài đặt hướng ưu tiên hiển thị các <code>item</code> 
            trong danh sách 
            <code>HORIZONTAL_WRAP</code>,
            <code>VERTICAL</code>,
            <code>VERTICAL_WRAP</code>
</table>

---

## Note 

Nếu như kích thước của <code>JList</code> không đủ để chứa tất cả dữ liệu thì phải dùng <code>scrollbar</code> 
```java
        JScrollPane sPane = new JScrollPane(jList);
```

Sau đó có thể `setSize`, `setLocation`, và `add` `JScrollPane` vào thay thế cho `JList` để hiển thị

> ### `II`. Sử dụng thanh cuộn JScrollPane

