package com.mycompany.tokoonline;

public class TokoOnline {

    public static void main(String[] args) {
        
        Barang barang = new Barang();
        Member member = new Member();
        Transaksi transaksi = new Transaksi();
        Laporan laporan = new Laporan();
        
        laporan.laporan(barang);
        laporan.laporan(member);
        transaksi.prosesTransaksi(member, transaksi, barang);
        laporan.laporan(transaksi, barang);
    }
}
