package de.thebotdev.sum_kern_files_fm;

import sum.kern.Bildschirm;
import sum.kern.Buntstift;
import sum.werkzeuge.Uhr;
/**
 * @author Falk Michaelis
 * @version 1.ich_habe_aufgehört_zu_zählen
 */
public class Bildschirmschoner2 {
    // Objekte
    Bildschirm derBildschirm;
    Buntstift meinStift;
    Buntstift textStift;
    Uhr meineUhr;


    public static void main(String[] args) {
        new Bildschirmschoner2();
    }
    public Bildschirmschoner2(){
        derBildschirm = new Bildschirm(1920, 1080);
        meinStift = new Buntstift();
        meineUhr = new Uhr();
        textStift = new Buntstift();
        this.run();
    }

    public void run(){
        System.out.println("Project by Falk Michaelis");
        System.out.println("-------");
        int ins_counter = 600;
        int farb_counter = 1;
        this.setze_mitte(textStift, true);
        this.zeichne_credits(textStift);
        meineUhr.warte(4000);
        this.setze_mitte(textStift, true);
        textStift.radiere();
        this.zeichne_credits(textStift);
        while (true) {
            for (int durch=1; durch <= 3; durch ++) {
                this.setze_mitte(meinStift, null);
                this.zeichne_schnecke(meinStift, farb_counter, ins_counter);
                this.setze_mitte(meinStift, null);
                meinStift.radiere();
                this.zeichne_schnecke(meinStift, farb_counter, ins_counter);
                meinStift.dreheUm(30);
            }
            for(int zeahler = 0; zeahler <= ins_counter/2; zeahler = zeahler + 2){
                this.handler_dreieck(zeahler);
            }
            for(int zeahler = ins_counter/2; zeahler >= 0; zeahler = zeahler - 2){
                this.handler_dreieck(zeahler);
            }
            if (farb_counter <= 10){ farb_counter++; }else {farb_counter = 0;}
        }
    }

    public void zeichne_credits(Buntstift Stift){
        Stift.setzeSchriftgroesse(100);
        Stift.setzeSchriftArt("Georgia");
        Stift.setzeFarbe(0);
        String text = "Bildschirmschoner by Falk Michaelis";
        for(String Buchstabe: text.split("")){
            Stift.schreibeText(Buchstabe);
            meineUhr.warte(10);
        }
    }

    public void handler_dreieck(int zeahler){
        meinStift.dreheBis(0);
        this.setze_mitte(meinStift, null);
        this.zeichne_dreieck(meinStift, zeahler);
        this.setze_mitte(meinStift, null);
        meinStift.radiere();
        this.zeichne_dreieck(meinStift, zeahler);
        meinStift.normal();
    }
    public void setze_mitte(Buntstift Stift, boolean ... vorne){
        Stift.hoch();

        if (vorne == null){
            Stift.bewegeBis(960, 540);
        }else{
            Stift.bewegeBis(0, 540);
        }
        Stift.runter();
        Stift.normal();
    }
    public void zeichne_schnecke(Buntstift Stift, int Farbe, int wiederholung){
        for(int len = 1; len <= wiederholung; len=len+3){
            Stift.bewegeUm(len);
            Stift.setzeFarbe(Farbe);
            meinStift.dreheUm(90);
            meineUhr.warte(10);
        }
    }
    public void zeichne_dreieck(Buntstift Stift, int leange_min){
        meinStift.hoch();
        double x = meinStift.hPosition();
        double y = meinStift.vPosition();
        double lendurch2 = leange_min/2;
        meinStift.bewegeBis(x+lendurch2, y+lendurch2);
        meinStift.runter();
        Stift.dreheBis(120);
        Stift.bewegeUm(leange_min);
        Stift.dreheBis(240);
        Stift.bewegeUm(leange_min);
        Stift.dreheBis(0);
        Stift.bewegeUm(leange_min);
        meineUhr.warte(10);
    }
}