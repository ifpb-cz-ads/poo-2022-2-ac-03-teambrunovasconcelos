import java.util.Scanner;

public class CarvalhoTeixeiraQuestao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Qual sua idade?");
        int idade = input.nextInt();
        if (idade < 16) {
            System.out.println("Você não pode votar");
        } else if (idade == 16 || idade == 17 || idade > 65) {
            System.out.println("Seu voto é facultativo");
        } else {
            System.out.println("Seu voto é obrigatório");
        }
        input.close();
    }
}