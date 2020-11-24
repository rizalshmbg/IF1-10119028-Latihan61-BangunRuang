/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan61.bangunruang;

/**
 *
 * @author RizalSihombing
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program untuk menghitung volume bangun ruang
 */
public class IF110119028Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola b = new Bola(7);
        Tabung t = new Tabung(10,21);
        Kerucut k = new Kerucut(14,9);
        
        b.tampilBangunRuang();
        t.tampilBangunRuang();
        k.tampilBangunRuang();
    }   
}