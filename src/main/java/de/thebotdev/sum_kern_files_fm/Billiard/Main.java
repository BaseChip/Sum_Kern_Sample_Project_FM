package de.thebotdev.sum_kern_files_fm.Billiard;

import sum.kern.Bildschirm;

public class Main {
    public Bildschirm derBildschirm = new Bildschirm(1200, 800);
    Tisch BilliardTisch = new Tisch(10, 10, 1180, 780, 1);
    Kugel Kugel1 = new Kugel(100, 500, 15, true, 0.08, BilliardTisch);
    Kugel Kugel2 = new Kugel(200, 500, 15, false, 0.05, BilliardTisch);
    Kugel Kugel3 = new Kugel(300, 500, 15, true, 0.03, BilliardTisch);
    Kugel Kugel4 = new Kugel(400, 500, 15, false, 0.02, BilliardTisch);
    //ZahlenKugel Kugel5 = new ZahlenKugel(400, 500, 15, false, 0.02, BilliardTisch);


    public static void main(String[] args) {
        new Main();
    }
    public Main(){
        BilliardTisch.zeichneTisch();
        this.zeichne_kugeln();
    }
    private void zeichne_kugeln(){
        while (true){
            Kugel1.bewege();
            Kugel2.bewege();
            Kugel3.bewege();
            Kugel4.bewege();
            //Kugel5.bewege();
        }
    }
}
