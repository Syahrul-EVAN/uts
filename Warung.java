/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Encupsulasi;

/**
 *
 * @author syahr
 */
public class Warung {
    public String makanan, minuman;

    public Warung() {
        
    }

    public Warung(String makanan, String minuman) {
        this.makanan = makanan;
        this.minuman = minuman;
    }
    
    //default constructor
    public static void main(String[] args) {
        
        Warung warung = new Warung("makanan, minuman");
        System.out.println("sariBundo.makanan");
    }
            
}