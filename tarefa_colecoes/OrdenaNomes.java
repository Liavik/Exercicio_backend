import java.util.Scanner;

public class OrdenaNomes {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite os nomes usando , para separar: ");

        String resposta = s.nextLine();
        // Remove espaços em branco em torno das vírgulas para garantir um split limpo
        String[] vetStr = resposta.split("\\s*,\\s*");

        // A variável auxiliar deve ser String, pois está armazenando nomes (strings)
        String aux;

        // Loop de Ordenação (Bubble Sort para strings)
        // Você está implementando o algoritmo Bubble Sort, que funciona bem.
        for(int i = 0; i < vetStr.length; i++){
            // O loop interno precisa ir até vetStr.length - 1 - i para otimizar,
            // mas vetStr.length - 1 (como estava) também funciona corretamente.
            for(int j = 0; j < vetStr.length - 1; j++) {

                // **A CORREÇÃO PRINCIPAL É AQUI:**
                // Use o método compareTo() para comparar strings.
                // - Se o resultado for > 0, significa que vetStr[j] vem DEPOIS de vetStr[j+1] na ordem alfabética.
                // - A chamada toUpperCase() ou toLowerCase() é para garantir uma ordenação não-sensível a maiúsculas/minúsculas.
                if(vetStr[j].trim().toUpperCase().compareTo(vetStr[j + 1].trim().toUpperCase()) > 0) {

                    // A lógica de troca é a mesma, mas usando a variável aux do tipo String.
                    aux = vetStr[j];
                    vetStr[j] = vetStr[j+1];
                    vetStr[j+1] = aux;
                }
            }
        }

        System.out.println("\nNomes em ordem alfabética:");
        for (int i = 0; i < vetStr.length; i++) {
            // O trim() remove quaisquer espaços em branco extras no início/fim de cada nome.
            System.out.println(vetStr[i].trim());
        }
        s.close(); // Boa prática: fechar o Scanner
    }
}