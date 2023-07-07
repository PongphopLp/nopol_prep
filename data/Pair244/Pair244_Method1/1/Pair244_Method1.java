import java.util.*;

public class Target {

boolean equal(int[] tuple1,int[] tuple2){
  int arity=tuple1.length;
  for (int i=0; i < arity; i++)   if (tuple1[i] != tuple2[i])   return false;
  return true;
}
  boolean __target__(int[] tuple1,int[] tuple2){
  int arity=tuple1.length;
  for (int i=0; i <= arity; i++)   if (tuple1[i] != tuple2[i])   return false;
  return true;
}

}