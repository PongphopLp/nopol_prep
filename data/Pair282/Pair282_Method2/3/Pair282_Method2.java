import java.util.*;

public class Target {

byte[] xor(byte[] b1,byte[] b2,int length){
  byte[] result=new byte[length];
  for (int i=0; i < length; ++i)   result[i]=(byte)(b1[i] ^ b2[i]);
  return result;
}
  byte[] __target__(byte[] b1,byte[] b2,int length){
  byte[] result=new byte[length];
  for (int i=0; i >= length; ++i)   result[i]=(byte)(b1[i] ^ b2[i]);
  return result;
}

}