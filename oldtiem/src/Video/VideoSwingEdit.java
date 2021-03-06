/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Video;

import Group.GroupJFrame;
import Group.GroupJFrameEdit;
import Main.GuestView;
import Main.MenuLoginAdmin;
import com.google.gdata.util.ServiceException;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * Kelas swing video
 * @author asus
 */
public class VideoSwingEdit extends javax.swing.JFrame {
    
    /**
     * Creates new form VideoF
     */
    
    Video V;
    private List<String> L;
    /**
     * Default konstraktor
     */
    public VideoSwingEdit(int kode_id) {
        initComponents();
        id_bayangan.setVisible(false);
        id_bayangan.setText(Integer.toString(kode_id));
        link.setMaximumSize(title.getSize());
        V = new Video();
        inisialisasi();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        no_tubes = new javax.swing.JTextField();
        group_name = new javax.swing.JTextField();
        link = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        id_bayangan = new javax.swing.JLabel();
        bUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Title");

        jLabel2.setText("No Tubes");

        jLabel3.setText("Group Name");

        jLabel4.setText("Link");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        id_bayangan.setText("id_bayangan");

        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(id_bayangan)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(group_name, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(no_tubes)
                            .addComponent(title)
                            .addComponent(link))
                        .addGap(35, 35, 35)
                        .addComponent(jButton1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bUpdate)
                .addGap(168, 168, 168))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(14, 14, 14)
                .addComponent(id_bayangan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no_tubes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(group_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addComponent(bUpdate)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * menutup frame ini
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * 
     * inisialisasi ketika form mulai diaktifkan
     * @param evt 
     */
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();
        final int Width = screenSize.width;
        final int Height = screenSize.height;
        int lebar = (int) this.getSize().getWidth() / 2;
        int tinggi = (int) this.getSize().getHeight() / 2;
        // Setup the frame accordingly
        // This is assuming you are extending the JFrame //class
        this.setLocation((Width/2) - lebar, (Height/2) - tinggi);
    }//GEN-LAST:event_formWindowActivated

    /**
     * menyimpan data yang sudah dirubah
     * @param evt 
     */
    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        if(!cek()){
            JOptionPane.showMessageDialog(rootPane, "Kolom yang kosong harus diisi..!", "KatalogV Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog (null, "Apa anda yakin untuk menyimpan data ini?","Warning",dialogButton);

            if(dialogResult == JOptionPane.YES_OPTION){
                try {
                    V.setTitle(title.getText());
                    V.setNo_tubes(Integer.parseInt(no_tubes.getText()));
                    V.setGroup_name(group_name.getText());
                    V.setLink(link.getText());
                    try {
                        V.Update(Integer.parseInt(id_bayangan.getText()));
                    } catch (NullException ex) {
                        Logger.getLogger(VideoSwingEdit.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    JOptionPane.showMessageDialog(null, "Data berhasil disimpan...");
                    clean();
                    close();
                } catch (AttributeException x) {
                    Logger.getLogger(VideoSwing.class.getName()).log(Level.SEVERE, null, x);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Ada Kesalahan...");
                    Logger.getLogger(VideoSwing.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NumberFormatException nf) {
                    JOptionPane.showMessageDialog(null, "Masukan data sesuai tipenya");
                    Logger.getLogger(VideoSwing.class.getName()).log(Level.SEVERE, null, nf);
                } 
//                catch (AttributeException a) {
//                    JOptionPane.showMessageDialog(null, a.getMessage());
//                    Logger.getLogger(VideoSwing.class.getName()).log(Level.SEVERE, null, a);
//                }
            }
        }
    }//GEN-LAST:event_bUpdateActionPerformed
    
    /**
     * mengecek kekosongan JTeksField
     * @return 
     */
    public boolean cek(){
        return !title.getText().equals("") && !group_name.getText().equals("") && !no_tubes.getText().equals("") && !link.getText().equals("");
    }
    
    /**
     * membersihkan JTeksField
     */
    public void clean(){
        no_tubes.setText("");
        group_name.setText("");
        title.setText("");
        link.setText("");
    }
    
    /**
     * menutup frame ini
     */
    public void close(){
        try {
            GuestView GV = new GuestView();
            GV.setVisible(true);
            GV.RetUbahGrup().setVisible(true);
            GV.RetUbahVideo().setVisible(true);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(GroupJFrameEdit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException | ServiceException ex) {
            Logger.getLogger(VideoSwingEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * inisialisasi tambahan
     */
    public void inisialisasi(){
        try {
            List<String[]> groupEdit= V.SelectDataById(Integer.parseInt(id_bayangan.getText()));
            no_tubes.setText(groupEdit.get(0)[4]);
            group_name.setText(groupEdit.get(0)[5]);
            title.setText(groupEdit.get(0)[1]);
            link.setText(groupEdit.get(0)[2]);
        } catch (SQLException ex) {
            Logger.getLogger(VideoSwingEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bUpdate;
    private javax.swing.JTextField group_name;
    private javax.swing.JLabel id_bayangan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField link;
    private javax.swing.JTextField no_tubes;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}
