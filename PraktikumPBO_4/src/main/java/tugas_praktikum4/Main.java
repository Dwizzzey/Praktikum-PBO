/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum4;

/**
 *
 * @author Ilham Dwi
 */
public class Main {
    public static void main(String[] args) {
        Pekerja karyawan1 = new Pekerja("Abuy", 28, "Buruh Pabrik", 3000000);

        System.out.println("=== DATA PEKERJA AWAL ===");
        System.out.println(karyawan1.toString());

        karyawan1.setNama("Abuy Fadilla");
        
        System.out.println("\n=== DATA PEKERJA SETELAH NAMA DIUBAH ===");
        System.out.println(karyawan1.toString());

        System.out.println("\n=== PENGUJIAN AKSES LANGSUNG ===");
        
        
        //Coba akses pekerjaan (public) -> BERHASIL
        System.out.println("Akses pekerjaan: " + karyawan1.pekerjaan);
        
        // Coba akses usia (protected) -> BERHASIL (KARENA MASIH SATU PACKAGE)
        System.out.println("Akses usia: " + karyawan1.usia);
        

        // Coba akses nama 
        //System.out.println("Akses nama: " + karyawan1.nama); // ERROR!
        // Coba akses gaji 
        //System.out.println("Akses gaji: " + karyawan1.gaji); // ERROR!
    }
}