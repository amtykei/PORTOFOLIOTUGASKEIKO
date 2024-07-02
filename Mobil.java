//nama : Alloysius Steven
//nrp : c14210265
package com.company;

class Mobil1 {
    String nama;
    String merek;
    int tahun;
    int isiTangki;

    void cekInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Merek: " + merek);
        System.out.println("Tahun: " + tahun);
        System.out.println("Isi tangki bensin: " + isiTangki + " liter");
    }

    void isiBensin(int liter) {
        System.out.println(nama + " diisi bensin sebanyak " + liter + " liter");
        isiTangki += liter;
    }
}

public class TugasKelas1 {
    public static void main(String[] args) {
        Mobil1 mobil1 = new Mobil1();
        Mobil1 mobil2 = new Mobil1();

        mobil1.nama = "mobil Steven";
        mobil1.merek = "Toyota";
        mobil1.tahun = 1980;
        mobil1.isiTangki = 50;

        mobil2.nama = "mobil mama";
        mobil2.merek = "Hyundai";
        mobil2.tahun = 2021;
        mobil2.isiTangki = 70;

        mobil1.cekInfo();
        mobil2.cekInfo();
        mobil2.isiBensin(20);
        mobil2.cekInfo();
    }
}
