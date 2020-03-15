import java.util.Random;

public class CombatActions {

    Random randomgenerator = new Random();

    public void attack(Personaje Attacker, Personaje Defender){
        int turn = randomgenerator.nextInt(2);
        if (turn == 1){
            int vida =  Defender.getVida();
            int ataque = Attacker.getAttackValue();
            vida = vida-ataque;
            Defender.setVida(vida);
            System.out.println(Defender.getNombre() + " Recibe daño");
            System.out.println("La vida de " + Defender.getNombre() + " es: "+vida);
        }
        else
        {
            System.out.println("Ataque de " + Attacker.getNombre() + " falló ");
        }
    }

    public void specialAttack (Personaje Attacker, Personaje Defender){
        int turn = randomgenerator.nextInt(6);
        if(turn == 5){
            int vida =  Defender.getVida();
            int ataque = Attacker.getAttackValue();
            vida = vida/2;
            Defender.setVida(vida);
            System.out.println("La vida de "+ Defender.getNombre() + " se reduce a " + Defender.getVida());
        }
        else{
            System.out.println("Ataque especial de " + Attacker.getNombre() + " falló ");
        }
    }
}

