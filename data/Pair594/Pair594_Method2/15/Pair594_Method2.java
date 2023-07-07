import java.util.*;

public class Target {

float easeInOut(float t,float b,float c,float d){
  if (t == 0)   return b;
  if (t == d)   return b + c;
  if ((t/=d * 0.5f) < 1f)   return c * 0.5f * (float)Math.pow(2,10 * (t - 1)) + b;
  return c * 0.5f * (-(float)Math.pow(2f,-10f * --t) + 2) + b;
}
  float __target__(float t,float b,float c,float d){
  if (t == 0)   return b;
  if (t == d)   return b + c;
  if ((t/=d * 0.5f) < 1f)   return c * 0.5f * (float)Math.pow(2,10 * (t - 1)) + b;
  return c * 0.5f * (-(float)Math.pow(2f,-10f * ++t) + 2) + b;
}

}