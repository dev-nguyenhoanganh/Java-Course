# Bổi 11 - Tính đa hình

> ### 1. Định nghĩa, ý nghĩa của tính chất đa hình
- Liên kết chặt chẽ với tính **kế thừa**
- Đa hình là việc triệu gọi phương thức ghi đè lại của các lớp con từ một phương thức được định nghĩa trong các lớp cha

**Phạm vi sử dụng:**

- Trong nhiều bài toán, chúng ta sử dụng tính đa hình để định nghĩa một phương thức dùng chung cho nhiều đối tượng khác nhau để dễ quản lý
    
    Ví dụ:
```java
class TuGiac {
    private Dinh dinh1, dinh2, dinh3, dinh4;
    private double chuVi, dienTich;

    public void inTT() {
        // In thông tin tính 4 đỉnh
        // In thông tin chu vi
        // In thông tin tính diện tích
    }

    class HinhVuong extends TuGiac {
        private double doDaiCanh;

        @Override
        public void inTT() {
            super.inTT();
            // In thông tin tính độ dài cạnh
        }
    }

    class HinhChuNhat extends TuGiac {
        private double chieuDai, chieuRong;

        @Override
        public void inTT() {
            super.inTT();
            // In thông tin chiều dài
            // In thông tin chiều rộng
        }
    }

    TuGiac tuGiac1 = new TuGiac();
    TuGiac tuGiac2 = new HinhVuong();
    TuGiac tuGiac3 = new HinhChuNhat();
}
```

> ### 2. Từ khóa `interface`
- 



> ### 3. Từ khóa `instanceOf`
- 

> Chú ý
- Khi sử dụng tính đa hình, có thể ép kiểu từ class cha về class con. Lúc đó các thực thể này sẽ có đầy đủ các thuộc tính và phương thức của lớp con.