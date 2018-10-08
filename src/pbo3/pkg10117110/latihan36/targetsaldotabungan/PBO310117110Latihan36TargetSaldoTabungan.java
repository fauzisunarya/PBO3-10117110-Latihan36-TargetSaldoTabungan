


/**
 *
 * @author
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * NIM : 10117110
 * Deskripsi Program : Program Jenis ini Berisi Program Untuk Menampilkan
 * Target Saldo Tabungan Dengan Menggunakan Konsep OOP
 */
package pbo3.pkg10117110.latihan36.targetsaldotabungan;


public class PBO310117110Latihan36TargetSaldoTabungan {


    public static void main(String[] args) {
        
        Tabungan tabungan = new Tabungan();
        tabungan.saldoAwal = 3500000;
        tabungan.bunga = 8;
        tabungan.saldoTarget = 6000000;
        tabungan.Perhitungan();
    }
    
}
