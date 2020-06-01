/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLPhanSo {
    public static void main(String[] args) {
    int n; 
    Scanner sc = new Scanner(System.in);
    ArrayList<PhanSo> dsPhanSo = new ArrayList<>();
    dsPhanSo.add(new PhanSo(1, 2));
    dsPhanSo.add(new PhanSo(1, 4));
    dsPhanSo.add(new PhanSo(1, 3));
    dsPhanSo.add(new PhanSo(5, 2));
    dsPhanSo.add(new PhanSo(1, 5));
    do{
        System.out.println("1/Them 1 PS. ");
        System.out.println("2/SL PhanSo co trong DS.");
        System.out.println("3/Hien thi DS. ");
        System.out.println("4/Tong");
        System.out.println("5/Hieu");
        System.out.println("6/Tich");
        System.out.println("7/Thuong");
        System.out.println("Nhap lua chon: ");
        sc = new Scanner(System.in);
        n= sc.nextInt();
        switch(n){
            case 1: 
                int tuSo;
                int mauSo;
                sc = new Scanner(System.in);
                PhanSo ps = new PhanSo();
                System.out.println("Them 1 PS---");
                System.out.println("Nhap tu: ");
                tuSo = sc.nextInt();
                System.out.println("Nhap mau: ");
                mauSo = sc.nextInt();
                ps.setTuSo(tuSo);
                ps.setMauSo(mauSo);
                dsPhanSo.add(ps);
                break;
                
            case 4:
                int a;
                
        }
    }while(n!=0);
}
}