package com.company;

import java.util.Scanner;

public class Piezas {

    Scanner scanner = new Scanner(System.in);

    int esp = 0;
    int tub = 10;
    int gion = 9;


    String colorNegro = "\033[30m";
    String colorBlanco = "\033[37m";
    String colorReset = "\033[0m";

    Rey rey = new Rey();
    Reina reina = new Reina();
    Alfil alfil = new Alfil();
    Caballo caballo = new Caballo();
    Torre torre = new Torre();
    Peon peon = new Peon();


    void mostrarPieza(int pos) {

        if (pos == esp) {
            System.out.print(pintarPieza(pos) + " ");
        } else if (pos > 0 && pos < 9) {
            System.out.print(pintarPieza(pos) + pos);
        } else if (pos == tub) {
            System.out.print(pintarPieza(pos) + "|");
        } else if (pos == gion) {
            System.out.print(pintarPieza(pos) + "-");
        } else if (pos == 11) {
            System.out.print(pintarPieza(pos) + "A");
        } else if (pos == 12) {
            System.out.print(pintarPieza(pos) + "B");
        } else if (pos == 13) {
            System.out.print(pintarPieza(pos) + "C");
        } else if (pos == 14) {
            System.out.print(pintarPieza(pos) + "D");
        } else if (pos == 15) {
            System.out.print(pintarPieza(pos) + "E");
        } else if (pos == 16) {
            System.out.print(pintarPieza(pos) + "F");
        } else if (pos == 17) {
            System.out.print(pintarPieza(pos) + "G");
        } else if (pos == 18) {
            System.out.print(pintarPieza(pos) + "H");
        }
        else if (pos == rey.KN || pos == rey.KB) {
            System.out.print(pintarPieza(pos) + "K");
        } else if (pos == reina.QB || pos == reina.QN) {
            System.out.print(pintarPieza(pos) + "Q");
        } else if (pos == alfil.AB || pos == alfil.AN) {
            System.out.print(pintarPieza(pos) + "A");
        } else if (pos == caballo.CB || pos == caballo.CN){
            System.out.print(pintarPieza(pos) + "C");
        } else if (pos == torre.TB || pos == torre.TN){
            System.out.print(pintarPieza(pos) + "T");
        } else if (pos == peon.PB || pos == peon.PN){
            System.out.print(pintarPieza(pos) + "P");
        }

    }

    String pintarPieza(int pos){

        if (pos > 30){
          return colorNegro;
        } else if (pos > 20){
            return colorBlanco;
        } else {
            return colorReset;
        }
    }

    String movimientoOrigenPiezas(){

        System.out.println();
        System.out.println("Introduce la posicion de la pieza que quieras mover: ");
        String posInicial = scanner.nextLine();
        return posInicial;
    }
    String movimientoFinalPiezas(){


        System.out.println("Introduce la posicion donde quieras mover la pieza: ");
        String posFinal = scanner.nextLine();
        return posFinal;
    }


}
