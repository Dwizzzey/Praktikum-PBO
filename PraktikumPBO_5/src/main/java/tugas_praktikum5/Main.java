/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tugas_praktikum5;

/**
 *
 * @author Ilham Dwi
 */

//Kelas Induk Hewan
class Hewan {
    String nama;
    String jenis;
    
    public void tampilkanInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
    }
}

// Kelas Kucing
class Kucing extends Hewan{
    String suara = "Miawww";
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Suara Kucing: " + suara);
    }
}

//Kelas Anjing
class Anjing extends Hewan{
    String suara = "Guk Guk Guk";
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Suara Anjing: " + suara);
    }
}

//Kelas Induk Kendaraan
class Kendaraan{
     String nama;
     int kecepatan;
    
    public void tampilkanInfo(){
        System.out.println("Nama Kendaraan:" + nama);
        System.out.println("Kecepatan: " + kecepatan + "km/jam");
    }
}
// Kelas Menengah Kendaraan Darat
class KendaraanDarat extends Kendaraan{
    int jumlahRoda;
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}  

// Kelas Turunan Mobil
class Mobil extends Kendaraan{
   int jumlahPintu;
    int jumlahRoda;
   
   @Override
   public void tampilkanInfo(){
       super.tampilkanInfo();
       System.out.println("Jumlah Pintu" + jumlahPintu);
   }
    
}
// Kelas Turunan Sepeda Motor
class SepedaMotor extends Kendaraan{
    String jenisMesin;
    int jumlahRoda;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }    
}

public class Main{
    
    public static void main (String[] args){
        System.out.println("=== Kelas Induk Hewan ===");
        System.out.println("=== Kucing ===");
        Kucing kucing = new Kucing();
        kucing.nama = "Kokopoolo";
        kucing.jenis = "Anggora";
        kucing.tampilkanInfo();
       
        System.out.println("=== Anjing ===");      
        Anjing anjing = new Anjing();
        anjing.nama = "Karma";
        anjing.jenis = "Siberian Husky";
        anjing.tampilkanInfo();

        System.out.println("\n=== Kelas Induk Kendaraan ===");
        
        System.out.println("=== Mobil ===");
        Mobil mobilSaya = new Mobil();
        mobilSaya.nama = "Honda Civic";
        mobilSaya.kecepatan = 150;
        mobilSaya.jumlahRoda = 4; 
        mobilSaya.jumlahPintu = 4; 
        mobilSaya.tampilkanInfo();
        
        System.out.println("=== Motor ===");      
        SepedaMotor motorSaya = new SepedaMotor();
        motorSaya.nama = "Ninja";
        motorSaya.kecepatan = 120;
        motorSaya.jumlahRoda = 2;
        motorSaya.jenisMesin = "4-tak"; 
        motorSaya.tampilkanInfo();
        
    }
}
