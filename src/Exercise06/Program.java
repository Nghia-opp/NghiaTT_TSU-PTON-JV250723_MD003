package Exercise06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    private static List<Category> categories = new ArrayList<>();
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
//        List<Category> categories = new ArrayList<>();
        //Category[] categories = new Category[100];
        do {
            System.out.println("Menu:");
            System.out.println("1. Add Category");
            System.out.println("2. List Category");
            System.out.println("3. Update Category");
            System.out.println("4. Delete Category");
            System.out.println("5. Search Category");
            System.out.println("6. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    // khoi tao doi tuong sv
                    Category category = new Category();
                    // nhap vao thong tin
                    category.inputDate(sc);
                    // day doi tuong vao list
                    categories.add(category);
                    break;
                case 2:
                    for(Category cate : categories){
                        cate.display();
                    }
                    break;
                case 3:
                    System.out.println("Nhap vao ma DM can sua: ");
                    int id = Integer.parseInt(sc.nextLine());
//                    for(Category cate : categories){
//                        if(cate.getId() == id){
//                            //cate.inputDate(sc); neu sua Id
//                            System.out.println("Nhap ten: ");
//                            cate.setName(sc.nextLine());
//                            System.out.println("Nhap mo ta: ");
//                            cate.setDescription(sc.nextLine());
//                        }
//                    }
                    Category categoryEdit = findCategoryById(id);
                    if(categoryEdit != null){
                        System.out.println("Nhap ten: ");
                        categoryEdit.setName(sc.nextLine());
                        System.out.println("Nhap mo ta: ");
                        categoryEdit.setDescription(sc.nextLine());
                    }else {
                        System.out.println("Khong tim thay danh muc");
                    }
                    break;
                case 4:
                    // nhap vao ma
                    System.out.println("Nhap vao ma DM can xoa: ");
                    int x = Integer.parseInt(sc.nextLine());
//                    for(Category cate : categories){
//                        if (cate.getId() == x){
//                            categories.remove(cate);
//                        }
//                    }
                    Category categoryDelete = findCategoryById(x);
                    if(categoryDelete != null){
                        categories.remove(categoryDelete);
                    }else {
                        System.out.println("Khong tim thay danh muc");
                    }

                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                    default:
                        System.out.println("Invalid choice");
            }
        }while(true);
    }
    static Category findCategoryById(int id) {
        for(Category cate : categories){
            if (cate.getId() == id){
                return  cate;
            }
        }
        return null;
    }

}
