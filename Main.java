/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo9;

/**
 *
 * @author Dini Aryani
 */
public class Main extends JumlahGaji {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(" Gaji Dan Tunjangan Guru");
        System.out.println("-------------------------------------------");
        main.nip();
        main.nama();
        main.jabatan();
        main.gT();
        main.gaji();
        System.out.println("-------------------------------------------");
        System.out.println("Total Gaji Poko + Tunjangan : Rp. "+main.all()+",-");
        
    }
}