/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan57.vehicle;

/**
 *
 * @author
 * NAMA : Agus Awaludin
 * NIM : 10118067
 * KELAS : PBO2
 * Latihan ini berisi tentang cara menampilkan data kendaraan dengan metode
 * polymorpism
 */
public class PBO210118067Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle bi = new Bicycle();
        bi.setMyBrand("Trek Bike");
        bi.setMyModel("7,4FX");
        bi.setMyGearCount(23);
        System.out.println("Brand : " + bi.getMyBrand());
        System.out.println("Model : " + bi.getMyModel());
        System.out.println("Jumlah Gear : " + bi.getMyGearCount()+"\n");
        
        Skateboard skate = new Skateboard();
        skate.setMyBrand("Ally Skate");
        skate.setMyModel("Rocket");
        skate.setMyBoardLength(54.5);
        System.out.println("Brand : " + skate.getMyBrand());
        System.out.println("Model : " + skate.getMyModel());
        System.out.println("Jumlah Gear : " + skate.getMyBoardLength());
    }
    
}
