w/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.percabangan.scanner.operator;

import java.util.Scanner;

/**
 *
 * @author moklet gaming 1
 */
public class TugasPercabanganScannerOperator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int pipa=1000, cat=5000 ,besi=10000 ,semen=3000,hasil=pipa+cat+besi+semen;
        System.out.println("selamat datang di kalkuator ");
        System.out.println("berikut daftarnya ");
        
        
        System.out.println("1. perkalian ");
        System.out.println("2. pembagian ");
        System.out.println("3. penjumlahan ");
        System.out.println("4. pengurangan");
        
        
        System.out.println("silahkan memilih bilangan ");
        System.out.println("pipa = ");
        pipa=in.nextInt();
        System.out.println("cat = ");
        cat=in.nextInt();
        System.out.println(" besi =  ");
        besi=in.nextInt();
        System.out.println("semen = ");
        semen=in.nextInt();
        
        
        switch(hasil){
            case 1 :hasil=pipa+pipa;break;
            case 2 :hasil=cat+cat;break;
            case 3 :hasil=besi+besi;break;
            case 4 :hasil=semen+semen;break;
            default : System.out.println("anda salah memasukkan pilihan");
        }
        System.out.println("hasil = "+hasil);
        }
        // TODO code application logic here
    }
    

