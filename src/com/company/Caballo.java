package com.company;

public class Caballo {

    int CB = 23;
    int CN = 33;

    void movimientoCaballo(Reglas reglas,Tablero tablero, int posInicialY, int posInicialX, int posFinalY, int posFinalX, int posTablero) {


        if (reglas.turno == 2) {

           if (posTablero == 23){
               reglas.movimientoValido(tablero, posInicialY,posInicialX,posFinalY,posFinalX,posTablero);
           } else {
               reglas.movimientoMalo();
           }


        } else {

          if (posTablero == 33){
              reglas.movimientoValido(tablero, posInicialY,posInicialX,posFinalY,posFinalX,posTablero);

          } else {
              reglas.movimientoMalo();
          }
        }
    }


}