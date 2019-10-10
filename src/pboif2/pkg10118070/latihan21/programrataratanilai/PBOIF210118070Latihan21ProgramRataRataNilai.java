/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10118070.latihan21.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Ailyasha
 * Nama : Aufa Ilyasha
 * Nim : 10118070
 * Kelas : IF-2
 * Nama kelas : Pemrograman Berbasis OO
 */
public class PBOIF210118070Latihan21ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumlahNilai =0;
        //Buat ScannerBaru
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Banyaknya Mahasiswa : ");
        int banyakMhs = input.nextInt();
        
        //deklarasi array
        int[] nilaiMhs = new int[banyakMhs];
        
        for(int i=1;i<= banyakMhs;i++){
            System.out.println("Nilai Mahasiswa ke- " + i + ":");
            nilaiMhs[i-1] = input.nextInt();
            jumlahNilai = (int)(jumlahNilai + nilaiMhs[i-1]);
        }
        
        double rataNilai = jumlahNilai/banyakMhs;
        System.out.println();
        System.out.println("Maka Rata-rata Nilainya adalah" + rataNilai);
        System.out.println("(Developed by : Aufa Ilyasha)");
        }
    }
    

