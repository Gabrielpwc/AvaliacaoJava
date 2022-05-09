public class Questao4 {
    
    public static void main(String[] args){}
        /*Existem muitosproblemas que podem ser resolvidos através de repetição de blocos de instruções.
por esse motivo, as linguagens de progeramação possuem comandos que permi]tem o loop de instruções com base em certos parametros
Diferencie as rotinas de repetição no java, explicando de forma sucinta como elkes executam, e identificando a melhor situação de cada comando. Mostre, através de um exemopolo simples(para cada comando), a aplicação de cada um dops comandos dentro de cada suituação recomendada pelo aluno. Importante, comente as etapas realizadas no código

As estruturas de repetição, ou laços de repetição, são utilizados para executar, repetidamente, uma instrução ou bloco de instrução enquanto determinada condição estiver sendo satisfeita.
as principais rotinas são:while, do-while e for.

While
Sendo uma estrutura de repetição mais simples, ela repete a execução de um bloco enquanto(while) uma condição for verdadeira, e na primeira vez que a execução for falsa, ela não repetirá a execução do bloco, e a exewcução continuará com o comando seguinte ao bloco while do programa*/
   public   void  exwhile() {
        
        int i = 1;  //inicio de um char
        while(i<81){ //definição do while para que coloque o numero 81 vezes
            System.out.println(i);
            ++i; // para que seja feito um escalonamento e printe numeros de 1 a 80
        } return;
    }

/*do-while
Bem parecida com o while em teoria, mas possui a diferença de que a condição é verificada após executar o bloco de instruções correspondentes, portanto, se a condição do laço for falsa antes de iniciar, vão ser executadas pelo menos uma vez.*/
    public void exdowhile () {
        int x = 4; //ativano a variavel x com o innt

        do{ // primeiro comando de Do para fazer 
            x--;
        } while (x>5); //condicional parqa que seja feito enquanto 
        System.out.println(x);
    }


/*For
Repetição para um número definido de repetições. É utilizada quando se sabe o número de vezes em que um trecho do código deve ser repetido, reduzindo a quantidade de linhas de uma expressão .*/
  public void exfor(){ 

    for(int i = 1; i <=10; ++i){ //aqui é onde ocorre a declaração da variável, junto com uma conndição e onde se incrementa a variável
        System.out.println(i);
    }
  }}

   