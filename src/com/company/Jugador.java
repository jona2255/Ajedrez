package com.company;

import java.util.Scanner;

public class Jugador {

    Scanner scanner = new Scanner(System.in);

    String nick;

    boolean ganador = false;

    String nick(){

        System.out.println("Introduce el nombre del Jugador: ");
        nick =  scanner.nextLine();
        System.out.println();

        return nick;
    }


}
