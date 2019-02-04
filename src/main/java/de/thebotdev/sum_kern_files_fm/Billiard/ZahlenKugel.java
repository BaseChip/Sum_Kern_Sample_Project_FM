package de.thebotdev.sum_kern_files_fm.Billiard;

import sum.kern.Buntstift;
import sum.werkzeuge.Rechner;

public class ZahlenKugel extends Kugel {
    private Buntstift meinStift;
    private Rechner rechner;
    private double radius;
    private int color;
    private double speed;
    private Tisch tisch;


    public ZahlenKugel(int y, int x, double radius, boolean forard, double speed, Tisch tisch) {
        super(y, x, radius, forard, speed, tisch);
        meinStift = new Buntstift();
        rechner = new Rechner();
        meinStift.bewegeBis(x, y);
        this.radius = radius;
        this.tisch = tisch;
        this.color = rechner.ganzeZufallsZahl(1, 9);
        if (!forard){
            meinStift.dreheUm(180);
        }
        this.speed = speed;
        meinStift.schreibeZahl(1);
        meinStift.dreheUm(rechner.ganzeZufallszahl(1, 100));
    }

    public void zeichne(){
        meinStift.setzeFarbe(color);
        meinStift.setzeFuellmuster(1);
        meinStift.zeichneKreis(radius);
        meinStift.setzeFarbe(11);
        meinStift.schreibeZahl(1);
    }

}
