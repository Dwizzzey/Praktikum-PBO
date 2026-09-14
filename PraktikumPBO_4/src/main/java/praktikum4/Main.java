/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;


/**
 *
 * @author Ilham Dwi
 */

public class Main {
    public static void main(String[] args) {
        
        // 1. Membuat objek dari kelas Kendaraan (contoh: Motor)
        System.out.println("=== OBJEK KENDARAAN (MOTOR) ===");
        Kendaraan motor = new Kendaraan("Yamaha R15", 140, "Mesin 155cc");
        
        System.out.println("Data Motor Awal:");
        motor.tampilkanInfoKendaraan(); 
        
        // Mengubah nama motor menggunakan metode Setter
        motor.setNama("Yamaha R15 Connected");
        System.out.println("\nData Motor Setelah Diubah:");
        motor.tampilkanInfoKendaraan();
        
        System.out.println("\n=========================================\n");
        
        // 2. Membuat objek dari kelas turunan Mobil (contoh: Mobil SUV)
        System.out.println("=== OBJEK MOBIL (SUV) ===");
        Mobil suv = new Mobil("Pajero Sport", 180, "Mesin Diesel 2.4L", 5);
        
        // Karena Mobil adalah turunan Kendaraan, ia bisa memakai method milik kelas induk
        System.out.println("Info Dasar Kendaraan:");
        suv.tampilkanInfoKendaraan(); 
        
        // Memanggil method khusus milik kelas Mobil itu sendiri
        System.out.println("\nInfo Spesifik Mobil:");
        suv.tampilkanInfoMobil(); 
    }
}