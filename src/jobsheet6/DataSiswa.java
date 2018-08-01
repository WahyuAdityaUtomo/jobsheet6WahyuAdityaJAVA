/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class DataSiswa {
    public static void main(String[] args) {
        //deklarasi variabel
        String nama, alamat;
        int usia, absen;
        //membuat scanner baru
        Scanner keyboard = new Scanner (System.in);
        //tampilkan output ke user
        System.out.println("### DATA SISWA SMK TELKOM MALANG ###");
        System.out.print("Nama Siswa; ");
        // mengunakan scanner dan menyimpan apa yang diketik di variabel nama
        nama = keyboard.next();
        //tampilkan output lagi
        System.out.print("alamat; ");
        // menggunakan scanner lagi
        alamat = keyboard.next();
        System.out.print("absen; ");
        usia = keyboard.nextInt();
        System.out.print("usia; ");
        absen = keyboard.nextInt();
        //menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Nama Siswa; " + nama);   
        System.out.println("Alamat; " + absen);
        System.out.println("Absen; " + alamat);
        System.out.println("Usia; " + absen + " tahun");
        
    }
    
}
