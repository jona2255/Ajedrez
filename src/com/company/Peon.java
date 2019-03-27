package com.company;

public class Peon {

    int posicionInicialB;
    int posicionFinalB;

    int posicionInicialN;
    int posicionFinalN;

    int PB = 21;
    int PN = 31;

    Tablero tablero;
    Reglas reglas2 = new Reglas();

    boolean movimientoPeon(int posInicialY, int posInicialX, int posFinalY, int posFinalX){

        boolean movimientoValido = true;

        if (posInicialY == 13 && (posFinalY - posInicialY) > 4){

            reglas2.movimientoMalo();

        } else {

            for (int i = posInicialY+1; i < posFinalY; i++) {
                for (int j = posInicialX+1; j < posFinalX; j++) {

                    if (tablero.tablero[i][j] > 20){
                        movimientoValido = false;
                    }
                }
            }

        }

        return movimientoValido;

    }
}
