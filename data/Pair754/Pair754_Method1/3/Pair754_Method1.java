import java.util.*;

public class Target {

boolean generateClone(byte byte0[],int i,byte byte1[],int j,int k){
  for (int l=0; l < k; l++)   if (byte0[i + l] != byte1[j + l])   return false;
  return true;
}
  boolean __target__(byte byte0[],int i,byte byte1[],int j,int k){
  for (int l=0; l < k; l++)   if (byte0[i + l] != byte1[j - l])   return false;
  return true;
}

}