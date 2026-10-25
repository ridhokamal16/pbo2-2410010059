# pbo2-2410010059

# p04-layout-manager
# Jawaban pertanyaan refleksi pada bagian G:
Mengapa Null Layout dan Absolute Layout sebaiknya dihindari?   Karena posisi dan ukuran komponen diatur secara manual berdasarkan koordinat piksel mutlak, sehingga tampilan form tidak responsif—akan berantakan, terpotong, atau bertumpuk saat ukuran jendela diubah atau dibuka di layar dengan resolusi berbeda.

Jelaskan perbedaan perilaku FlowLayout dan GridLayout saat jendela dilebarkan:   
FlowLayout: Komponen mengalir berderet seperti teks; jika jendela dilebarkan, komponen tetap pada ukuran aslinya dan hanya bergeser menyesuaikan ruang baris.
GridLayout: Komponen dibagi rata dalam petak (grid); jika jendela dilebarkan, ukuran setiap komponen akan ikut meregang menyesuaikan ukuran petak selnya.

Apa fungsi Weight X dan Fill pada constraint GridBagLayout?   
Weight X: Menentukan seberapa besar bagian ruang horizontal tambahan yang akan diterima komponen saat jendela dilebarkan.
Fill: Mengatur apakah komponen akan ikut meregang (stretch) untuk mengisi penuh area sel secara horizontal, vertikal, atau keduanya.

Mengapa formPanel dibungkus isiPanel dan diletakkan di North?   
Agar komponen form peninputan tersusun rapi di bagian atas (top) dan tidak ikut merenggang ke bawah memenuhi seluruh halaman saat jendela ditinggikan.

