import java.util.Scanner;
public class Tugas5{

     public static void main(String []args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukkan angka awal : ");
        int a =scanner.nextInt();
        int hasil = HitungMundur(a);
        for (int i = hasil; i>= 1; i--) {
            System.out.println(i);
        }
     }
     
     public static int HitungMundur(int a1) {
      int angka = a1;
      
      return angka; 
     }
}
