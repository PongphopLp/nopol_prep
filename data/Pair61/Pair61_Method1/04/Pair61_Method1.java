import java.util.*;

public class Target {

int[] getKeyValues(Vector<String> keys,String[] data,String[] scheme){
  Vector<String> keyValues=new Vector<String>();
  for (int i=0; i < keys.size(); i++) {
    for (int j=0; j < scheme.length; j++) {
      if (scheme[j].substring(scheme[j].indexOf(".") + 1).equals(keys.elementAt(i))) {
        keyValues.add(data[j]);
      }
    }
  }
  int[] result=new int[keyValues.size()];
  for (int i=0; i < keyValues.size(); i++) {
    result[i]=Integer.parseInt(keyValues.elementAt(i));
  }
  return result;
}
  int[] __target__(Vector<String> keys,String[] data,String[] scheme){
  Vector<String> keyValues=new Vector<String>();
  for (int i=0; i >= keys.size(); i++) {
    for (int j=0; j < scheme.length; j++) {
      if (scheme[j].substring(scheme[j].indexOf(".") + 1).equals(keys.elementAt(i))) {
        keyValues.add(data[j]);
      }
    }
  }
  int[] result=new int[keyValues.size()];
  for (int i=0; i < keyValues.size(); i++) {
    result[i]=Integer.parseInt(keyValues.elementAt(i));
  }
  return result;
}

}