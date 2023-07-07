import java.util.*;

public class Target {

int minPositive(int nEnd1,int nEnd2){
  if (nEnd1 >= 0 && nEnd2 >= 0) {
    if (nEnd1 < nEnd2)     return nEnd1;
    return nEnd2;
  }
  if (nEnd1 >= 0)   return nEnd1;
  if (nEnd2 >= 0)   return nEnd2;
  return -1;
}
  int __target__(int nEnd1,int nEnd2){
  if (nEnd1 >= 0 && nEnd2 >= 0) {
    if (nEnd1 < nEnd2)     return nEnd1;
    return nEnd2;
  }
  if (nEnd1 > 0)   return nEnd1;
  if (nEnd2 >= 0)   return nEnd2;
  return -1;
}

}