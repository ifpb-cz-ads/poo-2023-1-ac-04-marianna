import java.util.Scanner;

public class Questao1{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("Informe a idade: ");
    int idade = scan.nextInt();
    if(idade < 16){
        System.out.println("Menores de 16 anos nao podem votar!");
    }  
    else if (idade < 18 || idade > 65){
        System.out.println("Votar e facultativo para maiores de 65 anos ou para pessoas com 16 e 17 anos!");
    } 
    else {
        System.out.println("Votar e obrigatorio para pessoas entre 18 e 65 anos!");
    }
    scan.close();
    }
}