Sebutkan dua prinsip desain yang Anda terapkan pada Form Anggota Perpustakaan dan tunjukkan buktinya:   Keselarasan/Alignment (Visual Order): Semua label dan kotak teks tersusun lurus dan sejajar di dalam panel.
Konsistensi Jangkauan Ruang (Spacing): Penggunaan jarak (margin/padding) antar komponen yang seragam sehingga form terlihat rapi dan profesional.
[Pertanyaan refleksi G.txt](https://github.com/user-attachments/files/33916698/Pertanyaan.refleksi.G.txt)


# Foto sketsa form dan tabel rancangan;
<img width="720" height="1280" alt="WhatsApp Image 2026-10-16 at 20 41 18" src="https://github.com/user-attachments/assets/16b56bc8-5619-441d-b7a9-38bb7b84f1ad" />
<img width="720" height="1280" alt="WhatsApp Image 2026-10-16 at 20 30 12" src="https://github.com/user-attachments/assets/d8fefaee-d095-48d7-a4ef-3661ad27221a" />



# Dua tangkapan layar (screenshot) FormAnggotaPerpustakaan saat dijalankan: ukuran awal dan saat dilebarkan.
<img width="672" height="433" alt="Screenshot 2026-10-16 193947" src="https://github.com/user-attachments/assets/f01682e7-3c85-428a-a618-508f5397451f" />
<img width="421" height="440" alt="Screenshot 2026-10-16 193926" src="https://github.com/user-attachments/assets/be653d57-c550-44d1-a408-7249f2771050" />


# Satu tangkapan layar (screenshot) tab Design FormAnggotaPerpustakaan yang memperlihatkan susunan panel dan layout di jendela Navigator.
<img width="223" height="129" alt="Screenshot 2026-10-16 195607" src="https://github.com/user-attachments/assets/d1f04517-3dd5-4511-9bc5-4d0a1cfc1e98" />
<img width="276" height="353" alt="Screenshot 2026-10-16 195552" src="https://github.com/user-attachments/assets/1d897030-4eab-4615-8dd2-c56378caff21" />


# Jawaban eksperimen Praktikum 2 dan Praktikum 4, serta saran dari teman pada Tahap 4.
[Eksperimen praktikum 2.txt](https://github.com/user-attachments/files/33916753/Eksperimen.praktikum.2.txt)
[Eksperimen praktikum 4.txt](https://github.com/user-attachments/files/33916756/Eksperimen.praktikum.4.txt)
Nomor 1 (Weight X menjadi 0.0):
Kotak isian (namaField) tidak ikut melebar saat jendela dilebarkan, ukurannya tetap seperti semula karena tidak ada alokasi penambahan ukuran (weight).

Nomor 2 (Direction dari North ke Center):
formPanel akan ikut meregang (stretch) memenuhi ruang kosong secara vertikal saat jendela ditinggikan, tidak seperti posisi North yang ukurannya tetap di atas.

Nomor 3 (Hapus setMinimumSize):
Bagian bawah form atau tombol (seperti tombol Batal/Simpan) akan lebih dulu terpotong/rusak karena jendela bisa diperkecil secara bebas tanpa batas minimum.

# Deklarasi penggunaan AI: sebutkan alat yang dipakai dan untuk keperluan apa, atau buat pernyataan jika tidak memakai AI.
[Deklarasi AI.txt](https://github.com/user-attachments/files/33916763/Deklarasi.AI.txt)
Saya menggunakan AI untuk:
-Membuat code untuk file Readme
-Menjawab Eksperimen 2 dan 4
-Menjawab pertanyaan refleksi pada bagian G
-untuk mengecek apakah tugas sudah sesuai dengan kriteria penilaian



# p05-event-handling
# Tabel pengamatan Praktikum 2 yang sudah diisi:
<img width="475" height="172" alt="Screenshot 2026-10-24 094356" src="https://github.com/user-attachments/assets/2548790d-d2f7-4b35-ae17-589d5843f833" />


# Jawaban eksperimen Praktikum 3 dan Praktikum 4:
1.Berapa kali pesan tercetak setiap pilihan diganti?
Tercetak 2 kali.   
Alasan: Karena setiap pergantian pilihan melibatkan dua status perubahan, yaitu item lama yang dilepas (deselected) dan item baru yang dipilih (selected).

2.Mengapa hasil yang tampil terlambat satu karakter?
Karena event keyPressed merespons saat tombol mulai ditekan, sebelum karakter tersebut benar-benar dimasukkan ke dalam komponen teks. Akibatnya, fungsi konversi() membaca nilai teks sebelum karakter terakhir sempat terbaca.

3.Apa yang muncul di jendela Output jika blok try-catch dihapus dan diketik huruf?
Muncul pesan error berupa NumberFormatException.   
Alasan: Program gagal mengonversi input huruf/teks biasa menjadi tipe data angka (seperti double atau int), sehingga terjadi kesalahan (exception) yang menghentikan proses konversi.
[Eksperimen Praktikum 3-p05.txt](https://github.com/user-attachments/files/33916785/Eksperimen.Praktikum.3-p05.txt)
[eksperimen praktikum 4-p05.txt](https://github.com/user-attachments/files/33916791/eksperimen.praktikum.4-p05.txt)
Pertanyaan 1:
Berapa kali pesan tercetak? 
Tercetak 2 kali.   
Alasan: Karena ada dua event handler yang aktif secara bersamaan (ekspresi lambda di konstruktor dan method actionPerformed dari menu Events), sehingga keduanya sama-sama menjalankan perintah saat tombol diklik.
Mengapa satu tombol sebaiknya hanya memakai satu cara? 
Agar kode lebih bersih, terhindar dari duplikasi eksekusi aksi, dan tidak membingungkan saat proses debugging.

Pertanyaan 2:
Tab Design: Menambahkan komponen tombol baru (Button) ke dalam form, mengubah teks atau labelnya menjadi %, serta mengatur nama variabelnya (misal: modButton).
Tab Source: Menambahkan kode event handler atau fungsi logika perhitungan matematika yang menggunakan operator modulus (%) untuk menghitung sisa bagi.

Pertanyaan 3:
Mengapa kursor langsung berada di isian pertama? 
Karena pada baris kode tombol Hapus terdapat perintah pemfokusan (seperti .requestFocus()) yang sengaja diarahkan ke kolom isian pertama agar pengguna bisa langsung mengetik kembali tanpa harus mengklik kolom tersebut secara manual.


# Peta event pada FormAnggotaPerpustakaan:
<img width="211" height="165" alt="Screenshot 2026-10-24 101803" src="https://github.com/user-attachments/assets/7c69d3c7-c305-4694-8120-f91f0f537ee1" />
<img width="206" height="167" alt="Screenshot 2026-10-24 101630" src="https://github.com/user-attachments/assets/26227758-5c5b-46df-aa40-f7f04e55b796" />
<img width="182" height="159" alt="Screenshot 2026-10-24 101621" src="https://github.com/user-attachments/assets/9e290ca3-8415-4281-9089-29dea6a7bb08" />
<img width="209" height="175" alt="Screenshot 2026-10-24 101602" src="https://github.com/user-attachments/assets/22ef997d-17c4-4b99-a2b3-d78976024659" />
<img width="202" height="159" alt="Screenshot 2026-10-24 101456" src="https://github.com/user-attachments/assets/986cac7a-812d-4ef3-823a-37302eb84a32" />


# Tangkapan layar jendela Properties bagian Events untuk tombol Daftar:
<img width="201" height="154" alt="Screenshot 2026-10-24 095744" src="https://github.com/user-attachments/assets/de545dde-3fd3-40a2-9bd2-f1dcb892bc7c" />


# Tangkapan layar dialog ringkasan:
<img width="808" height="379" alt="Screenshot 2026-10-24 095954" src="https://github.com/user-attachments/assets/b1b31621-91df-49bc-9525-257c5815938d" />

# Tangkapan layar dialog konfirmasi keluar:
<img width="773" height="380" alt="Screenshot 2026-10-24 100013" src="https://github.com/user-attachments/assets/3c495d0d-44a5-4d0e-bd00-6a7050f102b4" />


# Deklarasi penggunaan AI :
Saya Menggunakan Ai untuk :
1. Mengembangkan Form Anggota Perpustakaan
2. Menjawab Eksperimen
3. Mengecek Apakah Tugas sudah sesuai dengan kriteria penilaian

[Deklarasi AI p05.txt](https://github.com/user-attachments/files/33916822/Deklarasi.AI.p05.txt)
