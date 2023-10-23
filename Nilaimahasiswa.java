import java.util.Scanner;

public class Nilaimahasiswa {
    public static void main(String[] args){
         
        Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan Nama             : ");
        String nama= input.nextLine();

        System.out.print("Masukkan NIM              : ");
        Integer nim = input.nextInt();

        
        System.out.print("Masukkan Nilai Tugasbesar : ");
        double Tugasbesar = input.nextDouble();

        System.out.print("Masukkan Nilai Quiz   : ");
        double Quiz  = input.nextDouble();

        System.out.print("Masukkan Nilai Tugas  : ");
        double Tugas = input.nextDouble();

        System.out.print("Masukkan Nilai UTS    : ");
        double UTS = input.nextDouble();

        System.out.print("Masukkan Nilai UAS    : ");
        double UAS = input.nextDouble();

        
        Nilai Nilai = new Nilai();
        double nilaiAkhir = Nilai.nilaiAkhir(Tugasbesar, Quiz, Tugas, UTS, UAS);
        
        
        System.out.println("Nama        : " + nama);
        System.out.println("NIM         : " + nim);
        System.out.println("Nilai  Matakuliah Pemograman Berorientasi Objek     :" + nilaiAkhir);

        
        input.close();
    }   
}
