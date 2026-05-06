/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myhink.antrian;

/**
 * ============================================================
 * CLASS: LayananKTP (Subclass)
 * ============================================================
 * Turunan dari LayananPublik
 *
 * Konsep:
 * - Inheritance (extends)
 * - Overriding method tampilData()
 * - Overloading constructor
 * ============================================================
 */
public class LayananKTP extends LayananPublik {

    private String jenisKTP;

    // Constructor utama
    public LayananKTP(String nama, String instansi, String jenisKTP){
        super(nama, "Pembuatan KTP", instansi);
        this.jenisKTP = jenisKTP;
    }

    // Overloading constructor
    public LayananKTP(String nama){
        super(nama);
        this.jenisKTP = "KTP Elektronik";
    }

    // Getter Setter
    public String getJenisKTP(){
        return jenisKTP;
    }

    public void setJenisKTP(String jenisKTP){
        this.jenisKTP = jenisKTP;
    }

    /**
     * OVERRIDING METHOD
     * Implementasi method abstract dari parent
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