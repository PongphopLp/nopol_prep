import java.util.*;

public class Target {

String[] sortAlpha(Collection collection){
  String[] retur=new String[collection.size()];
  Iterator it=collection.iterator();
  int k=0;
  for (int i=0; i < collection.size(); i++) {
    retur[i]=(String)it.next();
  }
  for (int i=0; i < retur.length - 1; i++) {
    if (retur[i].compareTo(retur[i + 1]) > 0) {
      String temp=retur[i];
      retur[i]=retur[i + 1];
      retur[i + 1]=temp;
      int j=i;
      boolean done=false;
      while (j != 0 && !done) {
        if (retur[j].compareTo(retur[j - 1]) < 0) {
          temp=retur[j];
          retur[j]=retur[j - 1];
          retur[j - 1]=temp;
        }
 else         done=true;
        j--;
      }
    }
  }
  return retur;
}
  String[] __target__(Collection collection){
  String[] retur=new String[collection.size()];
  Iterator it=collection.iterator();
  int k=0;
  for (int i=0; i < collection.size(); i++) {
    retur[i]=(String)it.next();
  }
  for (int i=0; i < retur.length - 1; i++) {
    if (retur[i].compareTo(retur[i + 1]) > 0) {
      String temp=retur[i];
      retur[i]=retur[i + 1];
      retur[i + 1]=temp;
      int j=i;
      boolean done=false;
      while (j != 0 && !done) {
        if (retur[j].compareTo(retur[j - 1]) < 0) {
          temp=retur[j];
          retur[j]=retur[j + 1];
          retur[j - 1]=temp;
        }
 else         done=true;
        j--;
      }
    }
  }
  return retur;
}

}