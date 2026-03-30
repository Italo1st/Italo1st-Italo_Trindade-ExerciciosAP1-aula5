// ex3aula5 Italo Trindade
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);

        int contador = 2;

        System.out.println("digite um numero: ");
        int numero =e.nextInt();

        while (contador<=numero){
            System.out.print( " " + contador );
            contador*=2;
        }
        e.close();
    }
}
