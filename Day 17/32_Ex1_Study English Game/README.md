# Bài 1
Một game học tiếng Anh được mô tả như sau

Màn hình sẽ hiển thị một từ tiếng Anh và hai từ tiếng Việt, trong hai từ tiếng Việt sẽ có một từ là nghĩa của từ tiếng Anh ở trên. Nhiệm vụ của người chơi đơn giản là tìm ra từ tiếng Việt đó.

<u>Yêu cầu chung:</u>
* Đối tượng **Word** mô tả một từ bao gồm:
    - Thuộc tính:
        + **word** : Là từ tiếng Anh
        + **vnMean**  : Là nghĩa tiếng Việt
    - Phương thức: 
        + Phương thức khởi tạo có 2 tham số
        + Các phương thức get, set cho thuộc tính

* Đối tượng **WordManager** để lưu danh sách những từ tiếng Anh trong cùng một chuyên ngành bao gồm:
    - Thuộc tính: 
        + `ArrayList<Word> listWord` 
        + `String category` : Thể hiện tên chuyên ngành
    - Phương thức:
        + Phương thức khởi tạo gồm một phần tử `WordManager(String category)` để gán giá trị cho thuộc tính tên chuyên ngành và khởi tạo **listWord**
        + Phương thức thêm một từ vào danh sách `void addWord(String word, String vnMean)`
            + Phương thức này thêm một phần tử vào `listWord`
            + Tạo một đối tượng **Word** dựa trên 2 thuộc tính đầu vào
            + Gọi phương thức `add(...)` của ArrayList và tiến hành add từ vừa được khởi tạo vào `listWord`
            + Chú ý phần tử này <b>chỉ được thêm</b> vào list trong trường hợp trong list chưa có phần tử word nào có giá trị thuộc tính word trùng với giá trị word là tham số đầu vào.
        + Phương thức lấy hai từ bất kỳ `Word[] getTwoWordRandom()` - Phương thức này sẽ trả về một mảng word gồm 2 phần tử, mỗi phần tử sẽ là một phần tử bất kỳ trong `listWord` và các từ tiếng Anh của 2 từ trong mảng phải khác nhau
            + Sử dụng phương thức shuffle để trộn các phần tử trong **listWord**
            + Tạo một mảng Word gồm 2 phần tử và tiến hành gán giá trị cho phần tử tại vị trí 0 là phần tử tại vị trí 0 trong `listWord`, giá trị cho phần tử tại vị trí 1 là phần tử tại vị trí 1 trong `listWord`
        + Phương thức `void remove(String word)` dùng để xóa từ trong `listWord` nếu từ đó có thuộc tính word giống với giá trị của tham số được truyền vào

> ### Yêu cầu chung:
- Ánh xạ các đối tượng vào Java code
- Xây dựng đối tượng Main để thực thi chương trình

Dữ liệu mẫu

<table>
    <tr>
        <th>Chủ đề
        <th>Word
        <th>vnMean
    <tr>
        <td>Thể thao
        <td>
            <li>Sport
            <li>Soccer
            <li>Football
            <li>Leg
            <li>Defender
        <td>
            <li>Thể thao
            <li>Bóng đá
            <li>Bóng đá
            <li>Cái chân
            <li>Hậu vệ
</table>

