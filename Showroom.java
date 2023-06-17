import java.util.ArrayList;

// 1. Class & Object
// 6. Inheritance - Showroom inherits ArrayList
public class Showroom extends ArrayList<Mobil> { 
    // 4. Encapsulation
    private ArrayList<Mobil> daftarMobil;

    // 2. Constructor & Instance Method
    public Showroom() { 
        daftarMobil = new ArrayList<>();
    }

    // 5. Static Modifier & final Constant
    public static final int MAX_MOBIL = 100;

    // 2. Constructor & Instance Method
    public void tambahMobil(Mobil mobil) {
        if(daftarMobil.size() < MAX_MOBIL) {
            daftarMobil.add(mobil);
        } else {
            System.out.println("Showroom penuh!");
        }
    }

    // 2. Constructor & Instance Method
    public void hapusMobil(int index) { 
        daftarMobil.remove(index);
    }

    public Mobil getMobil(int index) {
        return daftarMobil.get(index);
    }

    // 2. Constructor & Instance Method
    public void infoMobil() {
        System.out.printf("| %-3s | %-15s | %-15s | %-5s |\n", "NO", "MERK", "MODEL", "CC");
        for (int i = 0; i < daftarMobil.size(); i++) {
            Mobil mobil = daftarMobil.get(i);
            System.out.printf("| %-3d | %-15s | %-15s | %-5d |\n", i + 1, mobil.getMerek(), mobil.getModel(), mobil.getCC());
        }
    }

    public int jumlahMobil() {
        return daftarMobil.size();
    }
}