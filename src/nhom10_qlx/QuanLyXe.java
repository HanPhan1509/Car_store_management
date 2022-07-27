/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom10_qlx;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class QuanLyXe {

    ArrayList<Xe> dsXe = new ArrayList<Xe>();
    public java.sql.PreparedStatement ps;
    public Connection con;
    public ResultSet rs;

    public void themXe(Xe x) {
        try {
            con = Connect.getConnection();
            String sql = "INSERT INTO `xe`(  `maXe`, `tenXe`, `tenLoai`, `xuatXu`, `dungTich`, `soLuong`, `gia`) VALUES(?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, x.getMaXe());
            ps.setString(2, x.getTenXe());
            ps.setString(3, x.getMaLoai());
            ps.setString(4, x.getXuatXu());
            ps.setString(5, x.getDungTich());
            ps.setString(6, x.getSoLuong());
            ps.setString(7, x.getDonGia());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thêm Không Thành Công !!" + e);
        }
    }

    public void suaXe(Xe x) {
        try {
            con = Connect.getConnection();
            String sql = "UPDATE `xe` SET `maXe`=?, `tenXe`=?,`tenLoai`=?,`xuatXu`=?,`dungTich`=?,`soLuong`=?,`gia`=? WHERE `maXe`=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, x.getMaXe());
            ps.setString(2, x.getTenXe());
            ps.setString(3, x.getMaLoai());
            ps.setString(4, x.getXuatXu());
            ps.setString(5, x.getDungTich());
            ps.setString(6, x.getSoLuong());
            ps.setString(7, x.getDonGia());
            ps.setString(8, x.getMaXe());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sửa Không Thành Công !!" + e);
        }
    }

    public void xoaXe(Xe x) {
        try {
            con = Connect.getConnection();
            String sql = "DELETE FROM `xe` WHERE `maXe`= ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, x.getMaXe());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Xóa Không Thành Công !!" + e);
        }
    }

    public boolean timKiem(String maXe) throws ClassNotFoundException {
        dsXe.clear();
        con = Connect.getConnection();
        ResultSet rs = null;
        try {

            String sql = "SELECT * FROM `xe` WHERE `maXe` = ? ";
            ps = con.prepareStatement(sql);
            ps.setString(1, maXe);
            rs = ps.executeQuery();
            while (rs.next()) {
                Xe x1 = new Xe();
                x1.setMaXe(rs.getString("MaXe"));
                x1.setTenXe(rs.getString("TenXe"));
                x1.setMaLoai(rs.getString("TenLoai"));
                x1.setXuatXu(rs.getString("XuatXu"));
                x1.setDungTich(rs.getString("DungTich"));
                x1.setSoLuong(rs.getString("SoLuong"));
                x1.setDonGia(rs.getString("Gia"));
                dsXe.add(x1);
                return true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tìm Không Thành Công !!" + e);
        }
        return false;
    }

    public ArrayList<Xe> hienThiXe() throws ClassNotFoundException {
        dsXe.clear();
        Connection con = Connect.getConnection();
        Statement st = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM `xe`";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                Xe x = new Xe();
                x.setMaXe(rs.getString("MaXe"));
                x.setTenXe(rs.getString("TenXe"));
                x.setMaLoai(rs.getString("TenLoai"));
                x.setXuatXu(rs.getString("XuatXu"));
                x.setDungTich(rs.getString("DungTich"));
                x.setSoLuong(rs.getString("SoLuong"));
                x.setDonGia(rs.getString("Gia"));
                dsXe.add(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hiển thị không Thành Công !!" + e);
        }
        return dsXe;
    }

   
}
