/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum5;

/**
 *
 * @author Ilham Dwi
 */


//Kelas Induk
class Kendaraan {
     String nama;
     int kecepatan;
    
    public void tampilkanInfo(){
        System.out.println("Nama Kendaraan:" + nama);
        System.out.println("Kecepatan: " + kecepatan + "km/jam");
        
    }
}

// Kelas Turunan Mobil
class Mobil extends Kendaraan {
    int jumlahPintu;
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu:" + jumlahPintu);
    }
}

// Kelas Turunan SepedaMotor
class SepedaMotor extends Kendaraan {
    String jenisMesin;
    
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jenis Mesin:" + jenisMesin);
    }
}

public class Main{
    public static  void main (String[] args){
        Mobil mobil = new Mobil();
        mobil.nama = "Honda";
        mobil.kecepatan = 188;
        mobil.jumlahPintu = 4;
        mobil.tampilkanInfo();
        
        SepedaMotor motor = new SepedaMotor();
        motor.nama = "Yamaha";
        motor.kecepatan = 150;
        motor.jenisMesin = "2-tak";
        motor.tampilkanInfo();
    }
}