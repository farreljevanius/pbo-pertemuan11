import java.util.*;
public class Main{
    public static void main(String[] args){
        List<Kendaraan> daftarKendaraan = new ArrayList<>();
        List<Penyewaan> daftarPenyewaan = new ArrayList<>();
        
        daftarKendaraan.add(new Mobil("Toyota", "Innova Reborn", 2017, 4));
        daftarKendaraan.add(new Mobil("Toyota", "Innova Zenix", 2021, 4));
        daftarKendaraan.add(new Motor("Yamaha", "Mio", 2020, 2));
        daftarKendaraan.add(new Motor("Honda", "Scoopy", 2021, 2));
        daftarKendaraan.add(new Sepeda("United", "Clovis", 2024, "Gunung"));
        daftarKendaraan.add(new Sepeda("United", "Miami", 2022, "Sport"));
        
        daftarPenyewaan.add(new Penyewaan("Budi", daftarKendaraan.get(0)));
        daftarPenyewaan.add(new Penyewaan("Paulus", daftarKendaraan.get(1)));
        daftarPenyewaan.add(new Penyewaan("Agus", daftarKendaraan.get(2)));
        daftarPenyewaan.add(new Penyewaan("Robin", daftarKendaraan.get(3)));
        daftarPenyewaan.add(new Penyewaan("Robi", daftarKendaraan.get(4)));
        daftarPenyewaan.add(new Penyewaan("Slamet", daftarKendaraan.get(5)));
        
        System.out.println("=== Daftar Kendaraan Tersedia ===");
        for (Kendaraan k : daftarKendaraan) {
            System.out.println(k.getInfo());
        }
        System.out.println("\n=== Daftar Penyewa ===");
        for (Penyewaan p : daftarPenyewaan) {
            System.out.println(p.getDetail());
        }
    }
}