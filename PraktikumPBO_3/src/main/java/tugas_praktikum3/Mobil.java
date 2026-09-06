/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum3;

/**
 *
 * @author Ilham Dwi
 */
public class Mobil {
    String merk;
    String model;
    int tahun;
    String warna;
    
    public Mobil (String merk, String model, int tahun, String warna) {
        this.merk = merk;
        this.model = model;
        this.tahun = tahun;
        this.warna = warna;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }
    public int getTahun(){
        return tahun;
    }
    
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
    public String getWarna(){
        return warna;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    void displayinfo(){
        System.out.println("Merk :" + getMerk());
        System.out.println("Model :" + getModel());
        System.out.println("Tahun :" + getTahun());
        System.out.println("Warna :" + getWarna());
    }
    
    void startengine(){
        System.out.println("Mesin Mobil" + getMerk() + " Menyala" );
    }
}
