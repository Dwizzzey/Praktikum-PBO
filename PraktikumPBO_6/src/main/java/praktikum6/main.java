/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum6;

/**
 *
 * @author Ilham Dwi
 */

class Hewan {
    public void bersuara (){
        System.out.println("Hewan Bersuara");
    }
    public void makan(String makanan){
        System.out.println("Hewan Makan " + makanan);
    }
    public void makan(String makanan, int jumlah){
        System.out.println("Hewan Makan " + jumlah + " porsi " + makanan);
    }
}

class Kucing extends Hewan{
    @Override
    public void bersuara() {
        System.out.println("Meow");
    }
}

class Anjing extends Hewan{
    @Override
    public void bersuara() {
        System.out.println("Guk Guk Guk");
    }
}
public class main {
    public static void main(String[] args) {
        
        Hewan hewan = new Kucing();
        hewan.bersuara();
        
        Kucing kucing = new Kucing();
        kucing.makan("Ikan");
        kucing.makan("Ikan", 2);
        
        Anjing anjing = new Anjing();
        anjing.bersuara();
        anjing.makan("Daging", 3);
    }
}