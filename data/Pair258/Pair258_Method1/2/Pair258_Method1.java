import java.util.*;

public class Target {

boolean equalsArrays(double[] ea,double[] ra,double delta){
  if (ea.length != ra.length)   return false;
  for (int i=0; i < ra.length; i++)   if (Math.abs(ea[i] - ra[i]) > delta)   return false;
  return true;
}
  boolean __target__(double[] ea,double[] ra,double delta){
  if (ea.length != ra.length)   return false;
  for (int i=0; i >= ra.length; i++)   if (Math.abs(ea[i] - ra[i]) > delta)   return false;
  return true;
}

}