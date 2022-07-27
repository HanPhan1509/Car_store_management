/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom10_qlx;

import nhom10_qlx.Connect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class QuanLyDangNhap {
    ArrayList<DangNhap> listtk = new ArrayList<>();
     public java.sql.PreparedStatement ps;
     public Connection con;
     public ResultSet rs;
     public ArrayList<DangNhap> hienThiList() throws ClassNotFoundException {
        listtk.clear();
        Connection con = Connect.getConnection();
        Statement st = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM `user`";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) 
            {             
                    DangNhap dn = new DangNhap();
                    dn.setUserName(rs.getString("Username"));
                    dn.setPassWord(rs.getString("Password"));
                    
                    listtk.add(dn);              
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listtk;
    }
     
    public void xoaAccount(DangNhap acc){
     try {
            con = Connect.getConnection();
            String sql = "DELETE FROM `user` WHERE `userName` = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, acc.getUserName());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Xóa Không Thành Công!!" + e);
        }
    }
    
    public void suaAccount(DangNhap acc) {
         try {
            con = Connect.getConnection();
            String sql = "UPDATE `user` SET `userName`=?,`passWord`=? WHERE `admin`=?";
            ps = con.prepareStatement(sql);
            ps.setString(1, acc.getUserName());
            ps.setString(2, acc.getPassWord());
            ps.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Sửa Không Thành Công !!" + e);
        }
    }
}
