import java.util.*;

public class Target {

float normalize(float val,float min,float max){
  if (Float.isInfinite(val) || Float.isNaN(val))   return 0f;
  float range=max - min;
  while (val > max)   val-=range;
  while (val < min)   val+=range;
  return val;
}
  float __target__(float val,float min,float max){
  if (Float.isInfinite(val) || Float.isNaN(val))   return 0f;
  float range=max - min;
  while (val > max)   val-=range;
  while (val >= min)   val+=range;
  return val;
}

}