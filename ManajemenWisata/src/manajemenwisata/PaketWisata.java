/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manajemenwisata;

/**
 *
 * @author Deniera
 */
// Inheritance
public class PaketWisata {
    private String namaPaket;
    private String destinasi;
    private double harga;

    public PaketWisata(String namaPaket, String destinasi, double harga) {
        this.namaPaket = namaPaket;
        this.destinasi = destinasi;
        this.harga = harga;
    }

    public String getNamaPaket() {
        return namaPaket;
    }

    public String getDestinasi() {
        return destinasi;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}
