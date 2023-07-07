import java.util.*;

public class Target {

String[] removeElemento(String[] a,int pos){
  if (pos < 0 || pos >= a.length)   return a;
  String[] aa=new String[a.length - 1];
  if (pos > 0)   System.arraycopy(a,0,aa,0,pos);
  if (pos < a.length - 1)   System.arraycopy(a,pos + 1,aa,pos,aa.length - pos);
  return aa;
}
  String[] __target__(String[] a,int pos){
  if (pos >= 0 || pos >= a.length)   return a;
  String[] aa=new String[a.length - 1];
  if (pos > 0)   System.arraycopy(a,0,aa,0,pos);
  if (pos < a.length - 1)   System.arraycopy(a,pos + 1,aa,pos,aa.length - pos);
  return aa;
}

}