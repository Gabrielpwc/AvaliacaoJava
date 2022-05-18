import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numer, numPar = 0, numImpar = 0;
        
        for(int i = 1; i <= 20; i++){
            System.out.println("Digite o " + i + "º número");
            numer = entrada.nextInt();
            
            // para informar números pares
            if(numer % 2 == 0){
                numPar++;
            }

            // para informar números impares
            
            if(numer % 2 == 1){
                numImpar++;
            }
            
        }
        
        System.out.println("Foram digitados " + numPar + " números pares,e " + numImpar + " números ímpares");
        
    }
}
