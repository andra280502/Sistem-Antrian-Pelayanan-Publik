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
        // contoh polymorphism
        // =====================
        // OUTPUT CONSOLE (optional)
        // =====================
        LayananPublik layanan = new LayananKTP(
            "Andra Syailendra Perdana",
            "Dinas Kependudukan",
            "KTP Elektronik"
        );

        System.out.println("==================================");
        System.out.println("      SISTEM PELAYANAN PUBLIK     ");
        System.out.println("==================================");

        // tampilkan hasil overriding
        System.out.println(layanan.tampilData());

        // =====================
        // TAMPILKAN GUI (utama)
        // =====================
        java.awt.EventQueue.invokeLater(() -> {
            new GUISISTEMANTRIANPELAYANANPUBLIK().setVisible(true);
        });
    }
}