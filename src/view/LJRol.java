package view;

import control.Control;

import java.util.Scanner;

/**
 * Created by david on 02/09/14.
 */
public class LJRol {
    public static void main(String[] args) {
        System.out.println("############## RPG Game ##############");
        System.out.println("1-StartGame");
        System.out.println("2-Options");
        System.out.println("3-Exit");
        new Control().startGame(); // only 4 test
    }
}
