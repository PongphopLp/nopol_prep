import java.util.*;

public class Target {

double combineTargets(double[] targets){
  double highest=targets[0];
  for (int i=1; i < targets.length; ++i)   if (highest < targets[i])   highest=targets[i];
  return highest;
}
  double __target__(double[] targets){
  double highest=targets[0];
  for (int i=1; i < targets.length; --i)   if (highest < targets[i])   highest=targets[i];
  return highest;
}

}