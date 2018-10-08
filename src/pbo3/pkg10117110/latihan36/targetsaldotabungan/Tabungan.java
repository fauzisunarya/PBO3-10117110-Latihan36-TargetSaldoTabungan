
package pbo3.pkg10117110.latihan36.targetsaldotabungan;


public class Tabungan {
        public int i,saldoAwal,bunga,jmlhBunga,saldoTarget;
        public String mataUang;
        
public void Perhitungan(){
        
        i=1; 
        while (saldoAwal <= saldoTarget) {
           
            jmlhBunga = saldoAwal*bunga/100;
            saldoAwal += jmlhBunga;

            mataUang = String.format("Rp.%,3d", saldoAwal).replaceAll
                                                (",", ".");
            System.out.printf("Saldo di bulan ke-"+i+" %s%n",mataUang);
            i++;
        }  
}        

    
}
