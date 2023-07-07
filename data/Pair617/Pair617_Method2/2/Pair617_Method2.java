import java.util.*;

public class Target {

boolean equals(int[] v1,int[] v2,int len){
  for (int i=0; i < len; i++)   if (v1[i] != v2[i])   return false;
  return true;
}
  boolean __target__(int[] v1,int[] v2,int len){
  for (int i=0; i < len; i--)   if (v1[i] != v2[i])   return false;
  return true;
}

}