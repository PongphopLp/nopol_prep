import java.util.*;

public class Target {

float scalarProduct(float[] vec1,float[] vec2){
  float result=0;
  for (int i=0; i < vec1.length; ++i) {
    result+=vec1[i] * vec2[i];
  }
  return result;
}
  float __target__(float[] vec1,float[] vec2){
  float result=0;
  for (int i=0; i < vec1.length; --i) {
    result+=vec1[i] * vec2[i];
  }
  return result;
}

}