package id.ac.uniska.pbo2.p02.perpustakaan.mini;

import java.util.List;

/**
 * Menjalankan skenario Perpustakaan Mini.
 */
public class AplikasiPerpustakaan {

    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        // =========================
        // MENAMBAHKAN KOLEKSI
        // =========================

        perpus.tambah(
                new Buku(
                        "B001",
                        "Laskar Pelangi",
                        2005,
                        "Andrea Hirata"
                )
        );

        perpus.tambah(
                new Buku(
                        "B002",
                        "Clean Code",
                        2008,
                        "Robert C. Martin"
                )
        );

        perpus.tambah(
                new Majalah(
                        "M001",
                        "Majalah Teknologi Kita",
                        2026,
                        "Agustus"
                )
        );

        // Skripsi sesuai latihan mandiri
        perpus.tambah(
                new Skripsi(
                        "S001",
                        "Sistem Informasi Perpustakaan",
                        2026,
                        "Siti Rahmah",
                        "Teknik Informatika"
                )
        );

        // =========================
        // DATA ANGGOTA
        // =========================

        Anggota siti =
                new Anggota("2410010123", "Siti Rahmah");

        Anggota budi =
                new Anggota("2410010456", "Budi Santoso");

        // =========================
        // DAFTAR KOLEKSI
        // =========================

        tampilkanDaftar(perpus);

        System.out.println();

        // =========================
        // PENCARIAN JUDUL
        // =========================

        System.out.println("=== Pencarian Judul ===");

        String kataKunci = "code";

        List<Koleksi> hasil =
                perpus.cariJudul(kataKunci);

        System.out.println(
                "Hasil pencarian \"" + kataKunci
                + "\": " + hasil.size() + " koleksi"
        );

        for (Koleksi k : hasil) {
            System.out.println(k);
        }

        System.out.println();

        // =========================
        // PEMINJAMAN
        // =========================

        cetakPinjam(
                perpus,
                "B002",
                siti
        );

        cetakPinjam(
                perpus,
                "B002",
                budi
        );

        cetakPinjam(
                perpus,
                "M001",
                budi
        );

        // =========================
        // PEMINJAMAN SKRIPSI
        // =========================

        cetakPinjam(
                perpus,
                "S001",
                siti
        );

        System.out.println();

        // =========================
        // PENGEMBALIAN
        // =========================

        cetakKembali(
                perpus,
                "B002",
                2
        );

        cetakKembali(
                perpus,
                "M001",
                3
        );

        System.out.println();

        // =========================
        // JUMLAH TERSEDIA
        // =========================

        System.out.println(
                "Koleksi tersedia: "
                + perpus.jumlahTersedia()
                + " dari "
                + perpus.getDaftarKoleksi().size()
        );
    }

    /**
     * Menampilkan semua koleksi.
     */
    private static void tampilkanDaftar(
            Perpustakaan perpus) {

        System.out.println("=== Daftar Koleksi ===");

        for (Koleksi k : perpus.getDaftarKoleksi()) {
            System.out.println(k);
        }
    }

    /**
     * Menampilkan hasil peminjaman.
     */
    private static void cetakPinjam(
            Perpustakaan perpus,
            String kode,
            Anggota anggota) {

        boolean berhasil =
                perpus.pinjam(kode, anggota);

        System.out.println(
                anggota.nama()
                + " meminjam "
                + kode
                + ": "
                + (berhasil
                    ? "berhasil"
                    : "gagal")
        );
    }

    /**
     * Menampilkan hasil pengembalian.
     */
    private static void cetakKembali(
            Perpustakaan perpus,
            String kode,
            int hariTerlambat) {

        long denda =
                perpus.kembalikan(
                        kode,
                        hariTerlambat
                );

        System.out.println(
                "Pengembalian "
                + kode
                + " terlambat "
                + hariTerlambat
                + " hari, denda Rp"
                + denda
        );
    }
}