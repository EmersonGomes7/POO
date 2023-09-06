import java.util.Scanner;
public class questao5_TD2 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        float mediaX=0;float desvioPadraoS=0;
        float somatorioMedia=0;float somatorioDP=0;
        System.out.print("digite o tamanho do vetor: ");
        int tamanhoVetor=scanner.nextInt();
        float[] vetor=new float[tamanhoVetor];
        System.out.println("----------- leitura do dados ----------------");
            for(int i=0;i<tamanhoVetor;i++){//leitura do vetor
                System.out.format("digite o elemento da posicao [%d]: ",i);
                vetor[i]=scanner.nextFloat();
            }System.out.println("----------- mostrando dados ----------------");
            for(int i=0;i<tamanhoVetor;i++){
                System.out.format("elemento da posicao [%d] eh %.1f \n",i,vetor[i]);           
    }       for(int i=0;i<tamanhoVetor;i++){ //calculando somatorio para média
                somatorioMedia+=vetor[i];
        }mediaX=somatorioMedia/tamanhoVetor;
        System.out.format("a media do vetor eh: %.3f\n",mediaX);
            for(int i=0;i<tamanhoVetor;i++){//calculando somatório para desvio padrão
                somatorioDP+=((vetor[i]-mediaX)*(vetor[i]-mediaX));
        }desvioPadraoS=(float)Math.sqrt((somatorioDP/(tamanhoVetor-1)));
        System.out.format(" e o desvio padrao do vetor eh: %.3f",desvioPadraoS);
    }
}
