
package mmc;

import java.util.Scanner;


public class Mmc {


    public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in);
       String f1 = "Olá, vamos calcular mmc";
       System.out.println(f1);
       
       int vetQtdNums =vetQtdNums(); //Puxando a função do tamanho que será o vetor
       int[] vetNums = pegarValores(vetQtdNums); //Função sendo declarada. "pegarValores" contém os valores e "vetQtdNums" contém o tamanho da função
      
       
    }
    
    public static int vetQtdNums(){ //define o tamanho do vetor
        Scanner in = new Scanner(System.in);
        
        String f2 = "Quantos números serão usados?";
        
        int x;
        System.out.println(f2);
        x = in.nextInt();
        return x;
    }
    public static int[] pegarValores(int quant){ //pegar valores que serão utilizados
        Scanner in = new Scanner(System.in);
        
        String f3 = "Insira o valor";
        
        int[] vetNums = new int[quant]; //Declarei o vetor pela primeira vez nesta função
        
        for(int i = 0; i<quant; i++){
            System.out.println(f3);
            vetNums[i] = in.nextInt();
        }
        return vetNums;
            
}
    public static boolean pararLoop (int[] vetNums, int vetQtdNums){ //função que verifica se os valores finais são iguais a 1
        boolean valoresUm = true;
        for(int i = 0; i< vetQtdNums; i++){
            if (vetNums[i] != 1){
                valoresUm = false;
                break;
            } 
    }
        return valoresUm;
}
     public static int primo(int primo){
        primo++;
        int div;
        int zero = 0;
        while(zero != 1){
            for(int i=0;i < primo;i++){
                div = primo % i;
                if(div == 0){
                    zero++;
                }
            }
            if(zero !=1){
                zero = 0;
                primo++;
            }
        }
        return primo;
     }
}
    





 /*System.out.println(vetQtdNums);
         for(int i = 0; i<vetNums.length; i++){
             System.out.println(vetNums[i]);
         }
       */
