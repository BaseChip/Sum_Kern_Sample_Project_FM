package de.thebotdev.sum_kern_files_fm.Billiard;
import sum.kern.*;
import sum.werkzeuge.*;

public class Kugel {
    private Buntstift meinStift;
    private Rechner rechner;
    private double radius;
    private int color;

    public Kugel(int y, int x, double radius){
        meinStift = new Buntstift();
        rechner = new Rechner();
        meinStift.bewegeBis(x, y);
        this.radius = radius;
        this.color = rechner.ganzeZufallsZahl(1, 12);
    }

    public void bewege(){
        this.loesche();
        meinStift.hoch();
        meinStift.bewegeUm(0.1);
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
