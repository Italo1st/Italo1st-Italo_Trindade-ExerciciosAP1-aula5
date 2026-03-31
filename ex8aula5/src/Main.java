//ex8aula5 Italo Trindade
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner e=new Scanner(System.in);

        int aluno = 1;

        do {
            System.out.println("==================================================");
            System.out.println("           NOTAS DO " + aluno + "° ALUNO          ");
            System.out.println("==================================================");
            System.out.println("Escreva 1° nota do aluno :");
            double nota1=e.nextDouble();

            System.out.println("Escreva 2° nota do aluno :");
            double nota2 =e.nextDouble();

            if (((nota2<0)||(nota2>10))||((nota1<0)||(nota1>10))){
                System.out.println(" ERRO! Digite uma nota válida");
                continue;
            }
            else{
                double media = (nota1 + nota2)/2;
                System.out.printf(" A média do %d° aluno é %.2f%n%n%n " , aluno, media);
            }
            aluno++;
        }while ( aluno<=5 );
        e.close();
    }
}