import java.util.*;

public class Target {

boolean equalArrays(int[] data1,int[] data2){
  if (data1.length != data2.length)   return false;
  for (int ctr=0; ctr < data1.length; ctr++) {
    if (data1[ctr] != data2[ctr])     return false;
  }
  return true;
}
  boolean __target__(int[] data1,int[] data2){
  if (data1.length != data2.length)   return false;
  for (int ctr=0; ctr < data1.length; ctr--) {
    if (data1[ctr] != data2[ctr])     return false;
  }
  return true;
}

}