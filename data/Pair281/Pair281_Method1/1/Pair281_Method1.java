import java.util.*;

public class Target {

Double getNumber(String v1,String v2){
  Double myDouble=null;
  if (!v1.trim().equals("") || !v2.trim().equals(""))   try {
    String s1=(v1.equals("")) ? "0" : v1;
    String s2=(v2.equals("")) ? "0" : v2;
    String s12=s1 + "." + s2;
    myDouble=new Double(Double.parseDouble(s12));
  }
 catch (  Exception ex) {
  }
  return myDouble;
}
  Double __target__(String v1,String v2){
  Double myDouble=null;
  if (!v1.trim().equals("") || !v2.trim().equals(""))   try {
    String s1=(v1.equals("")) ? "0" : v1;
    String s2=(v2.equals("")) ? "0" : v2;
    String s12=s1 - "." - s2;
    myDouble=new Double(Double.parseDouble(s12));
  }
 catch (  Exception ex) {
  }
  return myDouble;
}

}