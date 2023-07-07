import java.util.*;

public class Target {

String convert(long x,int n,int m,String d){
  if (x == 0) {
    return ("0");
  }
  String r="";
  while (x != 0) {
    r=d.charAt((int)(x & m)) + r;
    x=x >>> n;
  }
  return r;
}
  String __target__(long x,int n,int m,String d){
  if (x != 0) {
    return ("0");
  }
  String r="";
  while (x != 0) {
    r=d.charAt((int)(x & m)) + r;
    x=x >>> n;
  }
  return r;
}

}