package de.thebotdev.sum_kern_files_fm.Billiard;

import sum.kern.Bildschirm;

public class Main {
    public Bildschirm derBildschirm = new Bildschirm(1200, 800);
    Kugel Kugel1 = new Kugel(100, 500, 15);


    public static void main(String[] args) {
        new Main();
    }
    public Main(){

        this.zeichne_kugeln();
    }
    private void zeichne_kugeln(){
        while (true){
            Kugel1.bewege();
        }
    }
}
