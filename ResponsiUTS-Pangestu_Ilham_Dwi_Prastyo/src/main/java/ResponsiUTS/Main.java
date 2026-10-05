/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ResponsiUTS;

/**
 *
 * @author Ilham Dwi
 */

class Produk {
    private String namaProduk;
    private int harga;
    
    public Produk(String namaProduk, int harga){
        this.namaProduk = namaProduk;
        this.harga = harga;
    }
    
    public String getNama(){
        return namaProduk;
    }
    
    public void setNama(String namaProduk){
        this.namaProduk = namaProduk;
    }
 
    public int getHarga(){
        return harga;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }    
    
    public void tampilkanInfo(){
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: Rp" + harga);
    }    
}

class Pegawai {
    private String namaPegawai;
    private int gaji;
    
    public Pegawai(String namaPegawai, int gaji){
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
    }
    
    public String getNama(){
        return namaPegawai;
    }
    
    public void setNama(String namaPegawai){
        this.namaPegawai = namaPegawai;
    }
 
    public int getGaji(){
        return gaji;
    }
    
    public void setGaji(int gaji){
        this.gaji = gaji;
    }    
    
    public void tampilkanInfo(){
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: Rp" + gaji);
    }    
}

class Elektronik extends Produk {
    String garansi;

    public Elektronik(String namaProduk, int harga, String garansi) {
        super(namaProduk, harga);
        this.garansi = garansi;
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansi + " Tahun");
    }
}

class Makanan extends Produk {
    String tanggalKadaluarsa; 
    
    public Makanan(String namaProduk, int harga, String tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}

class PegawaiTetap extends Pegawai {
    int tunjangan;

    public PegawaiTetap(String namaPegawai, int gaji, int tunjangan) {
        super(namaPegawai, gaji);  
        this.tunjangan = tunjangan;
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Tunjangan: Rp" + tunjangan);
    }
}

class PegawaiKontrak extends Pegawai {
    int lamaKontrak;

    public PegawaiKontrak(String namaPegawai, int gaji, int lamaKontrak) {
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");
    }
}

public class Main {
    public static void main(String[] args) {
        
        Produk produk1 = new Elektronik("HP Gemink", 15000000, "2");
        Produk produk2 = new Makanan("Roti Aoka", 3000, "20 Oktober 2045");

        Pegawai pegawai1 = new PegawaiTetap("Abuy", 3000000, 1000000);
        Pegawai pegawai2 = new PegawaiKontrak("Heri", 2500000, 3);

        System.out.println("=== INFORMASI PRODUK ===");
        produk1.tampilkanInfo();
        System.out.println("------------------------");
        produk2.tampilkanInfo();

        System.out.println("\n=== INFORMASI PEGAWAI ===");
        pegawai1.tampilkanInfo();
        System.out.println("------------------------");
        pegawai2.tampilkanInfo();
    }
}