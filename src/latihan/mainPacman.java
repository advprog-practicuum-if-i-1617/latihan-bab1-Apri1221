/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author apriy
 */
public class mainPacman {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        pacman play = new pacman();
        String arah, ulang;

        do {
            int point = 0, langkah = 0;
            play.setAwal();
            int[][] kotak = new int[10][10];
            play.arrayKordinat();
            System.out.println("");
            System.out.println("Selamat datang di PACMANOOB EDITION");

            do {
                for (int i = 0; i <= 9; i++) {
                    for (int j = 0; j <= 9; j++) {
                        if (kotak[i][j] != 2) {
                            kotak[i][j] = 0;
                            if (i == 0 || i == 9 || j == 0 || j == 9 || i == 2 && (j == 1 || j == 2) || i == 6 && (j == 8 || j == 7 || j == 6 || j == 5) || j == 5 && (i == 5 || i == 4) || i == 8 && j == 2) {
                                kotak[i][j] = 1;
                            }
                        }
                    }
                }
                if (kotak[play.getKordinatY()][play.getKordinatX()] == 2) {
                    kotak[play.getKordinatY()][play.getKordinatX()] = 3;
                    point += 1;
                }
                kotak[play.getKordinatY()][play.getKordinatX()] = 3;

                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (kotak[i][j] == 1) {
                            System.out.print("#");
                        } else if (kotak[i][j] == 0) {
                            System.out.print(" ");
                        } else if (kotak[i][j] == 2) {
                            System.out.print("♥");
                        } else if (kotak[i][j] == 3) {
                            System.out.print("☻");
                        }
                    }
                    System.out.println(" ");
                }

                System.out.print("Perintah Gerak\t\t : ");
                arah = in.next();
                switch (arah) {
                    case "a":
                        play.setKiri();
                        if (play.getKordinatX() == 0) {
                            play.setKanan();
                        } else if (kotak[play.getKordinatY()][play.getKordinatX()] == 1) {
                            play.setKanan();
                        }
                        break;
                    case "s":
                        play.setTurun();
                        if (play.getKordinatY() == 9) {
                            play.setNaik();
                        } else if (kotak[play.getKordinatY()][play.getKordinatX()] == 1) {
                            play.setNaik();
                        }
                        break;
                    case "d":
                        play.setKanan();
                        if (play.getKordinatX() == 9) {
                            play.setKiri();
                        } else if (kotak[play.getKordinatY()][play.getKordinatX()] == 1) {
                            play.setKiri();
                        }
                        break;
                    case "w":
                        play.setNaik();
                        if (play.getKordinatY() == 0) {
                            play.setTurun();
                        } else if (kotak[play.getKordinatY()][play.getKordinatX()] == 1) {
                            play.setTurun();
                        }
                        break;
                    //----------Huruf besar------//
                    case "A":
                        play.setKiri();
                        if (play.getKordinatX() == 0) {
                            play.setKanan();
                        } else if (kotak[play.getKordinatY()][play.getKordinatX()] == 1) {
                            play.setKanan();
                        }
                        break;
                    case "S":
                        play.setTurun();
                        if (play.getKordinatY() == 9) {
                            play.setNaik();
                        } else if (kotak[play.getKordinatY()][play.getKordinatX()] == 1) {
                            play.setNaik();
                        }
                        break;
                    case "D":
                        play.setKanan();
                        if (play.getKordinatX() == 9) {
                            play.setKiri();
                        } else if (kotak[play.getKordinatY()][play.getKordinatX()] == 1) {
                            play.setKiri();
                        }
                        break;
                    case "W":
                        play.setNaik();
                        if (play.getKordinatY() == 0) {
                            play.setTurun();
                        } else if (kotak[play.getKordinatY()][play.getKordinatX()] == 1) {
                            play.setTurun();
                        }
                        break;
                    default:
                        System.out.println("salah tombol Pak!");
                }
                langkah += 1;
                System.out.println("Point Anda\t\t : " + point);
                if (langkah > 30 && point < 4) {
                    System.out.println("Anda Kalah Bang");
                    System.out.println("Langkah yang Anda tempuh : " + langkah);
                    break;
                }
            } while (point < 4);

            if (langkah <= 30 && point == 4) {
                System.out.println("Anda Menang Gan!!");
                System.out.println("Langkah yang Anda tempuh : " + langkah);
            }
            System.out.print("Ingin mengulang? (Y/T) :");
            ulang = in.next();
        } while (ulang.equalsIgnoreCase("Y"));
    }
}
