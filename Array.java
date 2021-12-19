package com.Java;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][]Arr = new int[4][4];
        System.out.println("mengisi data nilai");
        System.out.println("array 1 and 2");
        for(int a=0;a<Arr.length;a++){
            Arr[a][2] = input.nextInt();
        }
        System.out.println("array 1 and 1");
        for(int a=0;a<Arr.length;a++){
            Arr[a][1] = input.nextInt();
        }
        int hasil;
        System.out.println("hasil penjumlahan dari 1 dan 2 dengan 1 dan 1");
       for(int a=0;a<Arr.length;a++){
           hasil = Arr[a][1] + Arr[a][2];
           System.out.println(hasil);
       }
        input.close();
    }
}
