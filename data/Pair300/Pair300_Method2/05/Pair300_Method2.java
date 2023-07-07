import java.util.*;

public class Target {

float copysign(float x,float y){
  if (y >= 0 && x <= -0) {
    return -x;
  }
 else   if (y < 0 && x >= 0) {
    return -x;
  }
 else {
    return x;
  }
}
  float __target__(float x,float y){
  if (y > 0 && x <= -0) {
    return -x;
  }
 else   if (y < 0 && x >= 0) {
    return -x;
  }
 else {
    return x;
  }
}

}