/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SaranBahan2Resep {
    public static void main (String[] args){
        String DerikDwiHeavyantoXRPL512 = " nama lengkap / kelas / no";
        System.out.println("identitas : " + DerikDwiHeavyantoXRPL512 );
        
        System.out.print("\nSaran Resep dari Bahan MIlik Anda\n");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bahan Pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.println("Masukan no pillihan Anda :");
        int bahan1 =scan.nextInt();
        
        
    }
}
