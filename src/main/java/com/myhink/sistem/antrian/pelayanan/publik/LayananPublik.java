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
 * Class LayananPublik
 * Berfungsi sebagai class model untuk menyimpan data pelayanan publik
 * Tema: Sistem Antrian Pelayanan Publik
 */
public class LayananPublik {

    // atribut untuk menyimpan data pemohon
    String namaPemohon;
    String jenisLayanan;
    String instansi;

    /**
     * Constructor
     * Digunakan untuk menginisialisasi data saat object dibuat
     * @param nama nama pemohon
     * @param layanan jenis layanan yang dipilih
     * @param instansi instansi terkait pelayanan
     */
    public LayananPublik(String nama, String layanan, String instansi){
        this.namaPemohon = nama;
        this.jenisLayanan = layanan;
        this.instansi = instansi;
    }
    void setNamaPemohon(String nama){
        this.namaPemohon = nama;
    }

    void setJenisLayanan(String layanan){
        this.jenisLayanan = layanan;
    }

    void setInstansi(String instansi){
        this.instansi = instansi;
    }
    /**
     * Method untuk menampilkan data ke console
     */
    void tampilData(){
        System.out.println("Nama Pemohon  : " + namaPemohon);
        System.out.println("Jenis Layanan : " + jenisLayanan);
        System.out.println("Instansi      : " + instansi);
    }
}
