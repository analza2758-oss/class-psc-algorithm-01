import java.util.Scanner;

public class Divertidamente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alegria = 0, tristeza = 30;

        System.out.print("Riley fez novas amizades na nova cidade (Sim/Não): ");
        String amizades = sc.nextLine();

        if (amizades.equalsIgnoreCase ("Sim")) {

        System.out.print("Quantas amizades Riley fez: ");
        int quantidade = sc.nextInt();

        int pontos = quantidade * 10;

        System.out.print("Alegria fez " + pontos + " pontos!");
        } else {
            System.out.print("Tristeza fez 30 pontos.");
        }
         
            System.out.print("\nRiley está tentando entrara na universidade!! \nDigite a nota obtida na prova A1: ");
            Double A1 = sc.nextDouble();
            System.out.print("Digite a nota obtida na prova A2: ");
            Double A2 = sc.nextDouble();
            System.out.print("Digite a nota obtida na prova A3: ");
            Double A3 = sc.nextDouble();

            Double mediaProva = (A1 + A2 + A3) / 3;

            System.out.print("A média de Riley foi: " + mediaProva);

            if (mediaProva >= 7) {
                System.out.print("\nRiley foi aprovada na universidade!!");
                String universidade = sc.nextLine();

                System.out.print("\nAlegria fez 50 pontos!");
                
            } else {
                System.out.print("\nTristeza fez 50 pontos.");
            }

            System.out.print("\nRiley está estudando programação e tem 10 exercícios para fazer. \nQuantos algoritmos ela conseguiu resolver? ");
            int feitos = sc.nextInt();

             alegria = feitos * 10;
             tristeza = (10 - feitos) * 10;

            System.out.print("\nAlegria fez " + alegria + " pontos!");
            System.out.print("\nTristeza fez " + tristeza + " pontos.");

            if (alegria > tristeza) {
                System.out.println( "\nA mudança para a nova cidade foi uma experiência incrível para a Riley.");
            } else {
                System.out.println("\nA mudança para a nova cidade foi uma experiência desagradável para a Riley.");
            }

        
        
    }
}
