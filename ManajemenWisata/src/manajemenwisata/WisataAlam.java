/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemenwisata;

public class WisataAlam extends PaketWisata {
    private double biayaTransportasi;

    public WisataAlam(String namaPaket, String destinasi, double harga, double biayaTransportasi) {
        super(namaPaket, destinasi, harga);
        this.biayaTransportasi = biayaTransportasi;
    }

    public double hitungBiaya() {
        return getHarga() + biayaTransportasi;
    }
}
