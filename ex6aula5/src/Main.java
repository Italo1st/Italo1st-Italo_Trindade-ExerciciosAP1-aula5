import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);

        int contador = 1;
        int num;
        int comparar=10000000;

        while (contador <= 10){
            System.out.println(" Digite o " + contador + "° numero : ");
            num= e.nextInt();

            if (num<comparar){
                comparar=num;

            }

            contador++;

            }
        e.close();
        System.out.println(" o menor numero digitado foi " + comparar );
        }

    }