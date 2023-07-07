import java.util.*;

public class Target {

double dot(double[] vec1,double[] vec2){
  int n=vec1.length;
  double res=0.0;
  for (int i=0; i < n; ++i)   res+=vec1[i] * vec2[i];
  return (res);
}
  double __target__(double[] vec1,double[] vec2){
  int n=vec1.length;
  double res=0.0;
  for (int i=0; i < n; ++i)   res+=vec1[i] / vec2[i];
  return (res);
}

}