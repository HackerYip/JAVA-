package user;

import java.util.Scanner;

public class AdminUser extends User{

    public AdminUser(String name) {
        super(name);
    }
    public int menu(){
        System.out.println("hello "+this.name+"欢迎来到图书小练习");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示图书");
        System.out.println("0.退出系统");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
