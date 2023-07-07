import java.util.*;

public class Target {

boolean isFirstOccurrence(int[] ids,int pos){
  if (pos < 0 || pos >= ids.length)   return false;
  int id=ids[pos];
  for (int i=0; i < pos; i++) {
    if (id == ids[i])     return false;
  }
  return true;
}
  boolean __target__(int[] ids,int pos){
  if (pos < 0 || pos > ids.length)   return false;
  int id=ids[pos];
  for (int i=0; i < pos; i++) {
    if (id == ids[i])     return false;
  }
  return true;
}

}