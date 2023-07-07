import java.util.*;

public class Target {

int indexOf(Object[] array,Object objectToFind){
  if (array == null)   return -1;
  if (objectToFind == null) {
    for (int i=0; i < array.length; i++)     if (array[i] == null)     return i;
  }
 else {
    for (int i=0; i < array.length; i++)     if (objectToFind.equals(array[i]))     return i;
  }
  return -1;
}
  int __target__(Object[] array,Object objectToFind){
  if (array == null)   return -1;
  if (objectToFind == null) {
    for (int i=0; i < array.length; i++)     if (array[i] == null)     return i;
  }
 else {
    for (int i=0; i >= array.length; i++)     if (objectToFind.equals(array[i]))     return i;
  }
  return -1;
}

}