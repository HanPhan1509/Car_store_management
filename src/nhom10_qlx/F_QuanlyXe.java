/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom10_qlx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class F_QuanlyXe extends javax.swing.JFrame {

    /**
     * Creates new form F_QuanlyXe
     */
    public F_QuanlyXe() throws ClassNotFoundException {
        initComponents();
        loadCB();
        loadCBXX();
    }
    QuanLyXe lsXe = new QuanLyXe();

    public void loadCB() throws ClassNotFoundException {
        Connection con = Connect.getConnection();
        String sql = "SELECT * FROM `loaixe`";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cbTenLoai.addItem(rs.getString("tenLoai"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void loadCBXX() throws ClassNotFoundException {
        Connection con = Connect.getConnection();
        String sql = "SELECT * FROM `loaixe`";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cbXuatXu.addItem(rs.getString("xuatXu"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaXe = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenXe = new javax.swing.JTextField();
        txtDungTich = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbTenLoai = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbXuatXu = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHienThiXe = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản Lý Xe");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã Xe");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tên Xe");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dung Tích");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tên Loại");

        cbTenLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTenLoaiActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Xuất Xứ");

        cbXuatXu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Số Lượng");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Giá");

        tbHienThiXe.setBackground(new java.awt.Color(204, 204, 204));
        tbHienThiXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Xe", "Tên Xe", "Tên Loại", "Xuất Xứ", "Dung Tích", "Số Lượng", "Giá"
            }
        ));
        tbHienThiXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHienThiXeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbHienThiXe);

        btnThem.setBackground(new java.awt.Color(102, 102, 102));
        btnThem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnTimKiem.setBackground(new java.awt.Color(102, 102, 102));
        btnTimKiem.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(102, 102, 102));
        btnXoa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(102, 102, 102));
        btnSua.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(102, 102, 102));
        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbTenLoai, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMaXe)
                                .addComponent(txtTenXe, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDungTich, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(130, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(338, 338, 338))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDungTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (txtMaXe.getText().equals("") || txtTenXe.getText().equals("") || txtDungTich.getText().equals("") || txtGia.getText().equals("") || cbXuatXu.getSelectedItem().equals(null)) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ !!!");
        } else {
            DefaultTableModel model = (DefaultTableModel) tbHienThiXe.getModel();
            try {
                Xe x = new Xe();
                x.setMaXe(txtMaXe.getText());
                x.setTenXe(txtTenXe.getText());
                x.setMaLoai(cbTenLoai.getSelectedItem().toString());
                x.setXuatXu(cbXuatXu.getSelectedItem().toString());
                x.setDungTich(txtDungTich.getText());
                x.setSoLuong(txtSoLuong.getText());
                x.setDonGia(txtGia.getText());

                lsXe.themXe(x);
                hienThi();
                txtMaXe.setText("");
                txtTenXe.setText("");
                txtDungTich.setText("");
                txtSoLuong.setText("");
                txtGia.setText("");
                cbTenLoai.setSelectedIndex(0);
                cbXuatXu.setSelectedIndex(0);
            } catch (Exception e) {
                e.printStackTrace();

            }
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void tbHienThiXeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHienThiXeMouseClicked
        // TODO add your handling code here:
        try {
            int row = tbHienThiXe.getSelectedRow();
            for (int i = 0; i < tbHienThiXe.getSelectedRowCount(); i++) {
                txtMaXe.setText(tbHienThiXe.getValueAt(row, 0).toString());
                txtTenXe.setText(tbHienThiXe.getValueAt(row, 1).toString());
                cbTenLoai.setSelectedItem(tbHienThiXe.getValueAt(row, 2).toString());
                cbXuatXu.setSelectedItem(tbHienThiXe.getValueAt(row, 3).toString());
                txtDungTich.setText(tbHienThiXe.getValueAt(row, 4).toString());
                txtSoLuong.setText(tbHienThiXe.getValueAt(row, 5).toString());
                txtGia.setText(tbHienThiXe.getValueAt(row, 6).toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tbHienThiXeMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            hienThi();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(F_QuanlyXe.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_formWindowOpened

    private void cbTenLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTenLoaiActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbTenLoaiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) tbHienThiXe.getModel();
        try {
            Xe x = new Xe();
            x.setMaXe(txtMaXe.getText());
            if (txtMaXe.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Bạn cần chọn sản phẩm");
            } else {
                lsXe.xoaXe(x);
                JOptionPane.showMessageDialog(null, "Bạn đã xóa thành công");
            }
            hienThi();
            txtMaXe.setText("");
            txtTenXe.setText("");
            txtDungTich.setText("");
            txtSoLuong.setText("");
            txtGia.setText("");
            cbTenLoai.setSelectedIndex(0);
            cbXuatXu.setSelectedIndex(0);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        if (txtMaXe.getText().equals("") || txtTenXe.getText().equals("") || txtDungTich.getText().equals("") || txtGia.getText().equals("") || cbXuatXu.getSelectedItem().equals(null)) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ !!!");
        } else {
            DefaultTableModel model = (DefaultTableModel) tbHienThiXe.getModel();
            try {
                Xe x = new Xe();
                x.setMaXe(txtMaXe.getText());
                x.setTenXe(txtTenXe.getText());
                x.setMaLoai(cbTenLoai.getSelectedItem().toString());
                x.setXuatXu(cbXuatXu.getSelectedItem().toString());
                x.setDungTich(txtDungTich.getText());
                x.setSoLuong(txtSoLuong.getText());
                x.setDonGia(txtGia.getText());
                lsXe.suaXe(x);
                hienThi();
                JOptionPane.showMessageDialog(null, "Bạn đã sửa thành công");
                txtMaXe.setText("");
                txtTenXe.setText("");
                txtDungTich.setText("");
                txtSoLuong.setText("");
                txtGia.setText("");
                cbTenLoai.setSelectedIndex(0);
                cbXuatXu.setSelectedIndex(0);
            } catch (Exception e) {
                e.printStackTrace();

            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this, "Bạn muốn thoát?", "Thông Báo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (n == 0) {
            this.dispose();
            F_Manhinhchinh fmSDN = new F_Manhinhchinh();
            fmSDN.setVisible(true);

        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tbHienThiXe.getModel();
        try {

            if (lsXe.timKiem(txtMaXe.getText()) == true) {
                model.setRowCount(0);

                for (Xe x : lsXe.dsXe) {
                    String[] array = new String[]{x.getMaXe(), x.getTenXe(), x.getMaLoai(), x.getXuatXu(), x.getDungTich(), x.getSoLuong(), x.getDonGia()};
                    model.addRow(array);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Mã không tồn tại");
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    public void hienThi() throws ClassNotFoundException {
        DefaultTableModel model = (DefaultTableModel) tbHienThiXe.getModel();
        lsXe.hienThiXe();
        model.setRowCount(0);

        for (Xe x : lsXe.dsXe) {
            String[] array = new String[]{x.getMaXe(), x.getTenXe(), x.getMaLoai(), x.getXuatXu(), x.getDungTich(), x.getSoLuong(), x.getDonGia()};
            model.addRow(array);
        }
    }

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
            java.util.logging.Logger.getLogger(F_QuanlyXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F_QuanlyXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F_QuanlyXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F_QuanlyXe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new F_QuanlyXe().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(F_QuanlyXe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbTenLoai;
    private javax.swing.JComboBox<String> cbXuatXu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbHienThiXe;
    private javax.swing.JTextField txtDungTich;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMaXe;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenXe;
    // End of variables declaration//GEN-END:variables
}
