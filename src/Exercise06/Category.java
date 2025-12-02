package Exercise06;

import java.util.Scanner;

public class Category {
    private int id;
    private String name;
    private String description;



    public Category() {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void inputDate(Scanner scanner){
        System.out.print("Nhap vao ma DM: ");
        id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap vao ten DM: ");
        name = scanner.next();
        System.out.print("Nhap vao mo ta: ");
        description = scanner.next();
    }
    public void display(){
        System.out.println("ID: "+id +"Name: "+name +"Description: "+description);
    }
}
