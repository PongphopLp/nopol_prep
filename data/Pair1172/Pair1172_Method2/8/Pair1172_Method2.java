import java.util.*;

public class Target {

String getDataFieldValue(String s,String s1){
  String s2=new String();
  String s3=new String();
  int i=0;
  boolean flag=false;
  boolean flag1=false;
  boolean flag2=false;
  s2=s1 + "=" + '"';
  i=s.indexOf(s2);
  if (i > 0) {
    int j=i + s2.length();
    int k=j;
    s2="\"";
    int l=s.indexOf(s2,j);
    if (k > 0 && l > 0)     s3=s.substring(k,l);
  }
  return s3;
}
  String __target__(String s,String s1){
  String s2=new String();
  String s3=new String();
  int i=0;
  boolean flag=false;
  boolean flag1=false;
  boolean flag2=false;
  s2=s1 + "=" + '"';
  i=s.indexOf(s2);
  if (i > 0) {
    int j=i + s2.length();
    int k=j;
    s2="\"";
    int l=s.indexOf(s2,j);
    if (k > 0 && l <= 0)     s3=s.substring(k,l);
  }
  return s3;
}

}