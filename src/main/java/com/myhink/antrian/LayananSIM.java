/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myhink.antrian;

/**
 * Class turunan dari LayananPublik
 * Digunakan untuk layanan SIM
 * @author AndraSP
 */
public class LayananSIM extends LayananPublik {

    // atribut tambahan khusus SIM
    private String jenisSIM;

    /**
     * Constructor class turunan
     * @param nama nama pemohon
     * @param instansi instansi terkait (contoh: Polres)
     * @param jenisSIM jenis SIM (contoh: SIM A, SIM C)
     */
    public LayananSIM(String nama, String instansi, String jenisSIM){
        super(nama, "Pembuatan SIM", instansi);
        this.jenisSIM = jenisSIM;
    }
// OVERLOADING constructor
    public LayananSIM(String nama){
        super(nama);
        this.jenisSIM = "SIM C";
    }
    // getter setter
    public String getJenisSIM(){
        return jenisSIM;
    }

    public void setJenisSIM(String jenisSIM){
        this.jenisSIM = jenisSIM;
    }

    /**
     * OVERRIDING dari class parent (LayananPublik)
     * untuk menampilkan data khusus layanan SIM
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
