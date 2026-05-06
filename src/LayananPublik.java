/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myhink.antrian;

/**
 * ============================================================
 * ABSTRACT CLASS: LayananPublik
 * ============================================================
 * Berfungsi sebagai kerangka dasar (blueprint) untuk semua jenis layanan
 * pada sistem antrian pelayanan publik.
 *
 * Konsep yang digunakan:
 * - Enkapsulasi (private attribute + getter setter)
 * - Overloading (constructor & method)
 * - Abstract (method wajib override di subclass)
 *
 * Class ini TIDAK bisa dibuat object langsung.
 * Harus melalui class turunan (LayananKTP / LayananSIM)
 * ============================================================
 */
public abstract class LayananPublik {

    // ========================
    // ENKAPSULASI (PRIVATE)
    // ========================
    private String namaPemohon;
    private String jenisLayanan;
    private String instansi;

    // ========================
    // CONSTRUCTOR UTAMA
    // ========================
    public LayananPublik(String nama, String layanan, String instansi){
        this.namaPemohon = nama;
        this.jenisLayanan = layanan;
        this.instansi = instansi;
    }

    // ========================
    // OVERLOADING CONSTRUCTOR
    // ========================
    public LayananPublik(String nama){
        this.namaPemohon = nama;
        this.jenisLayanan = "-";
        this.instansi = "-";
    }

    // ========================
    // GETTER & SETTER
    // ========================
    public String getNamaPemohon() {
        return namaPemohon;
    }

    public void setNamaPemohon(String namaPemohon) {
        this.namaPemohon = namaPemohon;
    }

    public String getJenisLayanan() {
        return jenisLayanan;
    }

    public void setJenisLayanan(String jenisLayanan) {
        this.jenisLayanan = jenisLayanan;
    }

    public String getInstansi() {
        return instansi;
    }

    public void setInstansi(String instansi) {
        this.instansi = instansi;
    }

    // ========================
    // ABSTRACT METHOD (WAJIB OVERRIDE)
    // ========================
    public abstract String tampilData();

    // ========================
    // METHOD BIASA
    // ========================
    public String infoDasar(){
        return "Nama: " + namaPemohon +
               "\nLayanan: " + jenisLayanan +
               "\nInstansi: " + instansi;
    }

    // ========================
    // OVERLOADING METHOD
    // ========================
    public String tampilData(boolean detail){
        if(detail){
            return tampilData(); // panggil method override
        } else {
            return "Nama: " + namaPemohon;
        }
    }
}