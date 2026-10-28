/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum9;

/**
 *
 * @author Ilham Dwi
 */


abstract class Kendaraan {
    abstract void berjalan();
    
    void info() {
        System.out.println("Ini adalah kendaraan");
    }
}
    
class Mobil extends Kendaraan {
    @Override
    void berjalan () {
        System.out.println("Mobil sedang berjalan dengan cepat");
    }
}

class Sepeda extends Kendaraan {
    @Override
    void berjalan () {
        System.out.println("Sepeda sedang berjalan dengan pelan");
    }
}

public class Main {
    public static void main(String[] args){
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        // Percobaan yang akan menghasilkan error
       // Kendaraan k = new Kendaraan();
        mobil.berjalan();
        mobil.info();
        
        sepeda.berjalan();
        sepeda.info();
    }
}