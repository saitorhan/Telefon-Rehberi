/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telefon;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.JOptionPane;
/**
 *
 * @author Sait
 */
public class yeniKayit extends javax.swing.JFrame {

    private Connection baglan;
    /**
     * Creates new form yeniKayit
     */
    public yeniKayit() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtisim = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtsoyisim = new javax.swing.JTextField();
        txttelefon = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAdres1 = new javax.swing.JTextField();
        txtAdres2 = new javax.swing.JTextField();
        txtilce = new javax.swing.JTextField();
        txtsehir = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yeni Kayıt Alma");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jButton1.setText("Kayıt Ekle");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("İsim: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Soyisim: ");

        txttelefon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txttelefonKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttelefonKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Telefon: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("E-mail: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Adres: ");

        txtilce.setText("İlçe");
        txtilce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtilceMousePressed(evt);
            }
        });

        txtsehir.setText("İl");
        txtsehir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtsehirMousePressed(evt);
            }
        });
        txtsehir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsehirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtilce, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtsehir, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                            .addComponent(txtisim)
                            .addComponent(txtsoyisim)
                            .addComponent(txttelefon)
                            .addComponent(txtmail)
                            .addComponent(txtAdres1)
                            .addComponent(txtAdres2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtisim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtsoyisim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAdres1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAdres2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtilce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsehir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtsehirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsehirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsehirActionPerformed

    private void txtilceMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtilceMousePressed
txtilce.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txtilceMousePressed

    private void txtsehirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsehirMousePressed
txtsehir.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txtsehirMousePressed

    private void txttelefonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefonKeyPressed

    boolean mailkontrol()
    {
        return txtisim.getText().length()>0 && txtsoyisim.getText().length()>0 &&(txtmail.getText().length()>0 ? txtmail.getText().indexOf("@")>0 : true);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(txttelefon.getText().length()==10)
       {
        try{
               Class.forName("com.mysql.jdbc.Driver");
               baglan= DriverManager.getConnection("jdbc:mysql://localhost:3306/rehberim","root","2569");
               Statement komut= baglan.createStatement();
                ResultSet sonuc = komut.executeQuery("SELECT COUNT(*) FROM rehber WHERE isim='"+txtisim.getText()+"' AND soyisim='"+txtsoyisim.getText()+"'");
                sonuc.next();
                int sayi = sonuc.getInt(1);
               if(sayi==0 && mailkontrol())
               {
               komut.executeUpdate("INSERT INTO rehber(isim,soyisim,telefon,mail,adres) values('"+
                       txtisim.getText() +
                       "','" + txtsoyisim.getText()+
                       "','" + txttelefon.getText()+
                       "','" + txtmail.getText() +
                       "','" + txtAdres1.getText()+txtAdres2.getText()
                       +txtilce.getText()+txtsehir.getText()+"')");
       JOptionPane.showMessageDialog(rootPane, "Kayıt başarı ile eklendi.");
        this.show(false);
               }
               else
                   JOptionPane.showMessageDialog(rootPane, "Girilen isim ve soyisimle daha önce kayıt alınmış!");
      
       }
       catch(ClassNotFoundException | SQLException | HeadlessException hata){
         JOptionPane.showMessageDialog(rootPane, hata.toString());
       }
       }
       else
           JOptionPane.showMessageDialog(rootPane, "Telefon numarasını eksik girdiniz.");
       // System.out.println(sql);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void txttelefonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonKeyReleased
        if(Character.isAlphabetic(evt.getKeyChar()))
             txttelefon.setText(txttelefon.getText().substring(0, txttelefon.getText().length()-1));
        if(txttelefon.getText().length()>=10)
        {
           txttelefon.setText(txttelefon.getText().substring(0, 10));
        }
    }//GEN-LAST:event_txttelefonKeyReleased
private void temizle()
{
                       txtisim.setText(" ");
                       txtsoyisim.setText(" ");
                       txttelefon.setText(" ");
                       txtmail.setText(" ");
                       txtAdres1.setText(" ");
                       txtAdres2.setText(" ");
                       txtilce.setText(" ");
                       txtsehir.setText(" ");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(yeniKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(yeniKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(yeniKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(yeniKayit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new yeniKayit().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAdres1;
    private javax.swing.JTextField txtAdres2;
    private javax.swing.JTextField txtilce;
    private javax.swing.JTextField txtisim;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtsehir;
    private javax.swing.JTextField txtsoyisim;
    private javax.swing.JTextField txttelefon;
    // End of variables declaration//GEN-END:variables
}
