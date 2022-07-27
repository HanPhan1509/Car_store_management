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
public class SanPham {
    ArrayList<Xe> dsXe = new ArrayList<Xe>();
    public java.sql.PreparedStatement ps;
    public Connection con;
    public ResultSet rs;
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
                x.setTenXe(rs.getString("TenXe"));
                x.setMaLoai(rs.getString("TenLoai"));
                x.setXuatXu(rs.getString("XuatXu"));
                x.setDungTich(rs.getString("DungTich"));
                x.setDonGia(rs.getString("Gia"));
                dsXe.add(x);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hiển thị không Thành Công !!" + e);
        }
        return dsXe;
    }
   
}
