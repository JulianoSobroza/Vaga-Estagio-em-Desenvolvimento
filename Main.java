import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fibonacci();
        MaiusculoOuMinusculo();
        Soma();
    }

    public static void MaiusculoOuMinusculo() {
        System.out.println("\n===== ocorrências de A's ===== ");
        String frase = "Qualquer objetivo que você planta, a vida floresce com graça.";
        int contador = 0;
        // Percorre a String frase, verificando ocorrências de "A" e "a", incrementando o contador.
        for(int i =0; i < frase.length(); i++){
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
                contador +=1;
            }
        }
        System.out.println("FRASE: " + frase);
        System.out.println("TOTAL de ocorrências da letra 'a': " + contador);
    }

    public static void Fibonacci() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n===== Sequência de Fibonacci =====");
        System.out.print("Digite um número inteiro positivo para verificar se pertence a Seq. de Fibonacci: ");
        int verificarInt = entrada.nextInt();
        boolean pertence = false;

        int[] fibonacci = new int[20];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        // Preenchendo a matriz com a Seq. Fibonacci
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        // Percorre a matriz verificando se o número digitado pertence ou não
        for (int i = 0; i < fibonacci.length; i++) {
            if (fibonacci[i] == verificarInt) pertence = true;
        }
        // Operador ternário para exibir na tela
        System.out.println((pertence) ? "O número digitado pertence à Seq. de Fibonacci" : "O número digitado não pertence à Seq. de Fibonacci");
    }

    public static void Soma(){
        System.out.println("\n===== Variável SOMA =====");
        //int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
        int indice = 12, soma = 0, k = 1;
        while (k < indice){
            k +=1;
            soma +=k;
        }
        System.out.println(soma);
    }
}