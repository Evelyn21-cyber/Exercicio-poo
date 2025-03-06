import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Informe uma palavra para ser invertida: ");
        String word = read.nextLine();
        int cont = 0;

        for (int i = 0; i < word.length(); i++) {
             char c = word.charAt(i);

             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                     c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {

                cont++;
            }
        } System.out.println("A palavra '" + word + "' tem " + cont + " vogais.");


    }
        }