
package mmc;

import java.util.Scanner;


public class Mmc {


    public static void main(String[] args) {
        
       Scanner in = new Scanner(System.in);
       String f1 = "Olá, vamos calcular mmc";
       System.out.println(f1);
       int vetQtdNums =vetQtdNums();
        int[] vetNums = pegarValores(vetQtdNums);
        System.out.println(vetQtdNums);
         for(int i = 0; i<vetNums.length; i++){
             System.out.println(vetNums[i]);
         }
       
       
    }
    
    public static int vetQtdNums(){
        Scanner in = new Scanner(System.in);
        String f2 = "Quantos números serão usados?";
        int x;
        System.out.println(f2);
        x = in.nextInt();
        return x;
    }
    public static int[] pegarValores(int quant){
        Scanner in = new Scanner(System.in);
        String f3 = "Insira o valor";
        int[] vetNums = new int[quant];
        for(int i = 0; i<quant; i++){
            System.out.println(f3);
            vetNums[i] = in.nextInt();
        }
        return vetNums;
            
}
}
