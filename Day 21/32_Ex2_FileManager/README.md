# Bài 2

Viết chương trình FileManager làm các công việc sau:

- Đối tượng FileManager
    + Thuộc tính:
        * File fileSrc dùng để trỏ đến tập tin gốc.
    + Phương thức:
        * Phương thức khởi tạo truyền vào một tham số kiểu String đó là: 
        `public FileManager(String pathSrc)` phương thức này làm nhiệm vụ từ đường dẫn được truyền vào, khởi tạo nên thực thể fileSrc tương ứng.

        * Phương thức `ArrayList<File> findByExtension(String extension)` là phương thức tìm kiếm và trả về danh sách các file mà tại nơi `fileSrc` đang trỏ tới có đuôi mở rộng trùng với **extension**

        * Phương thức `File[] sortByNameSize()` là phương thức sẽ sắp xếp và trả về danh sách các file đã được sắp xếp theo tên file và kích thước (Ưu tiên theo tên trước)
    