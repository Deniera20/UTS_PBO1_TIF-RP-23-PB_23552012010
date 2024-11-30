# UTS Pemrograman Berorientasi Obyek 1
<ul>
  <li>Mata Kuliah: Pemrograman Berorientasi Obyek 1</li>
  <li>Dosen Pengampu: <a href="https://github.com/Muhammad-Ikhwan-Fathulloh">Muhammad Ikhwan Fathulloh</a></li>
</ul>

## Profil
<ul>
  <li>Nama: Deniera Rafiu Farras Hady</li>
  <li>NIM: 23552012010</li>
  <li>Studi Kasus: Aplikasi Manajemen Wisata</li>
</ul>

## Judul Studi Kasus
<p>Aplikasi Manajemen Wisata</p>

## Penjelasan Studi Kasus
<p>Studi kasus ini berfokus pada pembuatan aplikasi berbasis Object-Oriented Programming (OOP) untuk mengelola layanan wisata. Dengan memanfaatkan konsep dasar OOP seperti inheritance, polymorphism, encapsulation, dan abstraction, aplikasi dirancang untuk membantu pengguna dalam memilih paket wisata, menghitung biaya perjalanan, memproses pemesanan, dan membuat laporan perjalanan.</p>

## Penjelasan 4 Pilar OOP dalam Studi Kasus

### 1. Inheritance
<p>Kelas PaketWisata menjadi kelas induk yang menyimpan atribut dasar seperti namaPaket, destinasi, dan harga.
Kelas turunan seperti WisataAlam dan WisataBudaya mewarisi atribut dan metode dari PaketWisata, sekaligus menambahkan atribut atau metode spesifik sesuai kebutuhan, seperti biaya transportasi (untuk WisataAlam) atau jumlah peserta (untuk WisataBudaya).</p>

### 2. Encapsulation
<p>Metode hitungBiaya() pada setiap jenis wisata memiliki implementasi berbeda tergantung pada subclass:</p>
<ul>
  <li>Wisata Alam: Biaya dihitung dengan rumus harga + biayaTransportasi.</li>
  <li>Wisata Budaya: Biaya dihitung dengan rumus harga × jumlahPeserta.</li>
</ul>

### 3. Polymorphism
<p>Data sensitif seperti tanggalPerjalanan, jumlahPeserta, dan statusPemesanan disembunyikan dalam atribut private pada kelas Perjalanan.
Akses ke data ini hanya dapat dilakukan melalui metode getter (getTanggal(), getJumlahPeserta()) dan setter (setTanggal(), setJumlahPeserta()).</p>

### 4. Abstract
<p>Kelas abstrak LayananWisata mendefinisikan kerangka umum berupa metode abstrak seperti daftarPaket() dan booking().
Subclass seperti WisataAlam dan WisataBudaya mengimplementasikan metode tersebut dengan logika spesifik sesuai jenis wisata.</p>

## Demo Proyek
<ul>
  <li>Github: <a href="https://github.com/Deniera20">Deniera Rafiu Farras Hady</a></li>
  <li>GDrive: <a href="https://drive.google.com/file/d/1kGT-ZurdhqRklckOFh-unHSEo2BDZdWo/view?usp=sharing">Video Demo</a></li>
</ul>
