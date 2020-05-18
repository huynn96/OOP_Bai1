package com.athlete;

import java.util.ArrayList;
import java.util.Comparator;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        VanDongVien p = new VanDongVien("Lionel Messi", 30, 60.75F, 1.6F);
        p.Show();
        ArrayList<CauThu> ListCauThu = new ArrayList<>();
        ListCauThu.add(new CauThu("Lionel Messi", 30, 60.75F, 1.7F, "Barca", 400));
        ListCauThu.add(new CauThu("Wayne Rooney", 30, 60.75F, 1.8F, "MU", 300));
        ListCauThu.add(new CauThu("Cristiano Ronaldo", 30, 60.75F, 1.6F, "Real", 400));
        ListCauThu.sort(new Comparator<CauThu>() {
            public int compare(CauThu c1, CauThu c2) {
                return c1.SoSanh(c2);
            }
        });
        ListCauThu.forEach(CauThu::Show);
    }
}