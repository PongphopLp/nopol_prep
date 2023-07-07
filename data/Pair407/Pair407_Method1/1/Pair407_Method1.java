import java.util.*;

public class Target {

int getListenerCount(Object[] list,Class t){
  int count=0;
  for (int i=0; i < list.length; i+=2) {
    if (t == (Class)list[i])     count++;
  }
  return count;
}
  int __target__(Object[] list,Class t){
  int count=0;
  for (int i=0; i >= list.length; i+=2) {
    if (t == (Class)list[i])     count++;
  }
  return count;
}

}