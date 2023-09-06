import java.util.Scanner;
public class questao2_TD2 {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int pares=0;int impares=0; int negativos=0; int positivos=0; int neutros=0;
        System.out.print("digite o tamanho do vetor: ");
        int tamanhoVetorA=scanner.nextInt();
        int[] vetorA=new int[tamanhoVetorA];
         System.out.print("-------------preenchimento do vetor----------------\n");
        for(int i=0;i<tamanhoVetorA;i++){
            System.out.format("digite um numero da posição [%d]: ",i);
            vetorA[i]=scanner.nextInt();
        }  System.out.print("-------------mostrando vetor-----------------\n");
        for(int i=0;i<tamanhoVetorA;i++){
            if(vetorA[i]%2==0)
            pares++;
            else
            impares++;
            if(vetorA[i]==0)
            neutros++;
            else if(vetorA[i]<0)
            negativos++;
            else
            positivos++;

            System.out.format("elemento da posição [%d]: %d\n",i,vetorA[i]);
            
        }System.out.print("mostrando dados obtidos do vetor: \n");
        System.out.format("Pares: %d\nImpares: %d\nPositivos: %d\nNegativos: %d\nNeutros: %d",pares,impares,positivos,negativos,neutros);
    }
}
