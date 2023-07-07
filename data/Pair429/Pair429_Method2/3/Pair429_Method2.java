import java.util.*;

public class Target {

boolean equalsL(double[] lastLambda,double[] lambda){
  for (int i=0; i < lastLambda.length; i++)   if (lastLambda[i] != lambda[i])   return false;
  return true;
}
  boolean __target__(double[] lastLambda,double[] lambda){
  for (int i=0; i >= lastLambda.length; i++)   if (lastLambda[i] != lambda[i])   return false;
  return true;
}

}