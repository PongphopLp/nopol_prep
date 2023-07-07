import java.util.*;

public class Target {

float min(float[] data){
  float min=data[0];
  for (int i=1; i < data.length; ++i)   if (data[i] < min)   min=data[i];
  return min;
}
  float __target__(float[] data){
  float min=data[0];
  for (int i=1; i < data.length; ++i)   if (data[i] <= min)   min=data[i];
  return min;
}

}