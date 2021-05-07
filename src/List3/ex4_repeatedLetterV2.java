// Complemente o programa anterior fazendo ele informar quais são as letras que estão repetidas.

package List3;
import java.util.Scanner;
import java.util.ArrayList;


public class ex4_repeatedLetterV2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter with a word all lowercase: ");
        String word = keyboard.next();

        int length = word.length();

        ArrayList<Character> repeatedLetters = new ArrayList<>();

        for (int i = 0; i < length - 1; i++) {
            char letter = word.charAt(i);

            for (int c = i + 1; c < length; c++) {
                char nextLetter = word.charAt(c);

                if (letter == nextLetter) {
                    if (repeatedLetters.size() == 0) {
                        repeatedLetters.add(letter);
                        break;
                    } else {
                        for (char repeatedLetter : repeatedLetters) {
                            if (letter != repeatedLetter) {
                                repeatedLetters.add(letter);
                            }
                            break;
                        }
                    }
                }
            }
        }

        if (repeatedLetters.size() > 0) {
            System.out.println("The word " + word + " have repeated letters.");
            System.out.println(("And the repeated letter are: "));

            for (char letter : repeatedLetters) {
                System.out.println(letter + " ");
            }
        } else {
            System.out.println("The word " + word + " does not have repeated letter.");
        }
    }
}
//            Scanner teclado = new Scanner(System.in);
//
//            // recebe e armazena a palavra
//            System.out.print("Entre com uma palavra toda em minúsculas: ");
//            String palavra = teclado.next();
//
//            // tamanho da palavra
//            int n = palavra.length();
//
//            // vetor (array) para armazenar as letras repetidas;
//            // o tamanho do vetor deve ser suficiente para conter todas
//            // as possíveis letras repetidas
//            char[] repetidas = new char[n];
//
//            // variável para guardar o número de letras repetidas
//            int nrep = 0;
//
//            // compara todas as letras duas a duas;
//            // ao encontrar uma repetição, e caso ela já não tenha ocorrido,
//            // acrescenta a letra ao final do vetor
//            for (int i = 0; i < n-1; i++) {
//                for (int j = i+1; j < n; j++) {
//                    if (palavra.charAt(i) == palavra.charAt(j)) {
//                        // verifica se a letra já existe no vetor de
//                        // letras repetidas
//                        boolean encontrou = false;
//                        for (int k = 0; k < nrep && !encontrou; k++) {
//                            if (palavra.charAt(i) == repetidas[k]) {
//                                encontrou = true;
//                            }
//                        }
//
//                        // se a letra repetida ainda não tinha ocorrido,
//                        // vamos acrescentá-la ao final do vetor
//                        if (!encontrou) {
//                            repetidas[nrep] = palavra.charAt(i);
//                            nrep++;
//                        }
//                    }
//                }
//            }
//
//            // mostra a mensagem final conforme tenha ou não encontrado
//            // letras repetidas
//            if (nrep > 0) {
//                System.out.print("Sim, a palavra tem letras repetidas:");
//                for (char c: repetidas) {
//                    System.out.print(" " + c);
//                }
//                System.out.println();
//            } else {
//                System.out.println("Não, a palavra não tem letras repetidas.");
//            }
//        }
// }
