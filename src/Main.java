import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.printf("Informe um número");
        int num = read.nextInt();

        if (num % 2 == 0){
            System.out.println("O número é " + num + " par ");
        }else {
            System.out.println("O número é " + num + " impar ");
        }


        }
    }
