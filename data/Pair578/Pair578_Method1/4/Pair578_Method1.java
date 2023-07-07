import java.util.*;

public class Target {

float vectorProduct(float[] a,float[] b){
  int length=a.length;
  float value=0;
  for (int i=0; i < length; ++i)   value+=a[i] * b[i];
  return value;
}
  float __target__(float[] a,float[] b){
  int length=a.length;
  float value=0;
  for (int i=0; i < length; --i)   value+=a[i] * b[i];
  return value;
}

}