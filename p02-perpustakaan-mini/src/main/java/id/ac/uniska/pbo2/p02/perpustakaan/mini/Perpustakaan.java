package id.ac.uniska.pbo2.p02.perpustakaan.mini;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Mengelola daftar koleksi dan data peminjam.
 */
public class Perpustakaan {

    private final List<Koleksi> daftarKoleksi = new ArrayList<>();

    private final Map<String, Anggota> peminjam = new HashMap<>();

    /**
     * Menambahkan koleksi.
     */
    public void tambah(Koleksi koleksi) {
        daftarKoleksi.add(koleksi);
    }

    /**
     * Mencari koleksi berdasarkan kode.
     */
    public Koleksi cari(String kode) {

        for (Koleksi k : daftarKoleksi) {

            if (k.getKode().equals(kode)) {
                return k;
            }
        }

        return null;
    }

    /**
     * Mencari koleksi berdasarkan judul.
     * Tidak membedakan huruf besar dan kecil.
     */
    public List<Koleksi> cariJudul(String kataKunci) {

        List<Koleksi> hasil = new ArrayList<>();

        String keyword = kataKunci.toLowerCase();

        for (Koleksi k : daftarKoleksi) {

            if (k.getJudul().toLowerCase().contains(keyword)) {
                hasil.add(k);
            }
        }

        return hasil;
    }

    /**
     * Meminjamkan koleksi kepada anggota.
     */
    public boolean pinjam(String kode, Anggota anggota) {

        Koleksi koleksi = cari(kode);

        if (koleksi == null || !koleksi.pinjam()) {
            return false;
        }

        peminjam.put(kode, anggota);

        return true;
    }

    /**
     * Mengembalikan koleksi dan menghitung denda.
     */
    public long kembalikan(String kode, int hariTerlambat) {

        Koleksi koleksi = cari(kode);

        if (koleksi == null
                || koleksi.getStatus() == StatusKoleksi.TERSEDIA) {

            return 0;
        }

        long denda = koleksi.hitungDenda(hariTerlambat);

        koleksi.kembalikan();

        peminjam.remove(kode);

        return denda;
    }

    /**
     * Mendapatkan anggota yang meminjam.
     */
    public Anggota getPeminjam(String kode) {
        return peminjam.get(kode);
    }

    /**
     * Menghitung jumlah koleksi tersedia.
     */
    public int jumlahTersedia() {

        int jumlah = 0;

        for (Koleksi k : daftarKoleksi) {

            if (k.getStatus() == StatusKoleksi.TERSEDIA) {
                jumlah++;
            }
        }

        return jumlah;
    }

    /**
     * Mengembalikan salinan daftar koleksi.
     */
    public List<Koleksi> getDaftarKoleksi() {
        return List.copyOf(daftarKoleksi);
    }
}