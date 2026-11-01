package id.ac.uniska.pbo2.p07;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class BukuTableModel extends AbstractTableModel {
    private final List<Buku> list = new ArrayList<>();
    private final String[] kolom = {"Kode", "Judul", "Penulis", "Tahun Terbit", "Status"};

    @Override
    public int getRowCount() { return list.size(); }

    @Override
    public int getColumnCount() { return kolom.length; }

    @Override
    public String getColumnName(int columnIndex) { return kolom[columnIndex]; }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Buku buku = list.get(rowIndex);
        return switch (columnIndex) {
            case 0 -> buku.getKode();
            case 1 -> buku.getJudul();
            case 2 -> buku.getPenulis();
            case 3 -> buku.getTahunTerbit();
            case 4 -> buku.getStatus();
            default -> null;
        };
    }

    public void tambah(Buku buku) {
        list.add(buku);
        fireTableRowsInserted(list.size() - 1, list.size() - 1);
    }

    public void ubah(int index, Buku buku) {
        list.set(index, buku);
        fireTableRowsUpdated(index, index);
    }

    public void hapus(int index) {
        list.remove(index);
        fireTableRowsDeleted(index, index);
    }

    public Buku get(int index) { return list.get(index); }
}