package com.company;

public class Reglas {

    String[] Piezas = {"","P = Peones","T = Torres", "C = Caballos", "A = Alfiles", "Q = Reina", "K = Rey", "","","Posicion_Inicial Posicion_Mover", "", "Ej. a2 a3","","","","","","",};

    Jugador jugador;
    Jugador jugador2;

    Piezas piezas;

    int turno = 1;

    boolean movValido = true;


    void turnos() {

        System.out.println();

        if (turno==1){
            System.out.println("Es el turno de: " + jugador.nick);
            turno = 2;
        } else {
            System.out.println("Es el turno de: " + jugador2.nick);
            turno = 1;
        }

    }

    public void asignarJugadores(Jugador j1, Jugador j2) {
        jugador = j1;
        jugador2 = j2;
    }

    void movimientoMalo() {

        System.out.println("Movimiento no valido, introduce de uevo tu movimiento: ");


    }

    void movimientoValido(Tablero tablero, int posInicialY, int posInicialX, int posFinalY, int posFinalX, int posTablero){


        if (turno == 2){

            if (posFinalY != posInicialY && posFinalX == posInicialX){

                for (int i = posInicialY; i >= posFinalY; i--) {

                    if (tablero.casillas[i][posInicialX] > 10){

                        movValido = false;
                    }
                }

            }

        } else {

            if (posFinalY != posInicialY && posFinalX == posInicialX){

                for (int i = posInicialY; i >= posFinalY; i++) {

                    if (tablero.casillas[i][posInicialX] > 10){

                        movValido = false;
                    }
                }

            }

        }

    }
}
