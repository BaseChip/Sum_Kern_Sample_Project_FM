package de.thebotdev.sum_kern_files_fm.Billiard;
import sum.kern.*;
import sum.werkzeuge.*;

public class Kugel {
    private Buntstift meinStift;
    private Rechner rechner;
    private double radius;
    private int color;
    private double speed;
    private Tisch tisch;

    public Kugel(int y, int x, double radius, boolean forard, double speed, Tisch tisch){
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
        meinStift.dreheUm(rechner.ganzeZufallszahl(1, 100));
    }

    public void bewege(){
        this.loesche();
        meinStift.hoch();
        if(meinStift.hPosition() >= tisch.getpBreite()-radius/2) {
            meinStift.dreheUm(180-meinStift.winkel()*2);
        }else if(meinStift.hPosition() <= tisch.getpH()+radius+1.5) {
            meinStift.dreheUm(180-meinStift.winkel()*2);
        }
        if (meinStift.vPosition() >= tisch.getpHoehe()-radius/2){
            meinStift.dreheUm(-meinStift.winkel()*2);
        }else if (meinStift.vPosition() <= tisch.getpV()+radius+1.5){
            meinStift.dreheUm(-meinStift.winkel()*2);
        }
        meinStift.bewegeUm(speed);
        meinStift.runter();
        this.zeichne();
    }
    public void zeichne(){
        meinStift.setzeFarbe(color);
        meinStift.setzeFuellmuster(1);
        meinStift.zeichneKreis(radius);
    }
    
    public void loesche(){
        meinStift.radiere();
        meinStift.setzeFuellmuster(1);
        meinStift.zeichneKreis(radius);
        meinStift.normal();
    }
}
