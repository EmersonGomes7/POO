#include <stdio.h>
#include <stdlib.h>
typedef struct{
    int M;
    char L;
}Bota;
void preencher_dados_botas(Bota *p1,int N){
     printf("--------- leitura dos sapatos ----------------\n");
     for(int i=0; i<N; i++){
         printf("Qual o numero da bota[%d]: ", i);
        scanf("%d %c", &p1[i].M,&(p1[i].L));
        
    }
     printf("--------- mostrando sapatos ----------------\n");
    for(int i=0; i<N; i++){
        printf("%d %c\n",p1[i].M,p1[i].L);
    }
}
int verificacao_quantidade_pares(Bota *p2,int N){
    int par_formado=0;
    for(int j=0;j<N;j++){
        for(int i=1;i<=N;i++){
            if(p2[j].M==p2[N-i].M && p2[j].L!=p2[N-i].L){
            par_formado++;
            p2[j].M=NULL;p2[N-i].M=NULL;p2[j].L=NULL;p2[N-i].L=NULL;
            }
        }
    }
    return par_formado;
}
int main(){
    int N;
    printf("numero de botas individuais entregues: ");
    scanf("%d",&N);
Bota *ptr_bota=(Bota *)malloc(N*(sizeof(Bota)));
preencher_dados_botas(ptr_bota,N);
int pares_formados= verificacao_quantidade_pares(ptr_bota,N);
printf("foram formados %d pares\n",pares_formados);
free(ptr_bota);
}