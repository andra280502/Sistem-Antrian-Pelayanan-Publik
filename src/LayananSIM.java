/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myhink.antrian;

/**
 * ============================================================
 * CLASS: LayananSIM (Subclass)
 * ============================================================
 * Turunan dari LayananPublik
 *
 * Konsep:
 * - Inheritance
 * - Overriding
 * - Overloading
 * ============================================================
 */
public class LayananSIM extends LayananPublik {

    private String jenisSIM;

    // Constructor utama
    public LayananSIM(String nama, String instansi, String jenisSIM){
        super(nama, "Pembuatan SIM", instansi);
        this.jenisSIM = jenisSIM;
    }

    // Overloading constructor
    public LayananSIM(String nama){
        super(nama);
        this.jenisSIM = "SIM C";
    }

    // Getter Setter
    public String getJenisSIM(){
        return jenisSIM;
    }

    public void setJenisSIM(String jenisSIM){
        this.jenisSIM = jenisSIM;
    }

    /**
     * OVERRIDING METHOD
     */
    @Override
    public String tampilData(){
        return "=== LAYANAN SIM ===\n" +
               "Nama Pemohon : " + getNamaPemohon() +
               "\nJenis Layanan : " + getJenisLayanan() +
               "\nInstansi : " + getInstansi() +
               "\nJenis SIM : " + getJenisSIM();
    }
}