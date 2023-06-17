import java.util.ArrayList;
import java.util.Scanner;
// 1. Class & Object
public class Main { 
    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Selamat datang di Showroom Mobil kami!");

        while(true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mobil");
            System.out.println("2. Edit Mobil");
            System.out.println("3. Hapus Mobil");
            System.out.println("4. Lihat Daftar Mobil");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            // 7. Polymorphism
            // 8. ArrayList
            switch (menu) { 
                case 1:
                    System.out.print("Masukkan Merek Mobil: ");
                    String merek = scanner.nextLine();
                    
                    System.out.print("Masukkan Model Mobil: ");
                    String model = scanner.nextLine();
                    
                    System.out.print("Masukkan CC Mobil: ");
                    int cc = scanner.nextInt();
                    
                    showroom.tambahMobil(new Mobil(merek, model, cc)); // 9. Abstract or Interface
                    scanner.nextLine();
                        break;
                case 2:
                    System.out.print("Masukkan Nomor Urut Mobil yang Ingin Diedit: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    if (index < 1 || index > showroom.jumlahMobil()) {
                        System.out.println("Mobil dengan nomor urut tersebut tidak ditemukan.");
                        break;
                    }
                    System.out.print("Masukkan Merek Mobil: ");
                    merek = scanner.nextLine();
                    
                    System.out.print("Masukkan Model Mobil: ");
                    model = scanner.nextLine();
                    
                    System.out.print("Masukkan CC Mobil: ");
                    cc = scanner.nextInt();
                    
                    scanner.nextLine();
                    Mobil mobil = showroom.getMobil(index - 1);
                    mobil.setMerek(merek);
                    mobil.setModel(model);
                    mobil.setCC(cc);
                         break;

                case 3:
                    System.out.print("Masukkan Nomor Urut Mobil yang Ingin Dihapus: ");
                    index = scanner.nextInt();
                    if (index < 1 || index > showroom.jumlahMobil()) {
                        System.out.println("Mobil dengan nomor urut tersebut tidak ditemukan.");
                        break;
                    }
                    showroom.hapusMobil(index - 1);
                        break;

                case 4:
                    if (showroom.jumlahMobil() == 0) {
                        System.out.println("Belum ada mobil.");
                        break;
                    }
                    System.out.println("Daftar Mobil:");
                    showroom.infoMobil();
                        break;

                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    return;
                default:
                    System.out.println("Menu tidak valid. Silahkan coba lagi.");
                        break;

            }
        }
    }
}