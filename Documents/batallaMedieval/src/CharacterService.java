import java.util.Scanner;

public class CharacterService {

    Scanner sc = new Scanner(System.in);

    public Personaje initializeCharacter()
    {
        System.out.println("Ingrese el nombre de su personaje");
        String name = sc.nextLine();
        name = sc.nextLine();
        Arma arma = this.selectWeapon();
        System.out.println("Humano | Fuerza: 5 - Velocidad: 5 - Vida: 70");
        System.out.println("Elfo | Fuerza: 4 - Velocidad: 7 - Vida: 50" );
        System.out.println("Ingrese '1' para elegir la raza humano, o '2' para elfo");
        int razaId = sc.nextInt();
        switch (razaId){
            case 1:
                return new Humano(name,5,5,70, arma);
            case 2:
                return new Elfo(name,4,9,50, arma);
            default:
                return initializeCharacter();
        }
    }

    private Arma selectWeapon(){
        System.out.println("Espada | Daño:12 - Peso: 5");
        System.out.println("Hacha | Daño:14 - Peso: 8");
        System.out.println("Ingrese '1' para elegir la espada o '2' para el hacha");
        int armaId = sc.nextInt();
        switch (armaId){
            case 1:
                return new Espada();
            case 2:
                return new Hacha();
            default:
                return selectWeapon();
        }
    }

}
