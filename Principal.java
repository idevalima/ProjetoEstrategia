import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ContextoDeOrdenacao contexto = new ContextoDeOrdenacao();
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite uma lista de números separados por espaço:");
        String[] entrada = ent.nextLine().split(" ");
        List<Integer> numeros = new ArrayList<>();
        for (String num : entrada) {
            numeros.add(Integer.parseInt(num));
        }

        System.out.println("Escolha o algoritmo de ordenação:");
        System.out.println("1 - Bubble Sort");
        System.out.println("2 - Selection Sort");
        System.out.println("3 - Insertion Sort");
        int escolha = ent.nextInt();

        switch (escolha) {
            case 1:
                contexto.setEstrategia(new OrdenacaoBubbleSort());
                break;
            case 2:
                contexto.setEstrategia(new OrdenacaoSelectionSort());
                break;
            case 3:
                contexto.setEstrategia(new OrdenacaoInsertionSort());
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }

        contexto.executarOrdenacao(numeros);

        System.out.println("Lista ordenada: " + numeros);
    }
}

