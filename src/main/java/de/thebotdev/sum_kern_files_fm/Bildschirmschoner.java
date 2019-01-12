package de.thebotdev.sum_kern_files_fm;
import sum.kern.*;
import sum.werkzeuge.*;
/**
 * @author Luki Tuki Muki duumi
 * @version
 */
public class Bildschirmschoner extends java.lang.Object
{
    // Objekte
    Bildschirm derBildschirm;
    Buntstift meinStift;
    Uhr meineUhr;

    public static void main(String[] args) {
        new Bildschirmschoner();
    }
    // Konstruktor
    public Bildschirmschoner()
    {
        derBildschirm = new Bildschirm(1920, 1080);
        meinStift = new Buntstift();
        meineUhr = new Uhr();
        this.run();
    }

    // Dienste
    public void run()
    {
        int g = 1;
        int max = 200;
        while(true){
            this.schnecke(g, 1, max);
            g ++;
            max = max+100;
        }
    }
    public void schnecke(int g, int z, int max){
        meinStift.hoch();
        meinStift.bewegeBis(960, 540);
        meinStift.runter();
        meinStift.normal();
        int t;
        t = 0;
        boolean luki;
        int g2;
        g2 = g;
        luki = false;
        while(true){
            if (z <= max){
                meinStift.bewegeUm(g);
                int randomNum = 1; //ThreadLocalRandom.current().nextInt(3, 8 + 1);
                meinStift.setzeFarbe(randomNum);
                meinStift.dreheUm(90);
                g = g+1;
                meineUhr.warte(10);
                z ++;
                System.out.println(z);
            }
            else{
                meinStift.radiere();
                meinStift.hoch();
                meinStift.bewegeBis(960, 540);
                meinStift.runter();
                g = g2;
                while(z >= 0){
                    meinStift.bewegeUm(g);
                    int randomNum = 1; //ThreadLocalRandom.current().nextInt(3, 8 + 1);
                    meinStift.setzeFarbe(randomNum);
                    meinStift.dreheUm(90);
                    g = g+1;
                    meineUhr.warte(10);
                    z = z-1;
                    System.out.println(z);
//              
//             meinStift.radiere();
//             if(!luki){
//              meinStift.dreheUm(180);
//              meinStift.bewegeUm(g);
//             luki=true;}else{
//                 meinStift.bewegeUm(g);
//                 meinStift.dreheUm(-90);}
//             meinStift.bewegeUm(-g);
//             g = g-1;
//             meineUhr.warte(z);
//             z = z-1;
//             System.out.println(z);
                }
                break;
            }
        }
    }
}