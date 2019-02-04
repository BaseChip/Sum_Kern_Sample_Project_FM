package de.thebotdev.sum_kern_files_fm.Billiard;

import sum.kern.Buntstift;

public class Tisch {
    private Buntstift meinStift;
    private int pH;
    private int pV;
    private int pBreite;
    private int pHoehe;
    private int pFarbe;
    public Tisch(int pH, int pV, int pBreite, int pHoehe, int pFarbe){
        meinStift = new Buntstift();
        this.pH = pH;
        this.pV = pV;
        this.pBreite = pBreite;
        this.pHoehe = pHoehe;
        this.pFarbe = pFarbe;
    }

    public void zeichneTisch(){
        meinStift.hoch();
        meinStift.bewegeBis(pH, pV);
        meinStift.runter();
        meinStift.setzeFarbe(pFarbe);
        meinStift.zeichneRechteck(pBreite, pHoehe);
    }

    public int getpBreite() {
        return pBreite;
    }

    public int getpHoehe() {
        return pHoehe;
    }

    public int getpH() {
        return pH;
    }

    public int getpV() {
        return pV;
    }
}
