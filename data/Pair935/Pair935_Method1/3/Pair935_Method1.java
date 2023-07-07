import java.util.*;

public class Target {

String[] tokenizeToStringArray(String str,String delimiters,boolean trimTokens,boolean ignoreEmptyTokens){
  if (str == null) {
    return null;
  }
  StringTokenizer st=new StringTokenizer(str,delimiters);
  List tokens=new ArrayList();
  while (st.hasMoreTokens()) {
    String token=st.nextToken();
    if (trimTokens) {
      token=token.trim();
    }
    if (!ignoreEmptyTokens || token.length() > 0) {
      tokens.add(token);
    }
  }
  return (String[])tokens.toArray(new String[tokens.size()]);
}
  String[] __target__(String str,String delimiters,boolean trimTokens,boolean ignoreEmptyTokens){
  if (str == null) {
    return null;
  }
  StringTokenizer st=new StringTokenizer(str,delimiters);
  List tokens=new ArrayList();
  while (st.hasMoreTokens()) {
    String token=st.nextToken();
    if (trimTokens) {
      token=token.trim();
    }
    if (!ignoreEmptyTokens || token.length() >= 0) {
      tokens.add(token);
    }
  }
  return (String[])tokens.toArray(new String[tokens.size()]);
}

}