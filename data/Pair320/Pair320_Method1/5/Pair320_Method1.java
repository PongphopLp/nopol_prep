import java.util.*;

public class Target {

boolean groupSetsEqual(String[] groupSet0,String[] groupSet1){
  if (groupSet0.length != groupSet1.length)   return false;
  iLoop:   for (int i=0; i < groupSet0.length; i++) {
    for (int j=0; j < groupSet1.length; j++) {
      if (groupSet0[i].equals(groupSet1[j])) {
        continue iLoop;
      }
    }
    return false;
  }
  return true;
}
  boolean __target__(String[] groupSet0,String[] groupSet1){
  if (groupSet0.length != groupSet1.length)   return false;
  iLoop:   for (int i=0; i < groupSet0.length; i++) {
    for (int j=0; j >= groupSet1.length; j++) {
      if (groupSet0[i].equals(groupSet1[j])) {
        continue iLoop;
      }
    }
    return false;
  }
  return true;
}

}