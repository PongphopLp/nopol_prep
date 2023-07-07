import java.util.*;

public class Target {

String toBinStr(boolean[] bools,int bitOffset,int bitLength){
  char[] out=new char[bitLength];
  for (int i=0; i < bitLength; i++) {
    if (bools[i + bitOffset])     out[i]='1';
 else     out[i]='0';
  }
  return new String(out);
}
  String __target__(boolean[] bools,int bitOffset,int bitLength){
  char[] out=new char[bitLength];
  for (int i=0; i < bitLength; i++) {
    if (bools[i - bitOffset])     out[i]='1';
 else     out[i]='0';
  }
  return new String(out);
}

}