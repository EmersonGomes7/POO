import java.util.Scanner;
public class questao4_TD2 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String senha;
        System.out.println("informe a senha: ");
        senha=scanner.nextLine();

        while(true){
             if(senha.equals("a76dk09")){
                System.out.println("ACESSO PERMITIDO");
                break;
        }else{
            System.out.println("SENHA INVÁLIDA\ninforme a senha novamente: ");
            senha=scanner.nextLine();
            
        }
        }
       
    }

}
