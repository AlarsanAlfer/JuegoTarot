package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        ArrayList<Carta> baraja = new ArrayList();
        baraja.add(new Carta(1,"El Tonto", "src/main/resources/cartas/f1.png"));
        baraja.add(new Carta(2,"El Mago", "src/main/resources/cartas/f2.png"));
        baraja.add(new Carta(3,"La Sacerdotisa", "src/main/resources/cartas/f3.png"));
        baraja.add(new Carta(4,"La Emperatriz", "src/main/resources/cartas/f4.png"));
        baraja.add(new Carta(5,"El Emperador", "src/main/resources/cartas/f5.png"));
        baraja.add(new Carta(6,"El Hierofante", "src/main/resources/cartas/f6.png"));
        baraja.add(new Carta(7,"Los Amantes", "src/main/resources/cartas/f7.png"));
        baraja.add(new Carta(8,"El Carro", "src/main/resources/cartas/f8.png"));
        baraja.add(new Carta(9,"La Fortaleza", "src/main/resources/cartas/f9.png"));
        baraja.add(new Carta(10,"El Ermitaño", "src/main/resources/cartas/f10.png"));
        baraja.add(new Carta(11,"La rueda de la fortuna", "src/main/resources/cartas/f11.png"));
        baraja.add(new Carta(12,"La Justicia", "src/main/resources/cartas/f12.png"));
        baraja.add(new Carta(13,"El Verdugo", "src/main/resources/cartas/f13.png"));
        baraja.add(new Carta(14,"La Muerte", "src/main/resources/cartas/f14.png"));
        baraja.add(new Carta(15,"La Templanza", "src/main/resources/cartas/f15.png"));
        baraja.add(new Carta(16,"El Diablo", "src/main/resources/cartas/f16.png"));
        baraja.add(new Carta(17,"La Torre", "src/main/resources/cartas/f17.png"));
        baraja.add(new Carta(18,"La Estrella", "src/main/resources/cartas/f18.png"));
        baraja.add(new Carta(19,"La Luna", "src/main/resources/cartas/f19.png"));
        baraja.add(new Carta(20,"El Sol", "src/main/resources/cartas/f20.png"));
        baraja.add(new Carta(21,"El Juicio", "src/main/resources/cartas/f21.png"));
        baraja.add(new Carta(22,"El Mundo", "src/main/resources/cartas/f22.png"));


        ViewCartas viewCartas = new ViewCartas(baraja);
        viewCartas.setVisible(true);
    }
}