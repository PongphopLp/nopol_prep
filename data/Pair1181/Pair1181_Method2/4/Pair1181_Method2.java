import java.util.*;

public class Target {

String substitute(String str,String variable,String value,int num){
  int subsLeftToPreform=num;
  StringBuffer buf=new StringBuffer(str);
  int ind=str.indexOf(variable);
  while (ind >= 0 && subsLeftToPreform-- != 0) {
    buf.replace(ind,ind + variable.length(),value);
    ind=buf.toString().indexOf(variable);
  }
  return buf.toString();
}
  String __target__(String str,String variable,String value,int num){
  int subsLeftToPreform=num;
  StringBuffer buf=new StringBuffer(str);
  int ind=str.indexOf(variable);
  while (ind > 0 && subsLeftToPreform-- != 0) {
    buf.replace(ind,ind + variable.length(),value);
    ind=buf.toString().indexOf(variable);
  }
  return buf.toString();
}

}