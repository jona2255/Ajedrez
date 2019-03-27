package com.company;

import java.util.Scanner;

public class Jugador {

    Scanner scanner = new Scanner(System.in);

    String nick;

    Reglas reglas;

    boolean ganador = false;

    String nick(String jugador){

        System.out.println("Introduce tu nombre de Jugador " + jugador +": ");
        nick =  scanner.nextLine();
        System.out.println();

        return nick;
    }


}
