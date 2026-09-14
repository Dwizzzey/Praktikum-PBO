/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum4;

/**
 *
 * @author Ilham Dwi
 */
public class Pekerja extends Manusia {
    // Atribut tambahan untuk kelas Pekerja
    private double gaji;

    // Constructor
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
        super(nama, usia, pekerjaan); // Memanggil constructor kelas Manusia
        this.gaji = gaji;
    }

    // Getter dan Setter untuk gaji
    public double getGaji() {
        return gaji;
    }
    
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    // Override metode toString untuk mencetak informasi
    @Override
    public String toString() {
        return "Nama      : " + getNama() + 
               "\nUsia      : " + usia + " tahun" +
               "\nPekerjaan : " + pekerjaan + 
               "\nGaji      : Rp " + gaji;
    }
}