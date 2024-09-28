import java.util.Scanner;

public class PemilihanBilangan02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        String hasil;
        int angka = sc.nextInt();
        if (angka % 2 == 0)
        {
            System.out.println("Angka "+ angka + " termasuk bilangan genap");
        }
        else 
        {
            System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        }
         
        // Menggunakan operator ternary
        hasil = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " termasuk bilangan " + hasil);
    }
}  
