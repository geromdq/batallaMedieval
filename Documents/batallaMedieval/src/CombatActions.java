import java.util.Random;

public class CombatActions {

    Random randomgenerator = new Random();

    public void attack(Personaje Attacker, Personaje Defender){
        int turn = randomgenerator.nextInt(2);
        if (turn == 0){
            System.out.println("Ataque de " + Attacker.getNombre() + " falló ");
        }
        else
        {
            int vida =  Defender.getVida();
            int ataque = Attacker.getAttackValue();
            vida = vida-ataque;
            Defender.setVida(vida);
            System.out.println(Defender.getNombre() + " Recibe daño");
            System.out.println("La vida de " + Defender.getNombre() + " es: "+vida);
        }


    }

}

