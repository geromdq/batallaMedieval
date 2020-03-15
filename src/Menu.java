import java.util.Scanner;

public class Menu {

          CombatActions Combat = new CombatActions();

        public void SelectOption(Personaje P1, Personaje P2){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 1 para atacar 2 para at. especial o 3 para salir");
        int option = sc.nextInt();
        if (option==3){
            System.exit(0);
        }
        else if(option==2){
            Combat.specialAttack(P1,P2);
        }
        else if(option == 1){
            Combat.attack(P1, P2);
        }
        else{
            SelectOption(P1,P2);
        }
    }

}
