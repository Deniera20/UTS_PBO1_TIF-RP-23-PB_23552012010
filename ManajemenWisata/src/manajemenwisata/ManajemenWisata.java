/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manajemenwisata;

/**
 *
 * @author Deniera
 */
import java.util.Scanner;

public class ManajemenWisata extends LayananWisata {
    @Override
    public void daftarPaket() {
        System.out.println("Daftar Paket Wisata:");
        System.out.println("1. Wisata Alam");
        System.out.println("2. Wisata Budaya");
    }

    @Override
    public void booking() {
        System.out.println("Booking perjalanan Anda berhasil.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManajemenWisata manajemen = new ManajemenWisata();

        // Menampilkan daftar paket
        manajemen.daftarPaket();

        // Meminta pengguna memilih paket wisata
        System.out.print("Pilih paket wisata (1/2): ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            // Input detail Wisata Alam
            System.out.print("Masukkan nama paket: ");
            String namaPaket = scanner.next();
            System.out.print("Masukkan destinasi: ");
            String destinasi = scanner.next();
            System.out.print("Masukkan harga dasar: ");
            double harga = scanner.nextDouble();
            System.out.print("Masukkan biaya transportasi: ");
            double transportasi = scanner.nextDouble();

            // Membuat objek Wisata Alam dan menghitung biaya
            WisataAlam alam = new WisataAlam(namaPaket, destinasi, harga, transportasi);
            System.out.println("\nPaket: " + alam.getNamaPaket());
            System.out.println("Destinasi: " + alam.getDestinasi());
            System.out.println("Total Biaya: " + alam.hitungBiaya());
        } else if (pilihan == 2) {
            // Input detail Wisata Budaya
            System.out.print("Masukkan nama paket: ");
            String namaPaket = scanner.next();
            System.out.print("Masukkan destinasi: ");
            String destinasi = scanner.next();
            System.out.print("Masukkan harga dasar: ");
            double harga = scanner.nextDouble();
            System.out.print("Masukkan jumlah peserta: ");
            int peserta = scanner.nextInt();

            // Membuat objek Wisata Budaya dan menghitung biaya
            WisataBudaya budaya = new WisataBudaya(namaPaket, destinasi, harga, peserta);
            System.out.println("\nPaket: " + budaya.getNamaPaket());
            System.out.println("Destinasi: " + budaya.getDestinasi());
            System.out.println("Total Biaya: " + budaya.hitungBiaya());
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        // Input detail perjalanan
        System.out.print("\nMasukkan tanggal perjalanan (YYYY-MM-DD): ");
        String tanggal = scanner.next();
        System.out.print("Masukkan jumlah peserta: ");
        int jumlahPeserta = scanner.nextInt();
        System.out.print("Masukkan status pemesanan (Confirmed/Canceled): ");
        String status = scanner.next();

        // Membuat objek Perjalanan
        Perjalanan perjalanan = new Perjalanan(tanggal, jumlahPeserta, status);
        System.out.println("\nTanggal Perjalanan: " + perjalanan.getTanggalPerjalanan());
        System.out.println("Jumlah Peserta: " + perjalanan.getJumlahPeserta());
        System.out.println("Status Pemesanan: " + perjalanan.getStatusPemesanan());

        // Konfirmasi booking
        manajemen.booking();
    }
}
