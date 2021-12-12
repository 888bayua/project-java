package com.tutorial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Halaman();
    }
    private static void Halaman(){
        
        Scanner input = new Scanner(System.in); 
        System.out.print("masukan nilai a : ");
        double a = input.nextDouble();
        System.out.print("masukan nilai b : ");
        double b = input.nextDouble();
        double hasil = phytagoras(a,b);
        System.out.println("nilai c adalah : ");
        System.out.println(hasil);
        input.close();
    }

    private static double phytagoras(double a,double b){
        double hasilFinal;
        double hasil;
        hasil = Math.pow(a,2) + Math.pow(b,2);
        hasilFinal = Math.sqrt(hasil);
        return hasilFinal;
    }

    
}
