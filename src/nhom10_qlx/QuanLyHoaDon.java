/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom10_qlx;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class QuanLyHoaDon {

    ArrayList<HoaDon> dsHD = new ArrayList<>();
    public java.sql.PreparedStatement ps;
    public Connection con;
    public ResultSet rs;

    public void themHD(HoaDon hd) {
        try {
            con = Connect.getConnection();
            String sql = "INSERT INTO `hoadon`( `hoTen`, `diaChi`, `sdt`, `tenXe`, `tenLoai`, `dungTich`, `xuatXu`, `gia`, `soLuong`, `thanhTien`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, hd.getHoTen());
            ps.setString(2, hd.getDiaChi());
            ps.setString(3, hd.getSdt());
            ps.setString(4, hd.getTenXe());
            ps.setString(5, hd.getTenLoai());
            ps.setString(6, hd.getDungTich());
            ps.setString(7, hd.getXuatXu());
            ps.setString(8, hd.getGia());
            ps.setString(9, hd.getSoLuong());
            ps.setString(10, hd.getThanhTien());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Xuất hóa đơn....");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Thêm Không Thành Công !!" + e);
        }

    }

    public void xapXep(HoaDon hd) throws ClassNotFoundException {

        Connection con = Connect.getConnection();

        try {
            String sql = "SELECT * FROM `hoadon`ORDER BY hoTen ASC";
            ps = con.prepareStatement(sql);
            ps.setString(1, hd.getHoTen());
            ps.execute();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void xoaHD(HoaDon hd) {
        try {
            con = Connect.getConnection();
            String sql = "DELETE FROM `hoadon` WHERE `hoTen` = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, hd.getHoTen());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Xóa Không Thành Công !!" + e);
        }
    }

    public ArrayList<HoaDon> hienThiHD() throws ClassNotFoundException {
        dsHD.clear();
        Connection con = Connect.getConnection();
        Statement st = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM `hoadon`";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                HoaDon hoadon = new HoaDon();
                hoadon.setHoTen(rs.getString("HoTen"));
                hoadon.setDiaChi(rs.getString("DiaChi"));
                hoadon.setSdt(rs.getString("SDT"));
                hoadon.setTenXe(rs.getString("TenXe"));
                hoadon.setTenLoai(rs.getString("TenLoai"));
                hoadon.setDungTich(rs.getString("DungTich"));
                hoadon.setXuatXu(rs.getString("XuatXu"));
                hoadon.setGia(rs.getString("Gia"));
                hoadon.setSoLuong(rs.getString("SoLuong"));
                hoadon.setThanhTien(rs.getString("ThanhTien"));
                dsHD.add(hoadon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsHD;
    }

    boolean xapXep() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
