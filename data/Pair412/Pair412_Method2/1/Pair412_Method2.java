import java.util.*;

public class Target {

int[] toIntArray(Collection integerCollection){
  int[] rv=new int[integerCollection.size()];
  Iterator iterator=integerCollection.iterator();
  for (int i=0; iterator.hasNext(); i++)   rv[i]=((Integer)iterator.next()).intValue();
  return rv;
}
  int[] __target__(Collection integerCollection){
  int[] rv=new int[integerCollection.size()];
  Iterator iterator=integerCollection.iterator();
  for (int i=0; iterator.hasNext(); i--)   rv[i]=((Integer)iterator.next()).intValue();
  return rv;
}

}