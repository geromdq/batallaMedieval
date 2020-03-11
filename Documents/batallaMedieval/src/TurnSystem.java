import java.util.Random;

public class TurnSystem {

    Personaje P1;
    Personaje P2;

    public TurnSystem(Personaje P1, Personaje P2) {
        this.P1 = P1;
        this.P2 = P2;
    }


    public int startGame() {
        Random randomgenerator = new Random();
        int turn = randomgenerator.nextInt(2);
        if (turn == 0) {
            System.out.println("Comienza jugador 1");
            alternateCombat(P1, P2);
        } else {
            System.out.println(" Comienza la IA.");
            alternateCombat(P2, P1);
        }
        return turn;
    }

    public void alternateCombat(Personaje P1,Personaje P2) {
        Menu menu = new Menu();
        CombatActions Combat = new CombatActions();
        while (1 == 1) {
            menu.SelectOption();
            Combat.attack(P1, P2);
            menu.SelectOption();
            Combat.attack(P2, P1);
            checkEnding();
        }
    }

    public void checkEnding() {
        if (P1.getVida() < 1) {
            System.out.println(P1.getNombre()+" ha perdido");
            System.exit(0);
        }
        if (P2.getVida() < 1) {
            System.out.println(P2.getNombre()+" ha perdido");
            System.exit(0);
        }
    }
}
