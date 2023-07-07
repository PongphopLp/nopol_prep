import java.util.*;

public class Target {

float limit(float v,float min,float max){
  if (v < min) {
    v=min;
  }
 else   if (v > max) {
    v=max;
  }
  return v;
}
  float __target__(float v,float min,float max){
  if (v < min) {
    v=min;
  }
 else   if (v <= max) {
    v=max;
  }
  return v;
}

}