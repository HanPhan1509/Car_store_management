/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhom10_qlx;

/**
 *
 * @author admin
 */
public class HoaDon {

    private String hoTen;
    private String diaChi;
    private String sdt;
    private String tenXe;
    private String tenLoai;
    private String dungTich;
    private String xuatXu;
    private String gia;
    private String soLuong;
    private String thanhTien;

    public HoaDon() {
    }

    public HoaDon(String hoTen, String diaChi, String sdt, String tenXe, String tenLoai, String dungTich, String xuatXu, String gia, String soLuong, String thanhTien) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.tenXe = tenXe;
        this.tenLoai = tenLoai;
        this.dungTich = dungTich;
        this.xuatXu = xuatXu;
        this.gia = gia;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getDungTich() {
        return dungTich;
    }

    public void setDungTich(String dungTich) {
        this.dungTich = dungTich;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }

    public String getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(String thanhTien) {
        this.thanhTien = thanhTien;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "hoTen=" + hoTen + ", diaChi=" + diaChi + ", sdt=" + sdt + ", tenXe=" + tenXe + ", tenLoai=" + tenLoai + ", dungTich=" + dungTich + ", xuatXu=" + xuatXu + ", gia=" + gia + ", soLuong=" + soLuong + ", thanhTien=" + thanhTien + '}';
    }
    
}
