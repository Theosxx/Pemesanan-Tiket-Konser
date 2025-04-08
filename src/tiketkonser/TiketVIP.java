/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketkonser;

/**
 *
 * @author adind
 */
class TiketVIP extends TiketKonser {
    protected String fasilitasVIP;

    public TiketVIP(String nama_konser, int jumlah_tiket, String fasilitasVIP) {
        super(nama_konser, "VIP", jumlah_tiket);
        this.fasilitasVIP = fasilitasVIP;
    }

    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Fasilitas VIP: " + fasilitasVIP);
    }
}
