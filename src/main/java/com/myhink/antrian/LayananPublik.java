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
 * Class LayananPublik
 * Berfungsi sebagai class model untuk menyimpan data pelayanan publik
 * Menerapkan Enkapsulasi + Overloading + Overriding
 * Tema: Sistem Antrian Pelayanan Publik
 */
public class LayananPublik {

    // private (enkapsulasi)
    private String namaPemohon;
    private String jenisLayanan;
    private String instansi;

    // constructor
    public LayananPublik(String nama, String layanan, String instansi){
        this.namaPemohon = nama;
        this.jenisLayanan = layanan;
        this.instansi = instansi;
    }
// OVERLOADING constructor
    public LayananPublik(String nama){
        this.namaPemohon = nama;
        this.jenisLayanan = "-";
        this.instansi = "-";
    }
    // getter & setter
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

    /**
     * Method dasar (akan dioverride)
     */
    public String tampilData(){
    return "Nama Pemohon  : " + getNamaPemohon() +
           "\nJenis Layanan : " + getJenisLayanan() +
           "\nInstansi      : " + getInstansi();
}

    /**
     * Overloading method
     */
    public String tampilData(boolean detail){
        if(detail){
            return tampilData();
        } else {
            return "Nama: " + namaPemohon;
        }
    }
}
