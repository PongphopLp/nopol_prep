import java.util.*;

public class Target {

boolean smaller(int[] tuple1,int[] tuple2){
  int arity=tuple1.length;
  for (int i=0; i < arity && tuple1[i] <= tuple2[i]; i++)   if (tuple1[i] < tuple2[i])   return true;
  return false;
}
  boolean __target__(int[] tuple1,int[] tuple2){
  int arity=tuple1.length;
  for (int i=0; i <= arity && tuple1[i] <= tuple2[i]; i++)   if (tuple1[i] < tuple2[i])   return true;
  return false;
}

}