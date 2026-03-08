/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myhink.sistem.antrian.pelayanan.publik;

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

        // membuat object dari class LayananPublik
        LayananPublik layanan = new LayananPublik();

        // mengisi data pelayanan publik
        layanan.setNamaPemohon("Andra Syailendra Perdana");
        layanan.setJenisLayanan("Pembuatan KTP");
        layanan.setInstansi("Dinas Kependudukan");

        // menampilkan judul program
        System.out.println("==================================");
        System.out.println("      SISTEM PELAYANAN PUBLIK     ");
        System.out.println("==================================");

        // memanggil method untuk menampilkan data
        layanan.tampilData();
    }
}
