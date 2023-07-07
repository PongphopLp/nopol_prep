import java.util.*;

public class Target {

float[] trim(float[] a,int size){
  if (a.length == size) {
    return a;
  }
 else {
    float[] b=new float[size];
    System.arraycopy(a,0,b,0,size);
    return b;
  }
}
  float[] __target__(float[] a,int size){
  if (a.length != size) {
    return a;
  }
 else {
    float[] b=new float[size];
    System.arraycopy(a,0,b,0,size);
    return b;
  }
}

}