/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apriy
 */
public class pacman {

    private int x, y;
    int[][] kotak = new int[10][10];

    public void setAwal() {
        x = 1;
        y = 1;
    }

    public void setKiri() {
        x -= 1;
    }

    public void setKanan() {
        x += 1;
    }

    public void setNaik() {
        y -= 1;
    }

    public void setTurun() {
        y += 1;
    }

    public int getKordinatX() {
        return x;
    }

    public int getKordinatY() {
        return y;
    }

    public void arrayKordinat() {
        kotak[1][7] = 2;
        kotak[3][1] = 2;
        kotak[5][8] = 2;
        kotak[8][1] = 2;
    }
}
