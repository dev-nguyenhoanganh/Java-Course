# Bài 3
Xây dựng chương trình quản lý học sinh gồm các đối tượng sau

**`Student`**
---
- Thuộc tính : **`id`**, **`name`**, **`score`**
- Phương thức :
    + **Phương thức khởi tạo 3 tham số** để xác định giá trị cho 3 thuộc tính
    + `@Override` phương thức có sẵn là **`toString`** để trả về thông tin của đối tượng theo định dạng **`id_name_score`** 
    + Các phương thức **`get`** cho từng thuộc tính

**`StudentManager`**
---
- Thuộc tính : **`Student[] students`**
- Phương thức : 
    + **Phương thức tạo** : tạo mới mảng học sinh với `5` phần tử, và khởi tạo nên sẵn từng phần tử trong mảng với dữ liệu tùy ý
    + **`printList()`** : in ra thông tin của 5 học sinh
    + **`findStudentByScore(int score)`** : Trả về học sinh có điểm bằng với tham số được truyền vào. Nếu không có thì trả về giá trị **`null`**

> ### Yêu cầu
- Phân chia các đối tượng vào gói và xây dựng phạm vi truy cập (thuộc tính và phương thức) cho từng đối tượng
- Áp dụng kiến thức mảng vào để xây dựng các phương thức của đối tượng
- Ánh xạ các đối tượng vào Java
- Xây dựng đối tượng **`Main`** để khởi tạo và thực thi các hành vi của đối tượng
