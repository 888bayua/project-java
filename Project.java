import java.util.Scanner;
import java.util.stream.IntStream;


public class Project {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("program penilaian");
        System.out.println("nama: ");
        String nama = input.nextLine();
        int [] NIlai = new int[10];
        int No = 1;
        int No1 = 1;
        
        String[] Nama = {"matematika","fisika","kimia","biologi","indonesia",
                         "ekonomi","komputer","inggris","sejarah","psikologi"};
        for(int a = 0; a<=9;a++){
            System.out.print( No+". "+Nama[a] + " : ");
            No++;
            NIlai[a] = input.nextInt();
        }
       
        System.out.println("nama : " +nama);
      
        int total = IntStream.of(NIlai).sum();
        double Rata2 = total/10;
        
        for(int a = 0; a<=9;a++){
            System.out.println(No1+". "+Nama[a] + " : " + NIlai[a] );
            No1++;  
        }
        System.out.println("rata - rata : " +Rata2);
        String status = null;
        if(Rata2 >50){
            status = "lulus";
        }else if(Rata2 < 50){
            status = "tidak lulus";
        }
        double persen;
        persen = (Rata2/100)*100;
        System.out.println("status : "+ status );
        System.out.println( persen + " % lulus minimal 50%" );
        
        int max = 0;
        int min = NIlai[0];

        for(int a = 0;a<=9;a++){
            if(max<NIlai[a]){
                max =NIlai[a];
             }
             if(min>NIlai[a]){
                min = NIlai[a];
            }}
       
            System.out.println("nilai tertinggi : " + max);
            System.out.println("nilai terendah : " + min);

            if(Rata2 < 10){
                System.out.println("sanggat bodoh ):");
            }else if (Rata2 < 30){
                System.out.println("bodoh ):");
            }else if(Rata2<50){
                System.out.println("sedikit bodoh ):");
            }else if(Rata2<60){
                System.out.println("tidak bodoh /pertengahan");
            }else if(Rata2<70){
                System.out.println("sedikit pintar (:");
            }else if(Rata2<80){
                System.out.println("pintar (:");
            }else if(Rata2<=90){
                System.out.println("sanggat pintar (:");
            }else if(Rata2<100){
                System.out.println("SEMPURNA (:");
            }
            input.close();

        }

}
