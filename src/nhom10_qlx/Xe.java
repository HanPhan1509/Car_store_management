/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom10_qlx;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class Xe {
    private String maXe;
    private String tenXe;
    private String maLoai;
    private String xuatXu;
    private String dungTich;
    private String soLuong;
    private String donGia;

    public Xe() {
    }

    public Xe(String maXe, String tenXe, String maLoai, String xuatXu, String dungTich, String soLuong, String donGia) {
        this.maXe = maXe;
        this.tenXe = tenXe;
        this.maLoai = maLoai;
        this.xuatXu = xuatXu;
        this.dungTich = dungTich;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaXe() {
        return maXe;
    }

    public void setMaXe(String maXe) {
        this.maXe = maXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getDungTich() {
        return dungTich;
    }

    public void setDungTich(String dungTich) {
        this.dungTich = dungTich;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Xe{" + "maXe=" + maXe + ", tenXe=" + tenXe + ", maLoai=" + maLoai + ", xuatXu=" + xuatXu + ", dungTich=" + dungTich + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }
  
}
