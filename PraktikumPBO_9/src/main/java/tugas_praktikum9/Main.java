/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum9;

/**
 *
 * @author Ilham Dwi
 */

abstract class Hewan{
    abstract void suara(); 
}

class Kucing extends Hewan {
    @Override
    void suara(){
        System.out.println("Kucing Bersuara Meong");
    }
}
class Anjing extends Hewan {
    @Override
    void suara(){
        System.out.println("Anjing Bersuara guk guk");
    }
}

public class Main {
    public static void main (String[]args) {
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        
        kucing.suara();
        anjing.suara();
    }
}