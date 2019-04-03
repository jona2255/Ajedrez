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

        movValido = false;
    }

    void movimientoValido(Tablero tablero, int posInicialY, int posInicialX, int posFinalY, int posFinalX, int posTablero){

        movValido=true;

        if (posTablero == 23 || posTablero == 33){

            if (posInicialY != posFinalY && posInicialX != posFinalX){

                if (posInicialY - posFinalY == 4 || posInicialY - posFinalY == -4 && posInicialX - posFinalX == 2 || posInicialX - posFinalX == -2) {

                    movValido = true;

                } else if (posInicialY - posFinalY == 2 || posInicialY - posFinalY == -2 && posInicialX - posFinalX == 4 || posInicialX - posFinalX == -4){

                    movValido = true;

                } else {

                    movValido = false;
                }


            } else {

                movValido = false;
            }


        } else {

            if (turno == 2){

                if (posFinalY != posInicialY && posFinalX == posInicialX){

                    for (int i = posInicialY; i >= posFinalY; i--) {

                        if (tablero.casillas[i][posInicialX] > 10){

                            movValido = false;
                        }
                    }

                } else {

                    for (int i = posInicialY; i >= posFinalY; i--) {
                        for (int j = posInicialX; j >= posFinalX; j--) {

                            if (tablero.casillas[i][j] > 10){

                                movValido = false;
                            }

                        }
                    }

                    if (movValido == true && tablero.casillas[posFinalY][posFinalX] <= 30 && tablero.casillas[posFinalY][posFinalX] > 0){
                        movValido = false;
                    }
                }

            } else {

                if (posFinalY != posInicialY && posFinalX == posInicialX){

                    for (int i = posInicialY; i >= posFinalY; i++) {

                        if (tablero.casillas[i][posInicialX] > 10){

                            movValido = false;
                        }
                    }

                } else {

                    for (int i = posInicialY; i <= posFinalY; i++) {
                        for (int j = posInicialX; j <= posFinalX; j++) {

                            if (tablero.casillas[i][j] > 10){

                                movValido = false;
                            }

                        }
                    }

                    if (movValido == true && tablero.casillas[posFinalY][posFinalX] <= 20 && tablero.casillas[posFinalY][posFinalX] > 0 &&tablero.casillas[posFinalY][posFinalX] < 30){
                        movValido = false;
                    }
                }

            }

        }



    }

}
