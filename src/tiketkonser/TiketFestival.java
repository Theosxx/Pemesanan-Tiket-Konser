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
class TiketFestival extends TiketKonser {
    protected String fasilitasFestival;

    public TiketFestival(String nama_konser, int jumlah_tiket, String fasilitasFestival) {
        super(nama_konser, "Festival", jumlah_tiket);
        this.fasilitasFestival = fasilitasFestival;
    }

    @Override
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Fasilitas Festival: " + fasilitasFestival);
    }
}
