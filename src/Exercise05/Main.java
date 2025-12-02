package Exercise05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("MENU: ");
            System.out.println("1. Them moi san pham");
            System.out.println("2. Hien thi danh sach san pham");
            System.out.println("3. Cap nhat san pham");
            System.out.println("4. Xoa san pham");
            System.out.println("5. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch(choice){
                case 1:
                    Product product = new Product();
                    product.inputProduct(scanner);
                    products.add(product);
                    break;
                case 2:
                    if (products.isEmpty()) {
                        System.out.println("Khong co danh sach san pham");
                    }else {
                        for (Product p : products) {
                            System.out.println("Danh sach san pham");
                            p.displayProduct(scanner);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Nhap ID san pham cap nhap: ");
                    int updateId = Integer.parseInt(scanner.nextLine());
                    boolean update = false;
                    for(Product p : products){
                        if (p.getProductID() == updateId){
                            System.out.print("Nhap ten moi san pham cap nhap: ");
                            String newName = scanner.nextLine();
                            System.out.print("Nhap gia moi san pham cap nhap: ");
                            int newPrice = Integer.parseInt(scanner.nextLine());
                            p.setProductName(newName);
                            p.setProductPrice(newPrice);
                            System.out.println("San pham da duoc update");
                            update = true;
                            break;
                        }
                    }
                    if (!update){
                        System.out.println("Khong co danh sach san pham");
                    }
                    break;
                case 4:
                    System.out.print("Nhap ID san pham can xoa: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    boolean deleted = false;
                    for(int i = 0; i < products.size(); i++){
                        if (products.get(i).getProductID() == deleteId){
                            products.remove(deleteId);
                            System.out.println("Da xoa san pham co id = " + deleteId);
                            deleted = true;
                            break;
                        }
                    }
                    if(!deleted){
                        System.out.println("Khong co danh sach san pham");
                    }
                    break;
                case 5:
                    System.exit(0);
                    System.out.print("Thoat khoi chuong trinh");
                    break;
                    default:
                        System.out.println("Lua chon khong hop le");
            }
        }while(true);
    }
}
