import java.util.Scanner;

public class Questao5 {
    public static void main (String[] args){
      Scanner scan = new Scanner(System.in);
      System.out.print("Insira um numero de 1 a 7: ");
      int dia = scan.nextInt();
      switch ( dia ) {
        case 1: System.out.println("Domingo");
        break;
        case 2: System.out.println("Segunda-feira");
        break;
        case 3: System.out.println("Terca-feira");
        break;
        case 4: System.out.println("Quarta-feira");
        break;
        case 5: System.out.println("Quinta-feira");
        break;
        case 6: System.out.println("Sexta-feira");
        break;
        case 7: System.out.println("Sabado");
        break;
        default: System.out.println("Dia da semana invalido!");
      }
      scan.close();
    }
}
