import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class NomeGenero {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite seu nome e sexo separados por ,:");
        System.out.println("(Ex: Nome - F, Nome2 - M, Nome3 - F):");

        String resposta = s.nextLine();
        s.close(); // Fechar o Scanner

        // 1. Separar a string de entrada em pares individuais ("nome - genero")
        // O delimitador é ", "
        String[] paresNomeGenero = resposta.split(", ");

        // Listas para armazenar os nomes separados por gênero
        List<String> listaFeminino = new ArrayList<>();
        List<String> listaMasculino = new ArrayList<>();

        // 2. Processar cada par
        for (String par : paresNomeGenero) {
            // Dividir cada par pelo delimitador " - " para obter [Nome, Gênero]
            String[] partes = par.split(" - ");

            // Verificar se o par está no formato esperado (deve ter 2 partes)
            if (partes.length == 2) {
                String nome = partes[0].trim(); // Pega o nome e remove espaços extras
                String genero = partes[1].trim().toUpperCase(); // Pega o gênero e padroniza para maiúsculo

                // Adicionar o nome à lista correta
                if (genero.equals("F")) {
                    listaFeminino.add(nome);
                } else if (genero.equals("M")) {
                    listaMasculino.add(nome);
                } else {
                    System.out.println("Gênero inválido para: " + nome + ". Ignorando.");
                }
            } else {
                System.out.println("Formato de entrada inválido: " + par + ". Ignorando.");
            }
        }

        // 3. Imprimir as listas no console
        System.out.println("\n--- Lista Feminino (F) ---");
        if (listaFeminino.isEmpty()) {
            System.out.println("Nenhum nome feminino encontrado.");
        } else {
            for (String nome : listaFeminino) {
                System.out.println(nome);
            }
        }

        System.out.println("\n--- Lista Masculino (M) ---");
        if (listaMasculino.isEmpty()) {
            System.out.println("Nenhum nome masculino encontrado.");
        } else {
            for (String nome : listaMasculino) {
                System.out.println(nome);
            }
        }
    }
}