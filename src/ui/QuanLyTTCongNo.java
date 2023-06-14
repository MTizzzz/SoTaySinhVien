package ui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


import model.HoSo;
import model.TableSinhVien;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class QuanLyTTCongNo extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyTTCongNo
     */
    int dongChon = -1;
    ArrayList<HoSo> dshs = new ArrayList<>();
    HoSo hs = new HoSo();
    public QuanLyTTCongNo() {
        initComponents();
        fakeData();
        loadData();
    }
    public void fakeData(){
        HoSo hs1 = new HoSo("001", "Nguyen Van A", "KTPM01");
        dshs.add(hs1);
        HoSo hs2 = new HoSo("002", "Nguyen Van B", "KTPM02");
        dshs.add(hs2);
        HoSo hs3 = new HoSo("003", "Nguyen Van C", "KTPM03");
        dshs.add(hs3);
    }
    public void loadData(){
        tbQLCongNo.setModel(new TableSinhVien(dshs));
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
        panel1 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbQLCongNo = new javax.swing.JTable();
        btnChiTiet1 = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quản lý thông tin công nợ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Danh sách công nợ");

        tbQLCongNo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbQLCongNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbQLCongNoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbQLCongNo);

        btnChiTiet1.setBackground(new java.awt.Color(0, 153, 255));
        btnChiTiet1.setForeground(new java.awt.Color(255, 255, 255));
        btnChiTiet1.setText("Chi tiết");
        btnChiTiet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChiTiet1ActionPerformed(evt);
            }
        });

        btnQuayLai.setBackground(new java.awt.Color(51, 153, 255));
        btnQuayLai.setForeground(new java.awt.Color(255, 255, 255));
        btnQuayLai.setText("< Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(btnChiTiet1))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel4))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnQuayLai)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(141, 141, 141)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnChiTiet1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChiTiet1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChiTiet1ActionPerformed
        dongChon = tbQLCongNo.getSelectedRow();
        try {
            if(dongChon != -1){
                hs = dshs.get(dongChon);
                QuanLyTTCongNoDemo qldm = new QuanLyTTCongNoDemo();
                qldm.show();
                this.hide();
            }else{
                JOptionPane.showConfirmDialog(this,"Vui lòng chọn dòng","Thông báo",JOptionPane.CLOSED_OPTION);
            }
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(this, ex.toString(),"Thông báo",JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnChiTiet1ActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        MenuAdmin admin = new MenuAdmin();
        admin.show();
        this.hide();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void tbQLCongNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbQLCongNoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbQLCongNoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLyTTCongNo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyTTCongNo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyTTCongNo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyTTCongNo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyTTCongNo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChiTiet1;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Panel panel1;
    private javax.swing.JTable tbQLCongNo;
    // End of variables declaration//GEN-END:variables
}
