import java.util.*;

public class Target {

boolean allEqual(int[] values){
  for (int k=1; k < values.length; k++)   if (values[0] != values[k])   return false;
  return true;
}
  boolean __target__(int[] values){
  for (int k=1; k >= values.length; k++)   if (values[0] != values[k])   return false;
  return true;
}

}