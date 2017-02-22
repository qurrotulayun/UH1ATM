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
class transfer {
   private int saldo;
   private int rek;
   private int jml;
   int c;
    public void trns(int tab, int a, int b) {
      saldo = tab-a;
      rek = b;
      jml =a;
      c=JOptionPane.showConfirmDialog(null, "Anda Akan Transfer Sebesar : "+a +" \n Deangan nomer rekening : "+b,"Transfer", JOptionPane.YES_NO_OPTION,0);
      if(c==0) {
          JOptionPane.showMessageDialog(null, "Transfer Berhasil \n Saldo Anda saat ini sebesar : "+saldo);
      }
    }

    int getsaldo() {
       return saldo;
    }
   
}
