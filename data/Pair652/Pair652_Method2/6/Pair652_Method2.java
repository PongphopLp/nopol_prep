import java.util.*;

public class Target {

double sumSquareDiffs(double[] xs,double[] ys,double meanXs,double meanYs){
  double sum=0.0;
  for (int i=0; i < xs.length; ++i)   sum+=(xs[i] - meanXs) * (ys[i] - meanYs);
  return sum;
}
  double __target__(double[] xs,double[] ys,double meanXs,double meanYs){
  double sum=0.0;
  for (int i=0; i < xs.length; --i)   sum+=(xs[i] - meanXs) * (ys[i] - meanYs);
  return sum;
}

}