import java.util.*;

public class Target {

int index(Object[] array,Object value){
  for (int i=0; i < array.length; i++)   if (value != null) {
    if (value.equals(array[i]))     return i;
  }
 else {
    if (array[i] == null)     return i;
  }
  return -1;
}
  int __target__(Object[] array,Object value){
  for (int i=0; i <= array.length; i++)   if (value != null) {
    if (value.equals(array[i]))     return i;
  }
 else {
    if (array[i] == null)     return i;
  }
  return -1;
}

}