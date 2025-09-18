//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        float nota1 = s.nextFloat();

        System.out.print("Digite a nota 2: ");
        float nota2 = s.nextFloat();

        System.out.print("Digite a nota 3: ");
        float nota3 = s.nextFloat();

        System.out.print("Digite a nota 4: ");
        float nota4 = s.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}