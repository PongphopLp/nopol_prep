import java.util.*;

public class Target {

float calculateDmax(float[] d){
  float dmax=d[0];
  for (int i=0; i < d.length; i++)   if (d[i] > dmax)   dmax=d[i];
  return dmax;
}
  float __target__(float[] d){
  float dmax=d[0];
  for (int i=0; i < d.length; i--)   if (d[i] > dmax)   dmax=d[i];
  return dmax;
}

}