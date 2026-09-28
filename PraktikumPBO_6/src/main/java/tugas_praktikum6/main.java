/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum6;

/**
 *
 * @author Ilham Dwi
 */
import java.util.ArrayList;
import java.util.List;

class Produk {
    String nama;
    double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public double hitungDiskon() {
        return 0; // Default tidak ada diskon
    }
}

class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        return harga * 0.10; // Diskon 10% untuk Buku
    }
}

class Elektronik extends Produk {
    public Elektronik(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        return harga * 0.05; // Diskon 5% untuk Elektronik
    }
}

class Pakaian extends Produk {
    public Pakaian(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {
        return harga * 0.20; // Diskon 20% untuk Pakaian
    }
}

class KeranjangBelanja {
    List<Produk> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public double tampilkanDetailBelanja() {
        double totalHargaKeseluruhan = 0;

        System.out.println("=======  Rincian Belanja  =======");
        
        for (Produk produk : daftarProduk) {
            double diskon = produk.hitungDiskon();
            double hargaSetelahDiskon = produk.harga - diskon;
            
            System.out.println("Nama Produk   : " + produk.nama);
            System.out.println("Harga Awal    : Rp" + produk.harga);
            System.out.println("Nominal Diskon: Rp" + diskon);
            System.out.println("Harga Akhir   : Rp" + hargaSetelahDiskon);
            System.out.println("-------------------------------------");
            
            totalHargaKeseluruhan += hargaSetelahDiskon;
        }
        
        return totalHargaKeseluruhan;
    }
}

public class main {
    public static void main(String[] args) {
        Produk buku = new Buku("Buku Hebat", 150000);
        Produk hp = new Elektronik("Hp Gemink", 7000000);
        Produk kaos = new Pakaian("Kaos Polos", 60000);

        KeranjangBelanja keranjang = new KeranjangBelanja();
        
        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(hp);
        keranjang.tambahProduk(kaos);

        // Memanggil metode untuk menampilkan detail sekaligus mendapatkan total bayar
        double totalBayar = keranjang.tampilkanDetailBelanja();
        
        System.out.println("TOTAL KESELURUHAN: Rp" + totalBayar);
        System.out.println("=====================================");
    }
}