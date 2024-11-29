/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemenwisata;

// Encapsulation
public class Perjalanan {
    private String tanggalPerjalanan;
    private int jumlahPeserta;
    private String statusPemesanan;

    public Perjalanan(String tanggalPerjalanan, int jumlahPeserta, String statusPemesanan) {
        this.tanggalPerjalanan = tanggalPerjalanan;
        this.jumlahPeserta = jumlahPeserta;
        this.statusPemesanan = statusPemesanan;
    }

    public String getTanggalPerjalanan() {
        return tanggalPerjalanan;
    }

    public void setTanggalPerjalanan(String tanggalPerjalanan) {
        this.tanggalPerjalanan = tanggalPerjalanan;
    }

    public int getJumlahPeserta() {
        return jumlahPeserta;
    }

    public void setJumlahPeserta(int jumlahPeserta) {
        this.jumlahPeserta = jumlahPeserta;
    }

    public String getStatusPemesanan() {
        return statusPemesanan;
    }

    public void setStatusPemesanan(String statusPemesanan) {
        this.statusPemesanan = statusPemesanan;
    }
}
