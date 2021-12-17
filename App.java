package com.Java;

import java.util.Scanner;


public  class App {

    private static void No1() throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("masukan angka yang akan di hitung ");
        int a = input.nextInt();
        System.out.println("dan ");
        int b = input.nextInt();
        System.out.println("angka yang akan anda masukan adalah " + a +" dan " + b);
        Aritmatika(a,b);
        input.close();
    }

    private static void No2() throws Exception{
        Scanner input = new Scanner(System.in);
        System.out.println("pilih salah satu\n\t1.mencari c\n\t2.mencari a\n\t3.mencari b");
        int input2 = input.nextInt();
        if(input2 == 1){
            System.out.println(" mencari sisi miring ");
            System.out.println(" panjang vertikal");
            double a = input.nextDouble();
            System.out.println(" panjang horizontal");
            double b = input.nextDouble();
            System.out.println("angka yang akan anda masukan adalah " + a +" dan " + b);
            C(a, b);
        }else if(input2 == 2){
            System.out.println("mencari panjang vertikal");
            System.out.println("masukan panjang miring segitiga");
            double c = input.nextDouble();
            System.out.println("masukan panjang horizontal");
            double b = input.nextDouble();
            System.out.println("angka yang akan anda masukan adalah " + c +" dan " + b);
            A(c,b);
        }else if(input2 == 3){
            System.out.println("mencari panjang horizontal");
            System.out.println("masukan panjang sisi miring");
            double c = input.nextDouble();
            System.out.println("masukan panjang vertikal");
            double a = input.nextDouble();
            System.out.println("angka yang akan anda masukan adalah " + c +" dan " + a);
            B(c,a);
        }else {
            System.out.println("masukan 1-3");
        }
        input.close();
       

    }

    private static double Aritmatika( double a,double b)throws Exception{
        Scanner input1 = new Scanner(System.in);
        double hasil = 0;
        int input;
        System.out.println("\t1.+\n\t2.-\n\t3.*\n\t4./\n\t5.modulus");
        input = input1.nextInt();
        if (input == 1){
            hasil = a+b;
            input1.close(); 
        }else if(input==2){
            hasil = a-b;
            input1.close();   
        }else if(input ==3){
            hasil = a*b;
            input1.close();
        }else if(input == 4){
            hasil = a/b;
            input1.close();
        }else{
            System.out.println("ketik 1-4");
            input1.close();
        }
        System.out.println(hasil);
        return hasil;
    }
    
    private static double C(double a , double b ){
        double hasil = 0;
        double total;
        total = Math.pow(a, 2)+ Math.pow(b, 2);
        hasil = Math.sqrt(total);
        System.out.print("hasilnya adalah : ");
        System.out.println(hasil);
        return hasil;
    }

    private static double A(double c , double b){
        double hasil = 0;
        double total = Math.pow(c, 2) - Math.pow(b, 2);
        System.out.print("hasilnya adalah : ");
        hasil = Math.sqrt(total);
        System.out.println(hasil);
        return hasil;
    }

    private static double B(double c, double a){
        double hasil = 0;
        double total = Math.pow(c,2) - Math.pow(a, 2);
        hasil = Math.sqrt(total);
        System.out.print("hasil : " + hasil );
        return hasil;

    }

    public static void main (String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("\tselamat datang di kalkulator matematika sederhana");
        System.out.println("\t1.aritmatika\n\t2.pythagorash");
        
              int input1 = input.nextInt();
            if(input1 == 1){
               No1();
            }else if(input1 == 2){
                No2();
            }else{
                System.out.println("ketik 1 dan 2");
            }
            input.close();
            
       
       
}


}
