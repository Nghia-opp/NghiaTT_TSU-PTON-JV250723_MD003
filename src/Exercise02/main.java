package Exercise02;

public class main {
    public static void main(String[] args) {
        Book myBook = new Book();

        // thiet lap thuoc tinh
        myBook.setTitle("Java Progarmming");
        myBook.setAuthor("John Doe");

        // thiet lap gia hop le
        myBook.setPrice(29.99);

        // hien thi thong tin sach
        System.out.println("Tieu de: " + myBook.getTitle());
        System.out.println("Tac gia: " + myBook.getAuthor());
        System.out.println("gia: " + myBook.getPrice());

        // thu thay doi gia thanh cong
        myBook.setPrice(35.50);
        System.out.println(("Gia moi: " + myBook.getPrice()));
        // thu thay doi gia khong hop le
        myBook.setPrice(-5.50);
    }
}
