import java.util.Scanner;
public class questao6_TD2 {
    public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    int resultado=0;int horaAlarme;int horaAtual;int minutoAtual;int minutoAlarme;

    while(true){ //repetição que solicita e calcula minutos até 0:0 0:0
    System.out.print("digite a hora atual: ");
    horaAtual=scanner.nextInt();
    System.out.print("digite o minuto atual: ");
    minutoAtual=scanner.nextInt();
    System.out.print("digite a hora do alarme: ");
    horaAlarme=scanner.nextInt();
    System.out.print("digite o minuto do alarme: ");
    minutoAlarme=scanner.nextInt();
    System.out.format("horario atual: %d:%d\nhorario alarme: %d:%d\n",horaAtual,minutoAtual,horaAlarme,minutoAlarme);
    if(horaAtual==0 && minutoAtual==0 && horaAlarme==0 && minutoAlarme==0){
        break;
    }
    if((horaAtual*60+minutoAtual)<=(horaAlarme*60+minutoAlarme)){//calcula a diferença do horário se horário atual for menor que horário de alarme
        resultado=horaAlarme*60+minutoAlarme-(horaAtual*60+minutoAtual);
        System.out.format("resultado: %d minutos de sono\n",resultado);
    }else{
         resultado=(24*60-(horaAtual*60+minutoAtual))+(horaAlarme*60+minutoAlarme);//calcula 24 horas menos o horário atual e soma com o horário de alarme 
         System.out.format("resultado: %d minutos de sono\n",resultado);
             }
        }
    }
}
