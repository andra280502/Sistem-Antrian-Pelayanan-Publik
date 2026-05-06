# Sistem Antrian Pelayanan Publik

Aplikasi GUI berbasis Java (NetBeans) untuk mensimulasikan sistem antrian pelayanan publik menggunakan konsep Object-Oriented Programming (OOP).

---

## 📌 Deskripsi
Program ini digunakan untuk mengelola data antrian pelayanan seperti pembuatan KTP dan SIM.  
Data ditampilkan dalam bentuk tabel (`JTable`) sehingga lebih terstruktur dibandingkan `JTextArea`.

---

## 🎯 Fitur Utama
- Input data pemohon
- Otomatis menentukan instansi berdasarkan jenis layanan
- Menampilkan data dalam tabel
- Hapus data (Delete)
- Reset input (Batal)
- GUI berbasis Java Swing

---

## 🧠 Konsep OOP yang Digunakan
- **Encapsulation** → atribut private + getter/setter
- **Inheritance** → `LayananKTP`, `LayananSIM` mewarisi `LayananPublik`
- **Polymorphism** → penggunaan objek parent untuk child
- **Overriding** → method `tampilData()` di subclass
- **Overloading** → method `tampilData(boolean detail)`
- **Abstract Class** → `LayananPublik` sebagai class dasar

---

## 🏗️ Struktur Project
Sistem-Antrian-Pelayanan-Publik/
├── src/
│ └── com/myhink/antrian/
│ ├── LayananPublik.java
│ ├── LayananKTP.java
│ ├── LayananSIM.java
│ ├── GUISISTEMANTRIANPELAYANANPUBLIK.java
│
├── nbproject/
├── build.xml
└── README.md

## 📷 Tampilan Program

![GUI Sistem Antrian](assets/gui.png)
![GUI Sistem Antrian](assets/gui2.png)
![GUI Sistem Antrian](assets/gui3.png)