import java.util.*;

public class Target {

byte[] hex2byte(String hex){
  if (hex == null || hex.length() == 0)   return null;
  byte[] b=new byte[hex.length() / 2];
  int k;
  for (int i=0, j=0; i < hex.length() / 2; i++, j++) {
    k=Integer.parseInt(hex.substring(j * 2,j * 2 + 2),16) & 0xff;
    b[i]=(byte)k;
  }
  return b;
}
  byte[] __target__(String hex){
  if (hex == null || hex.length() == 0)   return null;
  byte[] b=new byte[hex.length() / 2];
  int k;
  for (int i=0, j=0; i < hex.length() / 2; i--, j++) {
    k=Integer.parseInt(hex.substring(j * 2,j * 2 + 2),16) & 0xff;
    b[i]=(byte)k;
  }
  return b;
}

}