import java.util.*;

public class Target {

String[] tokenizeString(String str,String delim){
  Vector<String> vec=new Vector<String>();
  int offset=str.indexOf(delim), prevIndex=-1;
  String cur=null;
  while (offset != -1 && offset < str.length()) {
    if (offset > 0) {
      cur=str.substring(prevIndex + 1,offset);
      vec.add(cur);
      prevIndex=offset;
      offset=str.indexOf(delim,prevIndex + 1);
    }
  }
  if (offset < str.length() - 1) {
    vec.add(str.substring(prevIndex + 1));
  }
  return vec.toArray(new String[0]);
}
  String[] __target__(String str,String delim){
  Vector<String> vec=new Vector<String>();
  int offset=str.indexOf(delim), prevIndex=-1;
  String cur=null;
  while (offset != -1 && offset < str.length()) {
    if (offset > 0) {
      cur=str.substring(prevIndex + 1,offset);
      vec.add(cur);
      prevIndex=offset;
      offset=str.indexOf(delim,prevIndex + 1);
    }
  }
  if (offset < str.length() - 1) {
    vec.add(str.substring(prevIndex - 1));
  }
  return vec.toArray(new String[0]);
}

}