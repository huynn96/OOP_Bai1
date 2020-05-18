package com.athlete;

public class VanDongVien {
    protected String Hoten;
    protected int Tuoi;
    protected Float CanNang;
    protected Float ChieuCao;

    public VanDongVien(String hoten, int tuoi, Float canNang, Float chieuCao) {
        this.Hoten = hoten;
        this.Tuoi = tuoi;
        this.CanNang = canNang;
        this.ChieuCao = chieuCao;
    }

    public int SoSanh(VanDongVien obj) {
        if (this.ChieuCao > obj.ChieuCao) {
            return 1;
        } else if (this.ChieuCao < obj.ChieuCao) {
            return -1;
        } else if (this.CanNang > obj.CanNang) {
            return 1;
        } else {
            return this.CanNang < obj.CanNang ? -1 : 0;
        }
    }

    public void Show() {
        System.out.printf("Vận động viên %s, %d tuổi, cao %.1fm, nặng %.1fkg\n", this.Hoten, this.Tuoi, this.ChieuCao, this.CanNang);
    }
}
