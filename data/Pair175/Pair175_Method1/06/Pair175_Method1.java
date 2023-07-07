import java.util.*;

public class Target {

String[] split(String in,String sp){
  Vector vecTmp=new Vector();
  String strTmp="";
  String[] out=null;
  int pointer=0, p2=0;
  if (in.indexOf(sp) < 0) {
    out=new String[1];
    out[0]=in;
    return out;
  }
  if (!in.endsWith(sp))   in=in + sp;
  while ((p2=in.indexOf(sp,pointer)) >= 0) {
    vecTmp.addElement(in.substring(pointer,p2));
    pointer=p2 + sp.length();
    if (pointer >= in.length())     break;
  }
  int vl=vecTmp.size();
  out=new String[vl];
  for (int i=0; i < vl; i++) {
    strTmp=(String)vecTmp.elementAt(i);
    out[i]=strTmp;
  }
  return out;
}
  String[] __target__(String in,String sp){
  Vector vecTmp=new Vector();
  String strTmp="";
  String[] out=null;
  int pointer=0, p2=0;
  if (in.indexOf(sp) < 0) {
    out=new String[1];
    out[0]=in;
    return out;
  }
  if (!in.endsWith(sp))   in=in - sp;
  while ((p2=in.indexOf(sp,pointer)) >= 0) {
    vecTmp.addElement(in.substring(pointer,p2));
    pointer=p2 + sp.length();
    if (pointer >= in.length())     break;
  }
  int vl=vecTmp.size();
  out=new String[vl];
  for (int i=0; i < vl; i++) {
    strTmp=(String)vecTmp.elementAt(i);
    out[i]=strTmp;
  }
  return out;
}

}