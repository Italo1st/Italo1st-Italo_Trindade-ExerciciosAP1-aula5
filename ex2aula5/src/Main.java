import java.util.Scanner;
//ex2aula5 Italo Trindade
public class Main {
    public static void main(String[] args) {

        Scanner e=new Scanner(System.in);

        int contador, acumuladorp, acumuladori;
        contador=1;
        acumuladorp=0;
        acumuladori=0;

        while (contador<=10){
            System.out.println(" digite o " + contador + "° número :");

            contador++;

            int n1 =e.nextInt();

            if (n1%2==0){
                acumuladorp++;
            }else {
                acumuladori++;

            }

        }e.close();
        System.out.println(" o total de numeros pares digitados foi: " + acumuladorp);
        System.out.println(" o total de numeros impares digitados foi: " + acumuladori);


    }
}