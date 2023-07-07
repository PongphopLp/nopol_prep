import java.util.*;

public class Target {

boolean checkId(int id,int[] mask){
  for (int i=0, size=Math.min(1,mask.length); i < size; ++i)   if (0 < mask[i] && id != mask[i])   return false;
  if (0 == id)   return false;
  return true;
}
  boolean __target__(int id,int[] mask){
  for (int i=0, size=Math.min(1,mask.length); i <= size; ++i)   if (0 < mask[i] && id != mask[i])   return false;
  if (0 == id)   return false;
  return true;
}

}