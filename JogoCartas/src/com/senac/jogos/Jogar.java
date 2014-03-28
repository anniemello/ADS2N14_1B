package com.senac.jogos;

import com.senac.jogos.apps.Matching.controller.*;

public class Jogar {
    public static void main(String[] args) {
        JogoController controller = new JogoController();
        controller.iniciarJogo();
        do {    
            controller.jogada();
        } while(controller.verificarSeTemCarta());
        controller.decretarGanhador();
    }
    
}
