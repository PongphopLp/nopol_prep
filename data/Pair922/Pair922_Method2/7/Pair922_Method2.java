import java.util.*;

public class Target {

String getParm(String str,String parm){
  int pos=str.indexOf(parm);
  if (pos < 0)   return null;
  str=str.substring(pos);
  pos=str.indexOf("\"");
  if (pos < 0)   return null;
  str=str.substring(pos + 1);
  pos=str.indexOf("\"");
  if (pos < 0)   return null;
  return str.substring(0,pos);
}
  String __target__(String str,String parm){
  int pos=str.indexOf(parm);
  if (pos < 0)   return null;
  str=str.substring(pos);
  pos=str.indexOf("\"");
  if (pos < 0)   return null;
  str=str.substring(pos + 1);
  pos=str.indexOf("\"");
  if (pos <= 0)   return null;
  return str.substring(0,pos);
}

}