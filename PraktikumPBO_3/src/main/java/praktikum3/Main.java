/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikum3;

/**
 *
 * @author Ilham Dwi
 */
public class Main {

    public static void main(String[] args) {
        Hewan kucing = new Hewan("Meot", 7);
        Hewan anjing = new Hewan("Karma", 9);
        kucing.suara();
        kucing.info();
        anjing.info();
        anjing.berlari();
       
    }
}
