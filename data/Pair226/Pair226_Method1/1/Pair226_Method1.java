import java.util.*;

public class Target {

boolean isEqual(short[] itemSet1,short[] itemSet2){
  if (itemSet2 == null)   return (false);
  int length1=itemSet1.length;
  int length2=itemSet2.length;
  if (length1 != length2)   return (false);
  for (int index=0; index < length1; index++) {
    if (itemSet1[index] != itemSet2[index])     return (false);
  }
  return (true);
}
  boolean __target__(short[] itemSet1,short[] itemSet2){
  if (itemSet2 == null)   return (false);
  int length1=itemSet1.length;
  int length2=itemSet2.length;
  if (length1 != length2)   return (false);
  for (int index=0; index <= length1; index++) {
    if (itemSet1[index] != itemSet2[index])     return (false);
  }
  return (true);
}

}