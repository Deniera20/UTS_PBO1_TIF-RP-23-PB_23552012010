/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemenwisata;

public class WisataBudaya extends PaketWisata {
    private int jumlahPeserta;

    public WisataBudaya(String namaPaket, String destinasi, double harga, int jumlahPeserta) {
        super(namaPaket, destinasi, harga);
        this.jumlahPeserta = jumlahPeserta;
    }

    public double hitungBiaya() {
        return getHarga() * jumlahPeserta;
    }
}
