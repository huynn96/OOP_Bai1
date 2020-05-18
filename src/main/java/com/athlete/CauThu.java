package com.athlete;

public class CauThu extends VanDongVien {
    private String Caulacbo;
    private int LuongTuan;

    public CauThu(String hoTen, int tuoi, Float chieuCao, Float canNang, String caulacbo, int luongTuan) {
        super(hoTen, tuoi, chieuCao, canNang);
        this.Caulacbo = caulacbo;
        this.LuongTuan = luongTuan;
    }

    public int SoSanh(CauThu obj) {
        if (this.LuongTuan > obj.LuongTuan) {
            return 1;
        } else {
            return this.LuongTuan < obj.LuongTuan ? -1 : super.SoSanh(obj);
        }
    }

    public void Show() {
        System.out.printf("Cầu thủ %s, %d tuổi, cao %.1fm, nặng %.1fkg, đang thi đấu cho CLB %s, hưởng mức lương %d mỗi tuần\n", this.Hoten, this.Tuoi, this.ChieuCao, this.CanNang, this.Caulacbo, this.LuongTuan);
    }
}