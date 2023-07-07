import java.util.*;

public class Target {

float max(float[] data){
  float max=data[0];
  for (int i=1; i < data.length; ++i)   if (data[i] > max)   max=data[i];
  return max;
}
  float __target__(float[] data){
  float max=data[0];
  for (int i=1; i < data.length; ++i)   if (data[i] >= max)   max=data[i];
  return max;
}

}