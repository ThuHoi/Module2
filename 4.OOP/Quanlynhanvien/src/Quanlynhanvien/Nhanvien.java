package Quanlynhanvien;

import java.util.Scanner;

public class Nhanvien {
    private int id;
    private String name;
    private int age;
    private String address;

    public Nhanvien(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void  input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        name = scanner.nextLine();
        System.out.println("Enter id");
        id = scanner.nextInt();
        System.out.println("Enter age");
        age = scanner.nextInt();
        System.out.println("Enter address");
        address = scanner.nextLine();

    }
}

