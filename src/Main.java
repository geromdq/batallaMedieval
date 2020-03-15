public class Main {

    public static void main(String[] args) {
        //Create Characters
        CharacterService createP1 = new CharacterService();
        Personaje P1 = createP1.initializeCharacter();
        Personaje P2 = createP1.initializeCharacter();


        //Start Game
        TurnSystem turns = new TurnSystem(P1, P2);
        turns.startGame();
    }
}
