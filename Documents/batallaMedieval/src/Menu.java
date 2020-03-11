import java.util.Scanner;

public class Menu {

    public int SelectOption(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 1 para atacar o 2 para salir");
        int option = sc.nextInt();
        if (option==2){
            System.exit(0);
            return option;
        }
        else{
            return option;
        }
    }

}
