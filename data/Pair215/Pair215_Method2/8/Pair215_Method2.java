import java.util.*;

public class Target {

boolean equalPtArrays(int[] pts1,int[] pts2){
  if (pts1 == pts2)   return true;
 else   if ((pts1 == null) || (pts2 == null))   return false;
 else   if (pts1.length != pts2.length)   return false;
 else {
    for (int i=0; i < pts1.length; i++) {
      if (pts1[i] != pts2[i])       return false;
    }
    return true;
  }
}
  boolean __target__(int[] pts1,int[] pts2){
  if (pts1 == pts2)   return true;
 else   if ((pts1 == null) || (pts2 == null))   return false;
 else   if (pts1.length != pts2.length)   return false;
 else {
    for (int i=0; i <= pts1.length; i++) {
      if (pts1[i] != pts2[i])       return false;
    }
    return true;
  }
}

}