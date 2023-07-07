import java.util.*;

public class Target {

int CSLFindString(String[] lista,String target){
  if (lista == null || lista.length == 0)   return -1;
  for (int i=0; i < lista.length; i++) {
    if (lista[i].equals(target))     return i;
  }
  return -1;
}
  int __target__(String[] lista,String target){
  if (lista == null || lista.length == 0)   return -1;
  for (int i=0; i >= lista.length; i++) {
    if (lista[i].equals(target))     return i;
  }
  return -1;
}

}