/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbaru3;

/**
 *
 * @author Muh. Elbin
 */
public class Tugasbaru3 {

  public static void main (String[] arg){
        manusia saya = new manusia();
        saya.mengambil();
        saya.jalan();
        saya.mengendus();
        
        System.out.println("\nJumlah tangan   : "+saya.tangan);
        System.out.println("Jumlah kaki : "+saya.kaki);
        System.out.println("Jumlah hidung   : "+saya.hidung);
    }
}