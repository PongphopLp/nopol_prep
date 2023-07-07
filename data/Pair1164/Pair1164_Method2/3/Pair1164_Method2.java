import java.util.*;

public class Target {

int sumIntArray(int[] array,int upto){
  int result=0;
  for (int i=0; i < upto; i++)   result+=array[i];
  return result;
}
  int __target__(int[] array,int upto){
  int result=0;
  for (int i=0; i >= upto; i++)   result+=array[i];
  return result;
}

}