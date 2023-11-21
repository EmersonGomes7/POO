import java.util.Scanner;
public class questao1_TD2 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("digite um numero: ");// leitura dos números
        float numero1=scanner.nextFloat();
        System.out.print("digite um outro numero: ");
        float numero2=scanner.nextFloat();
        System.out.print("digite um simbolo aritmetico + soma, - subtracao, * multiplicacao, / divisao.: ");
            char simbolo=scanner.next().charAt(0);
            while(true){ // repetição até obter um simbolo válido
                if(simbolo=='+' || simbolo=='-' || simbolo=='*' || simbolo=='/')
                break;
                else{
                    System.out.print("Operador invalido!\ndigite um operador valido: ");
                         simbolo=scanner.next().charAt(0);
                }
            
            } switch (simbolo) {   //efetuar e mostrar operação a depender do simbolo 
                case '+': System.out.format("a soma eh: %.3f",numero1+numero2);   
                    break;
                case '-':System.out.format("a subtracao eh: %.3f",numero1-numero2);  
                    break;
                case '*':System.out.format("a multiplicao eh: %.3f",numero1*numero2);
                    break;
                case '/':
                if(numero2==0){
                    System.out.println("operacao invalida! divisor igual a zero!");
                }else
                System.out.format("a divisao eh: %.3f",numero1/numero2);
                    break;
            }
    }
}
