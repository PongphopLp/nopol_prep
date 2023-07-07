import java.util.*;

public class Target {

float ease(float t,float b,float c,float d){
  if (t == 0)   return b;
  if (t == d)   return b + c;
  if ((t/=d / 2) < 1)   return c / 2 * (float)Math.pow(2,10 * (t - 1)) + b;
  return c / 2 * (-(float)Math.pow(2,-10 * --t) + 2) + b;
}
  float __target__(float t,float b,float c,float d){
  if (t == 0)   return b;
  if (t == d)   return b + c;
  if ((t/=d / 2) < 1)   return c / 2 * (float)Math.pow(2,10 / (t - 1)) + b;
  return c / 2 * (-(float)Math.pow(2,-10 * --t) + 2) + b;
}

}