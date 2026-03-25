import java.util.Scanner;
// ex7aula5 Italo Trindade
public class Main {
    public static void main( String[] args){

        double peso, altura, alturacalculo, imc;
        int contador, pesobom, pesoruim ;
        Scanner e=new Scanner(System.in);

        contador = 1;
        pesobom = 0;
        pesoruim=0;
        while (contador<=10) {

            System.out.println("Escreva o peso da " + contador +   "º pessoa (em kg): ");
            peso = e.nextDouble();

            System.out.println("Escreva a altura da " + contador + "º altura (em metros): ");
            altura = e.nextDouble();

            alturacalculo = Math.pow(altura, 2);
            imc = peso / alturacalculo;

            if ((imc >= 18.5) && (imc <= 24.9)) {
                System.out.printf("O imc da " + contador + "° pessoa está saudavel! e é de %.2f%n", imc);
                pesobom++;

            } else {
                System.out.printf("O imc da " + contador + "° pessoa está alterado, cuidado! seu imc é de %.2f%n", imc);
                pesoruim++;
            }


            contador++;
        }

        System.out.println(" Há " + pesobom + " pessoas com o peso ideal, e " + pesoruim + " pessoas com o peso alterado ");

        e.close();

    }
}