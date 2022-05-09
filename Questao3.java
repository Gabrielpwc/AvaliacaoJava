import java.util.Scanner;

public class Questao3 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int [] metro = new int [6];

        for(int i = 0; i<6; i ++){
            int entrada;
            System.out.println("Por favor, digite um número positivo e menor que 250: ");
            do{
                entrada = input.nextInt();
                input.nextLine();
                if(entrada < 0|| entrada > 250){
                    System.out.println("O valor digitado é maior que 250 ou negativo, por favor, digite novamente: ");
                }
            }


             while(entrada < 0 || entrada > 250);
             metro[i] = entrada;
        }

        for(int i = 0; i < 6; i ++){
            System.out.println("Número do vagão: " + (i +1));
        


            if ( metro [1] <= 50){
                System.out.println("Nível da ocupação:Azul ");
            }
            else if ( metro [1] > 50 && metro[1] <=100){
                System.out.println("Nível da ocupação:Amarela ");
            }
            else if ( metro [1] > 100 && metro[1] <=150){
                System.out.println("Nível da ocupação:laranja ");
            }
            else if ( metro [1] > 150 && metro[1] <=250){
                System.out.println("Nível da ocupação:Vermelha ");
            }
            System.out.println("Capacidade máxima: 250 passageiros ");
        }
    }
}

