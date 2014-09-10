package view;

import control.Control;

import java.util.Scanner;

/**
 * Created by david on 02/09/14.
 */
public class LJRol {
    private Control ctrl;
    private Scanner sc;

    public LJRol(){
        int op;
        System.out.println("############## RPG Game ##############");
        sc = new Scanner(System.in);
        do {
            printMenu();
            op = Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                    ctrl = new Control();
                    ctrl.startGame(); // only 4 test
                    break;
                case 2:
                    System.out.println("To implement");
                    break;
                case 3:
                    System.out.println("Good bye!");
                    break;
                default:
                    break;
            }
        }while(op!=3);
    }

    public void printMenu(){
        System.out.println("1-StartGame");
        System.out.println("2-Options");
        System.out.println("3-Exit");
        System.out.println("choose an option");
    }

    public static void main(String[] args) {
        new LJRol();
    }
}
