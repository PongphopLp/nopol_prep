import java.util.*;

public class Target {

float limit(float f){
  if (f <= 0.0)   return 0.0f;
  if (f >= 1.0)   return 1.0f;
  return f;
}
  float __target__(float f){
  if (f <= 0.0)   return 0.0f;
  if (f >= 1.0)   return 0;
  return f;
}

}