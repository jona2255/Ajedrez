package com.company;

public class Main {

    public static void main(String[] args) {


        /*
        1. Tablero => 8 casillas, bordes (arriba, abajo, izquierda, derecha),
            posicion (1-8 de abajo a arriba, A-H izquierda a derecha).

        2. Jugadores => 2 jugadores, uno usa blancas y el otro negras.

        3. Piezas => 16 por jugador, 8 peones(P), 2 torres(T), 2 caballos(C), 2 alfiles(A), 1 reina(Q), 1 rey(K).

        4. Reglas => Que letra es cada pieza.
        */

            /*

        Pantalla de juego

          - - - - - - - -
        8|T|C|A|Q|K|A|C|T|		P = Peones
          - - - - - - - -		T = Torres
        7|P|P|P|P|P|P|P|P|		C = Caballos
          - - - - - - - -		A = Alfiles
        6| | | | | | | | |		Q = Reina
          - - - - - - - -		K = Rey
        5| | | | | | | | |
          - - - - - - - -
        4| | | | | | | | |      Posicion_Inicial Posicion_Mover
          - - - - - - - -
        3| | | | | | | | |      Ej. a2 a3
          - - - - - - - -
        2|P|P|P|P|P|P|P|P|
          - - - - - - - -
        1|T|C|A|Q|K|A|C|T|
          - - - - - - - -
          A B C D E F G H

 */

        System.out.println("HOLA MUNDO!!!");
    }
}