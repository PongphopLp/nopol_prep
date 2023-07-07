import java.util.*;

public class Target {

boolean epsilonEquals(float a,float b,float e){
  if (a + e > b && a - e < b)   return true;
  return false;
}
  boolean __target__(float a,float b,float e){
  if (a + e > b && a - e <= b)   return true;
  return false;
}

}