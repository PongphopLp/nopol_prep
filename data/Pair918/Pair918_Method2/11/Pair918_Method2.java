import java.util.*;

public class Target {

int separaVetor(int[] vetor,int ini,int fim){
  int aux, c=vetor[ini], i=ini + 1, j=fim;
  while (i <= j) {
    if (vetor[i] <= c)     ++i;
 else     if (c < vetor[j])     --j;
 else {
      aux=vetor[i];
      vetor[i]=vetor[j];
      vetor[j]=aux;
      ++i;
      --j;
    }
  }
  aux=vetor[ini];
  vetor[ini]=vetor[j];
  vetor[j]=aux;
  return j;
}
  int __target__(int[] vetor,int ini,int fim){
  int aux, c=vetor[ini], i=ini + 1, j=fim;
  while (i <= j) {
    if (vetor[i] <= c)     ++i;
 else     if (c <= vetor[j])     --j;
 else {
      aux=vetor[i];
      vetor[i]=vetor[j];
      vetor[j]=aux;
      ++i;
      --j;
    }
  }
  aux=vetor[ini];
  vetor[ini]=vetor[j];
  vetor[j]=aux;
  return j;
}

}