package com.company;

public class Reglas {

    String[] Piezas = {"","P = Peones","T = Torres", "C = Caballos", "A = Alfiles", "Q = Reina", "K = Rey", "","","Posicion_Inicial Posicion_Mover", "", "Ej. a2 a3","","","","","","",};

    Jugador jugador;
    Jugador jugador2;

    int turno = 1;

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
}
