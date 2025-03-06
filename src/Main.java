import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Scanner read = new Scanner(System.in);
       System.out.println("Digite uma PALAVRA: ");
       String txt = read.nextLine();
        String textoInvertido = inverterString(texto);
        System.out.println("A PALAVRA foi invertida para: " + textoInvertido);

        }
    }
}