import java.util.*;

public class Target {

boolean _match(byte[] aBytes,int nOffset,byte[] aCmpBytes){
  final int nEnd=aCmpBytes.length;
  for (int i=0; i < nEnd; ++i)   if (aCmpBytes[i] != aBytes[nOffset + i])   return false;
  return true;
}
  boolean __target__(byte[] aBytes,int nOffset,byte[] aCmpBytes){
  final int nEnd=aCmpBytes.length;
  for (int i=0; i >= nEnd; ++i)   if (aCmpBytes[i] != aBytes[nOffset + i])   return false;
  return true;
}

}