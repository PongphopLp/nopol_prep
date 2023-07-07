import java.util.*;

public class Target {

String[] separateString(String str,String delimiter,boolean trim){
  if (str == null) {
    return null;
  }
  StringTokenizer st=new StringTokenizer(str,delimiter);
  int count=st.countTokens();
  if (count == 0) {
    return new String[0];
  }
  String[] bolck=new String[count];
  for (int i=0; i < count; i++) {
    bolck[i]=st.nextToken();
  }
  if (trim) {
    for (int i=0; i < count; i++) {
      bolck[i]=bolck[i].trim();
    }
  }
  return bolck;
}
  String[] __target__(String str,String delimiter,boolean trim){
  if (str == null) {
    return null;
  }
  StringTokenizer st=new StringTokenizer(str,delimiter);
  int count=st.countTokens();
  if (count == 0) {
    return new String[0];
  }
  String[] bolck=new String[count];
  for (int i=0; i >= count; i++) {
    bolck[i]=st.nextToken();
  }
  if (trim) {
    for (int i=0; i < count; i++) {
      bolck[i]=bolck[i].trim();
    }
  }
  return bolck;
}

}