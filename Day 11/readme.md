# Bổi 11 - Tính đa hình

> ### 1. Định nghĩa, ý nghĩa của tính chất đa hình
- Liên kết chặt chẽ với tính **kế thừa**
- Đa hình là việc triệu gọi phương thức ghi đè lại của các lớp con từ một phương thức được định nghĩa trong các lớp cha

**Phạm vi sử dụng:**

- Trong nhiều bài toán, chúng ta sử dụng tính đa hình để định nghĩa một phương thức dùng chung cho nhiều đối tượng khác nhau để dễ quản lý
    
**Ví dụ:**
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
- `interface` là một keyword trong Java giúp ta định nghĩa 1 bộ hành vi chung cho 1 nhóm đối tượng không cùng chung bản chất

**Đặc điểm**

- `interface` không có thuộc tính
- Các phương thức của `interface` bắt buộc là `abstract` 
- Khi code sử dụng từ khóa `implements` để thể hiện `interface`
- Chức năng
- Qui tắc đặt tên, `interface` có chữ i ở đầu.
- Phạm vi truy cập của `interface` là public

**Ví dụ**
```java
public interface IDiChuyen {
    void diChuyen();
}

class Chim implements DiChuyen {
    
    @Override
    public void diChuyen() {
        // Di chuyển 2 chân và cánh
    }
}

class Robot implements Dichuyen() {
    @Override
    public void diChuyen() {
        // Di chuyển bằng động cơ
    }
}
```

> ### 3. Từ khóa `instanceOf`
- `instanceOf` là một keyword trong java giúp kiểm tra xem một đối tượng A có mang hình dạng của đối tượng hoặc bộ hành vi của B hay không
- Dùng để kiểm tra xem thực thể A có đang mang các thuộc tính của đối tượng `HinhVuong` hay không


**Ví dụ**
```java
TuGiac tg1 = new TuGiac();
TuGiac tg2 = new HinhVuong();

boolean ketQua1 = tg2 instanceOf HinhVuong; // ketQua1 = true;
```

> Chú ý 
- Khi sử dụng tính đa hình, có thể ép kiểu từ class cha về class con. Lúc đó các thực thể này sẽ có đầy đủ các thuộc tính và phương thức của lớp con.