import java.util.Scanner;

public class Menu {

    private CombatActions combat;

    public Menu(){
        this.combat = new CombatActions();
    }

        public void SelectOption(Personaje P1, Personaje P2){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 1 para atacar 2 para at. especial o 3 para salir");
        int option = sc.nextInt();

        switch(option) {
            case 3:
                System.exit(0);
                break;
            case 2:
                combat.specialAttack(P1,P2);
                break;
            case 1:
                combat.attack(P1, P2);
                break;
            default:
                SelectOption(P1,P2);
                break;

        }


    }

}
