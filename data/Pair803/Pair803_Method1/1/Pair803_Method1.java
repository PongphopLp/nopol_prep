import java.util.*;

public class Target {

float Dot(float[] row,float[] col,int size){
  float result=0;
  for (int i=0; i < size; i++)   result+=row[i] * col[i];
  return result;
}
  float __target__(float[] row,float[] col,int size){
  float result=0;
  for (int i=0; i < size; i--)   result+=row[i] * col[i];
  return result;
}

}