/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myhink.antrian;

/**
 * Class turunan dari LayananPublik
 * Digunakan untuk layanan KTP
 * Menerapkan overriding
 * @author AndraSP
 */
public class LayananKTP extends LayananPublik {

    private String jenisKTP;

    // constructor
    public LayananKTP(String nama, String instansi, String jenisKTP){
        super(nama, "Pembuatan KTP", instansi);
        this.jenisKTP = jenisKTP;
    }
// OVERLOADING constructor
    public LayananKTP(String nama){
        super(nama);
        this.jenisKTP = "KTP Elektronik";
    }
    // getter setter
    public String getJenisKTP(){
        return jenisKTP;
    }

    public void setJenisKTP(String jenisKTP){
        this.jenisKTP = jenisKTP;
    }

    /**
     * OVERRIDING method dari parent
     */
    @Override
    public String tampilData(){
        return "=== LAYANAN KTP ===\n" +
               "Nama Pemohon : " + getNamaPemohon() +
               "\nJenis Layanan : " + getJenisLayanan() +
               "\nInstansi : " + getInstansi() +
               "\nJenis KTP : " + getJenisKTP();
    }
}