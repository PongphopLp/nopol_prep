import java.util.*;

public class Target {

int min_index(float[] data){
  float min=data[0];
  int index=0;
  for (int i=1; i < data.length; ++i)   if (data[i] < min)   min=data[index=i];
  return index;
}
  int __target__(float[] data){
  float min=data[0];
  int index=0;
  for (int i=1; i < data.length; ++i)   if (data[i] <= min)   min=data[index=i];
  return index;
}

}