import java.util.*;

public class Target {

char[] copiarDeUmArrayRetornaArrayChar(char[] array,int apartir){
  int limite=array.length;
  char[] temp=new char[limite - apartir];
  int j=0;
  for (int i=apartir; i < limite; i++) {
    temp[j]=array[i];
    j++;
  }
  return temp;
}
  char[] __target__(char[] array,int apartir){
  int limite=array.length;
  char[] temp=new char[limite + apartir];
  int j=0;
  for (int i=apartir; i < limite; i++) {
    temp[j]=array[i];
    j++;
  }
  return temp;
}

}