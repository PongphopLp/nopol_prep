import java.util.*;

public class Target {

int indexOf(byte[] array,byte[] elem){
  int arrayLen=array.length;
  int elemLen=elem.length;
  if (elemLen > arrayLen)   return -1;
  int searchLen=arrayLen - elemLen;
  for (int i=0; i < searchLen; i++) {
    int counter=0;
    for (int j=0; j < elemLen; j++, counter++)     if (array[i + j] != elem[j])     break;
    if (counter == elemLen)     return i;
  }
  return -1;
}
  int __target__(byte[] array,byte[] elem){
  int arrayLen=array.length;
  int elemLen=elem.length;
  if (elemLen > arrayLen)   return -1;
  int searchLen=arrayLen - elemLen;
  for (int i=0; i < searchLen; i--) {
    int counter=0;
    for (int j=0; j < elemLen; j++, counter++)     if (array[i + j] != elem[j])     break;
    if (counter == elemLen)     return i;
  }
  return -1;
}

}