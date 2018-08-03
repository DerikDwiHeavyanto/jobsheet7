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
        String nama = " Derik Dwi Heavyanto / XRPL5 / 12";
        System.out.println("identitas : " +nama );
        
        System.out.print("\nSaran Resep dari Bahan MIlik Anda\n");
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bahan Pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.println("Masukan no pillihan Anda :");
        int bahan1 =scan.nextInt();
        
        if (bahan1 == 1){
            System.out.println("Bahan Kedua: ");
            if(bahan1 == 1){
                System.out.println("1. Susu");
                System.out.println("2. Minyak Goreng");
                System.out.println("3. Tidak ada");
            }else{
                System.out.println("1. Minyak Goreng");
                System.out.println("2. Roti");
                System.out.println("3. Tidak ada");
            }
            System.out.print("Masukan no pilihan Anda :");
            int bahan2 = scan.nextInt();
        }else
            System.out.println("Mohon Maaf, Pilihan tidak ditemukan, "
            + "tidak dapat memberikan saran resep");
        int bahan2 = scan.nextInt();
        
        if (bahan2 >= 1 && bahan2 <= 3)
        {
            if(bahan1 == 1)
                switch(bahan2)
                {
                    case 1: System.out.println("Anda dapat membuat milk shake banana");break;
                    case 2: System.out.println(
                            "Anda dapat membuat sndwich telur"); break;
                    case 3: System.out.println("Anda dapat membuat telur rebus");
                    
                }
            
        }else 
            System.out.println("Mohon Maaf, Pilihan tidak ditemukan, "
            +"tidak dapat memberikan saran resep");
        
                
        
        
    }
}
