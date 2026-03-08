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
 * Object Class
 * Class ini digunakan untuk menyimpan data pelayanan publik
 * Tema : Layanan Publik
 */
public class LayananPublik {

    // atribut untuk menyimpan data pemohon pelayanan
    String namaPemohon;
    String jenisLayanan;
    String instansi;

    /**
     * method untuk mengisi nama pemohon
     */
    void setNamaPemohon(String nama){
        this.namaPemohon = nama;
    }

    /**
     * method untuk mengisi jenis layanan
     */
    void setJenisLayanan(String layanan){
        this.jenisLayanan = layanan;
    }

    /**
     * method untuk mengisi instansi pelayanan
     */
    void setInstansi(String instansi){
        this.instansi = instansi;
    }

    /**
     * method untuk menampilkan data pelayanan
     */
    void tampilData(){
        System.out.println("Nama Pemohon  : " + namaPemohon);
        System.out.println("Jenis Layanan : " + jenisLayanan);
        System.out.println("Instansi      : " + instansi);
    }
}
