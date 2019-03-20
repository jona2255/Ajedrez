package com.company;

public class Piezas {

    int esp = 0;
    int tub = 10;
    int gion = 9;


    String colorNegro = "\033[30;";
    String colorBlanco = "\033[97";
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
        } else if (pos == rey.KN || pos == rey.KB) {
            System.out.print("K");
        } else if (pos == reina.QB || pos == reina.QN) {
            System.out.print("Q");
        } else if (pos == alfil.AB || pos == alfil.AN) {
            System.out.print("A");
        } else if (pos == caballo.CB || pos == caballo.CN){
            System.out.print("C");
        } else if (pos == torre.TB || pos == torre.TN){
            System.out.print("T");
        } else if (pos == peon.PB || pos == peon.PN){
            System.out.print("P");
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

}
