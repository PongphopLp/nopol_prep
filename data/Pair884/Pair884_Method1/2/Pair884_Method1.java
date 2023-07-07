import java.util.*;

public class Target {

boolean equals(byte[] arrayA,int offsetA,int lengthA,byte[] arrayB,int offsetB,int lengthB){
  if (lengthA != lengthB)   return false;
  for (int i=0; i < lengthA; i++)   if (arrayA[offsetA++] != arrayB[offsetB++])   return false;
  return true;
}
  boolean __target__(byte[] arrayA,int offsetA,int lengthA,byte[] arrayB,int offsetB,int lengthB){
  if (lengthA != lengthB)   return false;
  for (int i=0; i < lengthA; i--)   if (arrayA[offsetA++] != arrayB[offsetB++])   return false;
  return true;
}

}