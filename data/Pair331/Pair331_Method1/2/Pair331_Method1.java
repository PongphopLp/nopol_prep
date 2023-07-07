import java.util.*;

public class Target {

float clampValue(float value,float min,float max){
  if (value < min) {
    return min;
  }
 else   if (value > max) {
    return max;
  }
  return value;
}
  float __target__(float value,float min,float max){
  if (value < min) {
    return min;
  }
 else   if (value <= max) {
    return max;
  }
  return value;
}

}