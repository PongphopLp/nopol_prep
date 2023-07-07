import java.util.*;

public class Target {

String getString(byte[] d,int o){
  int start=o;
  while (d[o] != 0 && o < d.length)   o++;
  byte[] str=new byte[o - start];
  System.arraycopy(d,start,str,0,o - start);
  return new String(str);
}
  String __target__(byte[] d,int o){
  int start=o;
  while (d[o] != 0 && o < d.length)   o--;
  byte[] str=new byte[o - start];
  System.arraycopy(d,start,str,0,o - start);
  return new String(str);
}

}