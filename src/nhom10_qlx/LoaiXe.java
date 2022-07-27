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
public class LoaiXe {
    private String maLoai;
    private String tenLoai;
    private String xuatXu;

    public LoaiXe(String maLoai, String tenLoai, String xuatXu) {
        this.maLoai = maLoai;
        this.tenLoai = tenLoai;
        this.xuatXu = xuatXu;
    }

    public LoaiXe() {
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    @Override
    public String toString() {
        return "LoaiXe{" + "maLoai=" + maLoai + ", tenLoai=" + tenLoai + ", xuatXu=" + xuatXu + '}';
    }
    
}
