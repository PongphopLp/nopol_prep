import java.util.*;

public class Target {

int[] asArray(Collection collection){
  int[] array=new int[collection.size()];
  int i=0;
  for (Iterator iterator=collection.iterator(); iterator.hasNext(); ) {
    Integer integer=(Integer)iterator.next();
    array[i++]=integer.intValue();
  }
  return array;
}
  int[] __target__(Collection collection){
  int[] array=new int[collection.size()];
  int i=0;
  for (Iterator iterator=collection.iterator(); iterator.hasNext(); ) {
    Integer integer=(Integer)iterator.next();
    array[i--]=integer.intValue();
  }
  return array;
}

}