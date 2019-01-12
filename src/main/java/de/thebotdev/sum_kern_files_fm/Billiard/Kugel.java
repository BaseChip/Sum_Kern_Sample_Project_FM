package de.thebotdev.sum_kern_files_fm.Billiard;
import sum.kern.*;

public class Kugel {
    private Buntstift meinStift;
    private double radius;

    public Kugel(int y, int x, double radius){
        meinStift = new Buntstift();
        meinStift.bewegeBis(x, y);
        this.radius = radius;
    }

    public void bewege(){
        this.loesche();
        meinStift.hoch();
        meinStift.bewegeUm(0.1);
        meinStift.runter();
        this.zeichne();
    }
    public void zeichne(){
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
