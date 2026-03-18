/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myhink.antrian;

/**
 *
 * @author AndraSP
 */
/**
 * Driver Class
 * Class ini digunakan untuk menjalankan program
 */
public class SistemAntrianPelayananPublik {

    public static void main(String[] args) {

    // =====================
    // OUTPUT CONSOLE
    // =====================
    LayananPublik layanan = new LayananPublik(
        "Andra Syailendra Perdana",
        "Pembuatan KTP",
        "Dinas Kependudukan"
    );

    System.out.println("==================================");
    System.out.println("      SISTEM PELAYANAN PUBLIK     ");
    System.out.println("==================================");

    layanan.tampilData();


    // =====================
    // TAMPILKAN GUI
    // =====================
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new GUISISTEMANTRIANPELAYANANPUBLIK().setVisible(true);
        }
    });
    
    }
}
