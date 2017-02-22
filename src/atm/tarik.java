/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
class tarik {
    private int saldo;

   public void ambil(int tab, int t) {
        if(t%100!=0)
        JOptionPane.showMessageDialog(null, "Mesin ATM tidak mengeluarkan uang koin"
                + "\n Silahkan Ulangi lagi", "Transaksi Gagal",0);
        else{
            if(t>tab)
                JOptionPane.showMessageDialog(null,"Saldo Anda tidak mencukupi "
                        + "\n Silahkan melakukan penyetoran","Transaksi gagal",0);
            else if (t<5000)
                JOptionPane.showMessageDialog(null,"Besaran minimal pengambilan tunai adalah Rp.50000","Tramsaksi gagal",0);
            else {
                saldo = tab-t;
                JOptionPane.showMessageDialog(null, "Saldo Anda ssat ini sebesar : " +saldo);
                if(tab<=50000)
                    JOptionPane.showMessageDialog(null, "Saldo minimal harus Rp 50000 Segera lakukan penyetoran untuk menghindari penutupan akun","CAUTION",2);
            }
        
        }
    }

   public int getsaldo() {
        return saldo;
    }
    
}
