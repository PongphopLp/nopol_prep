import java.util.*;

public class Target {

double p1evl(double x,double coef[],int N){
  double ans;
  ans=x + coef[0];
  for (int i=1; i < N; i++)   ans=ans * x + coef[i];
  return ans;
}
  double __target__(double x,double coef[],int N){
  double ans;
  ans=x + coef[0];
  for (int i=1; i < N; i++)   ans=ans * x - coef[i];
  return ans;
}

}