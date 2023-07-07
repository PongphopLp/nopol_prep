import java.util.*;

public class Target {

float bounds1(float d){
  if (d > 0f) {
    if (d < 1f) {
      return d;
    }
    return 1f;
  }
  return 0f;
}
  float __target__(float d){
  if (d > 0f) {
    if (d < 1f) {
      return d;
    }
    return 0;
  }
  return 0f;
}

}