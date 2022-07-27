/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom10_qlx;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class QuanLyLoaiXe {

    ArrayList<LoaiXe> dsLoai = new ArrayList<LoaiXe>();
    public java.sql.PreparedStatement ps;
    public Connection con;
    public ResultSet rs;

    public void themLoaiXe(LoaiXe ls) {
        try {
            con = Connect.getConnection();
            String sql = "INSERT INTO `loaixe`(`maLoai`, `tenLoai`, `xuatXu`) VALUES (?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, ls.getMaLoai());
            ps.setString(2, ls.getTenLoai());
            ps.setString(3, ls.getXuatXu());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thêm Không Thành Công !!" + e);
        }
    }

    public void xoaLoaiXe(LoaiXe ls) {
        try {
            con = Connect.getConnection();
            String sql = "DELETE FROM `loaixe` WHERE `maLoai` = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, ls.getMaLoai());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Xóa Không Thành Công !!" + e);
        }
    }

    public void suaLoaiXe(LoaiXe ls) {
        try {
            con = Connect.getConnection();
            String sql = "UPDATE `loaixe` SET `maLoai`=?,`tenLoai`=?,`xuatXu`=? WHERE `maLoai`=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, ls.getMaLoai());
            ps.setString(2, ls.getTenLoai());
            ps.setString(3, ls.getXuatXu());
            ps.setString(4, ls.getMaLoai());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sửa Không Thành Công !!" + e);
        }
    }

    public ArrayList<LoaiXe> hienthiLoai() throws ClassNotFoundException {
        dsLoai.clear();
        Connection con = Connect.getConnection();
        Statement st = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM `loaixe`";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                LoaiXe loaixe = new LoaiXe();
                loaixe.setMaLoai(rs.getString("MaLoai"));
                loaixe.setTenLoai(rs.getString("TenLoai"));
                loaixe.setXuatXu(rs.getString("XuatXu"));
                dsLoai.add(loaixe);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsLoai;
    }
}
