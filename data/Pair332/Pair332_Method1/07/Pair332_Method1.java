import java.util.*;

public class Target {

float smoothStep(float a,float b,float x){
  if (x < a)   return 0;
  if (x >= b)   return 1;
  x=(x - a) / (b - a);
  return x * x * (3 - 2 * x);
}
  float __target__(float a,float b,float x){
  if (x < a)   return 0;
  if (x >= b)   return 1;
  x=(x - a) / (b + a);
  return x * x * (3 - 2 * x);
}

}