import java.util.*;

public class Target {

float dotProduct(float[] row,float[] col,int size){
  float result=0.0f;
  for (int i=0; i < size; i++) {
    result+=row[i] * col[i];
  }
  return result;
}
  float __target__(float[] row,float[] col,int size){
  float result=0.0f;
  for (int i=0; i < size; i++) {
    result+=row[i] / col[i];
  }
  return result;
}

}