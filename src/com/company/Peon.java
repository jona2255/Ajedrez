package com.company;

public class Peon {

    int PB = 21;
    int PN = 31;

    Reglas reglas = new Reglas();

    void movimientoPeon(Tablero tablero, int posInicialY, int posInicialX, int posFinalY, int posFinalX ,int posTablero){


        if (reglas.turno == 2){

            if (posInicialY - posFinalY <= 2 ){
                reglas.movimientoValido(tablero, posInicialY, posInicialX, posFinalY, posFinalX, posTablero);
            } else if (posInicialY == 13 && (posInicialY - posFinalY) >= 4){
                reglas.movimientoValido(tablero, posInicialY, posInicialX, posFinalY, posFinalX, posTablero);
            } else if (posFinalX - posInicialX == 2){
                reglas.movimientoValido(tablero, posInicialY, posInicialX, posFinalY, posFinalX, posTablero);
            }
        } else {

            if (posFinalY - posInicialY == 2 ){
                reglas.movimientoValido(tablero, posInicialY, posInicialX, posFinalY, posFinalX, posTablero);
            } else if (posInicialY == 3 && (posFinalY - posInicialY) >= 4){
                reglas.movimientoValido(tablero, posInicialY, posInicialX, posFinalY, posFinalX, posTablero);
            } else if (posInicialX - posFinalX == 2){
                reglas.movimientoValido(tablero, posInicialY, posInicialX, posFinalY, posFinalX, posTablero);
            }

        }



    }
}
