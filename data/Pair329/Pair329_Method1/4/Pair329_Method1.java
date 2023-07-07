import java.util.*;

public class Target {

float getMax(float a,float b,float c){
  if (a > b && a > c)   return a;
  if (b > a && b > c)   return b;
  return c;
}
  float __target__(float a,float b,float c){
  if (a > b && a > c)   return a;
  if (b > a && b >= c)   return b;
  return c;
}

}