package tugas1;
import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author FUSION
 */
public class main {

    /**
     * @param args the command line arguments
     */
     
      
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // TODO code application logic here
      
       double r,d,p,l,t ;
       int pilih = 1;
        while(pilih == 1){// Tampilkan output ke user
        System.out.println("|--------------------------|");
        System.out.println(" MENU UTAMA ");
        System.out.println("|--------------------------|");
       System.out.print("\n1. Hitung balok");
        System.out.print("\n2. Hitung tabung");
        System.out.print("\n0. Exit");
        System.out.print("\nPilih : ");
        pilih = keyboard.nextInt(); // menyimpan nilai pada variabel pilih
         switch (pilih) {
                case 1:
        //menyimpan nilai pada variabel p l dan r
        System.out.print("Masukan Panjang : "); p = keyboard.nextDouble();
        System.out.print("Masukan Lebar   : "); l = keyboard.nextDouble();
        System.out.print("Masukan Tinggi  : "); r = keyboard.nextDouble();
        System.out.println("");
        //membuat objek persegipanjang dan balok
        persegipanjang persegipanjang = new persegipanjang(p,l);
        balok balok = new balok(p,l,r);
        //menampilkan hasil 
         System.out.println("luas persegi panjang : " + persegipanjang.luas());
         System.out.println("keliling persegi panjang : " + persegipanjang.keliling());
         System.out.println("Volume Balok = " + balok.volume());
         System.out.println("Luas Permukaan Balok = " + balok.luaspermukaan());
          System.out.println("Ulangi ? (Ya = 1 || Tidak=0)");
          pilih = keyboard.nextInt();
                    break;
                case 2:
                  
        System.out.print("Masukan Tinggi : "); t = keyboard.nextDouble();
        System.out.print("Masukan Jari - Jari : "); d = keyboard.nextDouble();
        lingkaran lingkaran = new lingkaran(d);
        tabung tabung = new tabung(t,d);
        System.out.println("Luas Lingkaran = " + lingkaran.luas()); 
        System.out.println("Keliling Lingkaran = " +  lingkaran.keliling());
        System.out.println("Volume Tabung = " + tabung.volume());
        System.out.println("Luas Permukaan Tabung = " + tabung.luaspermukaan());
        System.out.println("Ulangi ? (Ya = 1 || Tidak=0)");
          pilih = keyboard.nextInt();
                    break;
                case 0:
                    exit(0);
                default:
                    System.out.print("Opsi yang anda masukkan tidak benar, Mohon masukkan opsi yang benar!\n");
                    break;
            }
    }
        }
}

        
    
        
      
    

