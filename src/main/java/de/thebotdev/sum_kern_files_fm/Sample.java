package de.thebotdev.sum_kern_files_fm;

import sum.kern.*;
import sum.werkzeuge.*;

public class Sample {
    // Objekte
    Bildschirm derBildschirm;
    Buntstift meinStift;
    Uhr meineUhr;

    public static void main(String[] args) {
        new Sample();
    }
    public Sample(){
        derBildschirm = new Bildschirm(1920, 1080);
        meinStift = new Buntstift();
        meineUhr = new Uhr();
        this.run();
    }

    public void run(){
        System.out.println("Project by Falk Michaelis");
        System.out.println('#' * 20);
    }
}
