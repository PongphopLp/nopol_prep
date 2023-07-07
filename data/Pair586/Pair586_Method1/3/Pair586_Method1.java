import java.util.*;

public class Target {

double sum(double[] hist,int begin,int end){
  double s=0;
  for (int i=begin; i < end; ++i) {
    s+=hist[i];
  }
  return s;
}
  double __target__(double[] hist,int begin,int end){
  double s=0;
  for (int i=begin; i < end; --i) {
    s+=hist[i];
  }
  return s;
}

}