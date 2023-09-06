import java.util.Scanner;
import java.util.Random;

public class questao3_TD2 {
    public static void main(String[] args){
        int indice=-1;
        Random numeroRandom=new Random();
        Scanner scanner=new Scanner(System.in);
        System.out.print("digite o tamanho do vetor(entre 1 e 50): ");
        int tamanhoVetorA=scanner.nextInt();
        int[]vetorA=new int[tamanhoVetorA];
        for(int i=0;i<tamanhoVetorA;i++){
            vetorA[i]=numeroRandom.nextInt(20);
        }System.out.println("---------------mostrando vetor ---------------------");
        for(int i=0;i<tamanhoVetorA;i++){
            System.out.format("|%d| ",vetorA[i]);
        }
        int maior=(int) vetorA[0];
        for(int i=0;i<tamanhoVetorA;i++){
            if(vetorA[i]>maior){
                maior=(int) vetorA[i];
                indice=i;
            }
        }System.out.format("\no maior elemento eh: %d no indice: %d do vetor\n",maior,indice);
    }
}
