package com.company;

public class Tablero {

    int[][] tablero = {{0, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0, 9, 0},
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

    void pintarTablero() {

        Piezas piezas = new Piezas();

        for (int i = 0; i < 18; i++) {

            for (int j = 0; j < 18; j++) {

                piezas.mostrarPieza(tablero[i][j]);

            }
            System.out.print("      " + reglas.Piezas[i]);
            System.out.println();
        }


    }

    int posPieza(String pos) {

        int posTranformadaX = 0;
        int posTranformadaY = 0;

        if (pos.charAt(1) == 'a' || pos.charAt(1) == 'A'){
            posTranformadaX = 11;
        } else if (pos.charAt(1) == 'b' || pos.charAt(1) == 'B'){
            posTranformadaX = 12;
        } else if (pos.charAt(1) == 'c' || pos.charAt(1) == 'C'){
            posTranformadaX = 13;
        } else if (pos.charAt(1) == 'd' || pos.charAt(1) == 'D'){
            posTranformadaX = 14;
        } else if (pos.charAt(1) == 'e' || pos.charAt(1) == 'E'){
            posTranformadaX = 15;
        } else if (pos.charAt(1) == 'f' || pos.charAt(1) == 'F'){
            posTranformadaX = 16;
        } else if (pos.charAt(1) == 'g' || pos.charAt(1) == 'G'){
            posTranformadaX = 17;
        } else if (pos.charAt(1) == 'h' || pos.charAt(1) == 'H'){
            posTranformadaX = 18;
        }

        if (pos.charAt(2) == '1'){
           posTranformadaY = 1;
        } else if (pos.charAt(2) == '2'){
           posTranformadaY = 2;
        } else if (pos.charAt(2) == '3'){
           posTranformadaY = 3;
        } else if (pos.charAt(2) == '4'){
           posTranformadaY = 4;
        } else if (pos.charAt(2) == '5'){
           posTranformadaY = 5;
        } else if (pos.charAt(2) == '6'){
           posTranformadaY = 6;
        } else if (pos.charAt(2) == '7'){
           posTranformadaY = 7;
        } else if (pos.charAt(2) == '8'){
           posTranformadaY = 8;
        }

        for (int i = 0; i < 18; i++) {
            for (int j = 0; j < 18; j++) {

                if (posTranformadaX == tablero[i][j]){
                    return j;
                }

                if (posTranformadaY == tablero[i][j]){
                    return i;
                }

            }

        }
        return 0;
    }
}
