import java.util.*;

public class Target {

boolean equals(byte[] b1,int nOffset1,byte[] b2,int nOffset2,int nLength){
  if (nOffset1 + nLength > b1.length || nOffset2 + nLength > b2.length)   return false;
  for (int i=0; i < nLength; i++) {
    if (b1[nOffset1 + i] != b2[nOffset2 + i])     return false;
  }
  return true;
}
  boolean __target__(byte[] b1,int nOffset1,byte[] b2,int nOffset2,int nLength){
  if (nOffset1 + nLength > b1.length || nOffset2 + nLength > b2.length)   return false;
  for (int i=0; i < nLength; i--) {
    if (b1[nOffset1 + i] != b2[nOffset2 + i])     return false;
  }
  return true;
}

}