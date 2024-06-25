import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite um número inteiro: ");
            int numero = sc.nextInt();
    System.out.printf("Numero Digitado  = %d", numero);

    if (numero > 0) {
      System.out.println(" positivo.");
    } else if (numero < 0) {
      System.out.println(" negativo.");
    } else {
      System.out.println(" zero.");
    }

            sc.close();



  }
}