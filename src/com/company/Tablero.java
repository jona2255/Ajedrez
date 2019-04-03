package com.company;

public class Tablero {

    int[][] casillas = {{0, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0},
            {8, 10, 32, 10, 33, 10, 34, 10, 35, 10, 36, 10, 34, 10, 33, 10, 32, 10},
            {0, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0},
            {7, 10, 31, 10, 31, 10, 31, 10, 31, 10, 31, 10, 31, 10, 31, 10, 31, 10},
            {0, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0},
            {6, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10},
            {0, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0},
            {5, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10},
            {0, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0},
            {4, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10},
            {0, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0},
            {3, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 0, 10},
            {0, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0},
            {2, 10, 21, 10, 21, 10, 21, 10, 21, 10, 21, 10, 21, 10, 21, 10, 21, 10},
            {0, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0},
            {1, 10, 22, 10, 23, 10, 24, 10, 25, 10, 26, 10, 24, 10, 23, 10, 22, 10},
            {0, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0},
            {0, 0, 11, 0, 12, 0, 13, 0, 14, 0, 15, 0, 16, 0, 17, 0, 18, 0}};

    Reglas reglas = new Reglas();
    Rey rey = new Rey();
    Reina reina = new Reina();
    Alfil alfil = new Alfil();
    Caballo caballo = new Caballo();
    Torre torre = new Torre();
    Peon peon = new Peon();

    void pintarTablero() {

        Piezas piezas = new Piezas();

        for (int i = 0; i < 18; i++) {

            for (int j = 0; j < 18; j++) {

                piezas.mostrarPieza(casillas[i][j]);

            }
            System.out.print("      " + reglas.Piezas[i]);
            System.out.println();
        }


    }

    int posPiezaX(String pos) {

        int posTranformadaX = 0;

        if (pos.charAt(0) == 'a' || pos.charAt(1) == 'A'){
            posTranformadaX = 11;
        } else if (pos.charAt(0) == 'b' || pos.charAt(1) == 'B'){
            posTranformadaX = 12;
        } else if (pos.charAt(0) == 'c' || pos.charAt(1) == 'C'){
            posTranformadaX = 13;
        } else if (pos.charAt(0) == 'd' || pos.charAt(1) == 'D'){
            posTranformadaX = 14;
        } else if (pos.charAt(0) == 'e' || pos.charAt(1) == 'E'){
            posTranformadaX = 15;
        } else if (pos.charAt(0) == 'f' || pos.charAt(1) == 'F'){
            posTranformadaX = 16;
        } else if (pos.charAt(0) == 'g' || pos.charAt(1) == 'G'){
            posTranformadaX = 17;
        } else if (pos.charAt(0) == 'h' || pos.charAt(1) == 'H'){
            posTranformadaX = 18;
        }

        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 18; j++) {

                if (posTranformadaX == casillas[i][j]){
                    return j;
                }

            }

        }
        return 0;
    }

    int posPiezaY(String pos) {

        int posTranformadaY = 0;

        if (pos.charAt(1) == '1'){
            posTranformadaY = 1;
        } else if (pos.charAt(1) == '2'){
            posTranformadaY = 2;
        } else if (pos.charAt(1) == '3'){
            posTranformadaY = 3;
        } else if (pos.charAt(1) == '4'){
            posTranformadaY = 4;
        } else if (pos.charAt(1) == '5'){
            posTranformadaY = 5;
        } else if (pos.charAt(1) == '6'){
            posTranformadaY = 6;
        } else if (pos.charAt(1) == '7'){
            posTranformadaY = 7;
        } else if (pos.charAt(1) == '8'){
            posTranformadaY = 8;
        }

        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 18; j++) {

                if (posTranformadaY == casillas[i][j]){
                    return i;
                }

            }

        }
        return 0;
    }

    void pieza(Reglas reglas,int posInicialY, int posInicialX, int posFinalY, int posFinalX){

        if (casillas[posInicialY][posInicialX] == 21){
            // Peon Blanco

            peon.movimientoPeon(reglas,this, posInicialY,posInicialX,posFinalY,posFinalX,21);

        } else if (casillas[posInicialY][posInicialX] == 22){
            // Torre Blanca
        } else if (casillas[posInicialY][posInicialX] == 23){
            // Caballo Blanco

            caballo.movimientoCaballo(reglas,this, posInicialY,posInicialX,posFinalY,posFinalX,23);

        } else if (casillas[posInicialY][posInicialX] == 24){
            // Alfil Blanco
        } else if (casillas[posInicialY][posInicialX] == 25){
            // Reina Blanca
        } else if (casillas[posInicialY][posInicialX] == 26){
            // Rey Blanco
        } else if (casillas[posInicialY][posInicialX] == 31){
            // Peon Negro
            peon.movimientoPeon(reglas,this, posInicialY,posInicialX,posFinalY,posFinalX,31);

        } else if (casillas[posInicialY][posInicialX] == 32){
            // Torre Negra
        } else if (casillas[posInicialY][posInicialX] == 33){
            // Caballo Negro

            caballo.movimientoCaballo(reglas,this, posInicialY,posInicialX,posFinalY,posFinalX,33);

        } else if (casillas[posInicialY][posInicialX] == 34){
            // Alfil Negro
        } else if (casillas[posInicialY][posInicialX] == 35){
            // Reina Negra
        } else if (casillas[posInicialY][posInicialX] == 36){
            // Rey Negro
        }
    }

    void cambiarTablero(Tablero tablero, int posInicialY, int posInicialX, int posFinalY, int posFinalX, int posTablero){

        tablero.casillas[posInicialY][posInicialX] = 0;
        tablero.casillas[posFinalY][posFinalX] = posTablero;

    }

}
