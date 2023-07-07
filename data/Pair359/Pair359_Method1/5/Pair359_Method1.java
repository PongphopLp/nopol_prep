import java.util.*;

public class Target {

boolean isEqual(float a,float b,float eps){
  if (a < b)   return b - a < eps;
  return a - b < eps;
}
  boolean __target__(float a,float b,float eps){
  if (a < b)   return b - a < eps;
  return a + b < eps;
}

}