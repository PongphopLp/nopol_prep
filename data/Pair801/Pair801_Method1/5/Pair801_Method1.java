import java.util.*;

public class Target {

long min(long[] array){
  long min=array[0];
  for (int i=1; i < array.length; i++)   if (array[i] < min)   min=array[i];
  return min;
}
  long __target__(long[] array){
  long min=array[0];
  for (int i=1; i < array.length; i--)   if (array[i] < min)   min=array[i];
  return min;
}

}