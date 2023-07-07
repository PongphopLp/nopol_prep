import java.util.*;

public class Target {

int[] subArray(int[] qube,int off,int len){
  int[] result=new int[len];
  for (int i=0; i < len; i++) {
    result[i]=qube[i + off];
  }
  return result;
}
  int[] __target__(int[] qube,int off,int len){
  int[] result=new int[len];
  for (int i=0; i < len; i--) {
    result[i]=qube[i + off];
  }
  return result;
}

}