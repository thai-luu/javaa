package hust.soict.hedspi.lab01;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args){
        Scanner b1=new Scanner(System.in);

        System.out.println("Chuong trinh tinh tong, tich,hieu,thuong cua 2 so thuc\nMoi ban nhap vao 2 so can tinh:");
        double a=b1.nextDouble();
        double b=b1.nextDouble();
        System.out.println("tong: "+ (a+b));
        System.out.println("hieu: "+(a-b));
        System.out.println("tich: "+(a*b));
        System.out.println("thuong: "+(a/b));
    }
}
