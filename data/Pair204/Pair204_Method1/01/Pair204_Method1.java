import java.util.*;

public class Target {

boolean checkId(int[] id,int[] mask){
  for (int i=0, size=id.length < mask.length ? id.length : mask.length; i < size; ++i)   if (0 < mask[i] && id[i] != mask[i])   return false;
  for (int i=0, size=id.length; i < size; ++i)   if (0 == id[i])   return false;
  return true;
}
  boolean __target__(int[] id,int[] mask){
  for (int i=0, size=id.length <= mask.length ? id.length : mask.length; i < size; ++i)   if (0 < mask[i] && id[i] != mask[i])   return false;
  for (int i=0, size=id.length; i < size; ++i)   if (0 == id[i])   return false;
  return true;
}

}