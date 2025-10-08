import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        List<String> listaM = new ArrayList<>();
        List<String> listaF = new ArrayList<>();

        System.out.print("Digite o seu sexo: M ou F ");
        String sexo = s.nextLine();

        if (sexo.equalsIgnoreCase("f")) {
            System.out.print("Digite o seu nome: ");
            String nome = s.nextLine();
            listaF.add(nome);
            System.out.println(nome + " foi adicionada à lista feminina.");
            System.out.println(listaF);
        }
        else if (sexo.equalsIgnoreCase("m")) {
            System.out.print("Digite o seu nome: ");
            String nome = s.nextLine();
            listaM.add(nome);
            System.out.println(nome + " foi adicionado à lista masculina.");
            System.out.println(listaM);
        }
        else {
            System.out.print("Sexo inválido");
        }
    }
}