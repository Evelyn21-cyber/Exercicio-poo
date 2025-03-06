//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int num1 = read.nextInt();
        int result = 1;

        for (int i = 1; i <= num1; i++) {
            result *= i;

        }
        System.out.println("O fatorial do número " +num1+ " é " +result+ ".");
    }

        }
