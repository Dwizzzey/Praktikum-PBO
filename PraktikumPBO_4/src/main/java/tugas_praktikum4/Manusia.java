/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_praktikum4;

/**
 *
 * @author Ilham Dwi
 */
public class Manusia {
  private String nama;
  protected int usia;
  public String pekerjaan;
  
  public Manusia(String nama, int usia, String pekerjaan){
      this.nama = nama;
      this.usia = usia;
      this.pekerjaan = pekerjaan;
  }
  // method getter dan setter nama
  public String getNama() {
      return nama;
  }
  public void setNama(String nama){
      this.nama = nama;
  }
}
