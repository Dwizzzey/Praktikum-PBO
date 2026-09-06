/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum3;

/**
 *
 * @author Ilham Dwi
 */
public class Main {
    public static void main(String[] args)  {
        Mobil sedan = new Mobil("Honda", "Civic", 2020, "Putih");
        Mobil suv = new Mobil("Toyota", "Raize", 2021, "Biru");
        
        System.out.println("==== Mobil 1 ====");
        sedan.displayinfo();  
        System.out.println("==== Mobil 2 ====");
        suv.displayinfo();
        
        System.out.println("==== Start Engine ====");
        sedan.startengine();
        suv.startengine();
        
        System.out.println("==== Mengubah Warna Mobil 1 ====");
        sedan.setWarna("Merah");
         sedan.displayinfo();
    }
    
}
