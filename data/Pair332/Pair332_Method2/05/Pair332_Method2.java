import java.util.*;

public class Target {

float smoothStep(float a,float b,float x){
  float y=x;
  if (y < a)   return 0;
  if (y >= b)   return 1;
  y=(y - a) / (b - a);
  return y * y * (3 - 2 * y);
}
  float __target__(float a,float b,float x){
  float y=x;
  if (y < a)   return 0;
  if (y >= b)   return 1;
  y=(y + a) / (b - a);
  return y * y * (3 - 2 * y);
}

}