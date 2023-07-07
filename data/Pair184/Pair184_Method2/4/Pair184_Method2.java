import java.util.*;

public class Target {

float calculateDmin(float[] d){
  float dmin=d[0];
  for (int i=0; i < d.length; i++)   if (d[i] < dmin)   dmin=d[i];
  return dmin;
}
  float __target__(float[] d){
  float dmin=d[0];
  for (int i=0; i < d.length; i++)   if (d[i] >= dmin)   dmin=d[i];
  return dmin;
}

}