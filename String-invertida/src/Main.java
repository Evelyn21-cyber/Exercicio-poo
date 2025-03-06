import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Informe uma palavra para ser invertida: ");
        String word = read.nextLine();
        String wordreverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            wordreverse += word.charAt(i);

        }
        System.out.println("Palavra original: " + word);
        System.out.println("Palavra invertida: " + wordreverse);
    }
    {

    }
}
