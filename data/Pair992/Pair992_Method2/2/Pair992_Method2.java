import java.util.*;

public class Target {

int max(int[] values){
  int result=values[0];
  for (  int i : values)   if (i > result)   result=i;
  return result;
}
  int __target__(int[] values){
  int result=values[0];
  for (  int i : values)   if (i >= result)   result=i;
  return result;
}

}