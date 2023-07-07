import java.util.*;

public class Target {

double[] sum(double[] vec1,double[] vec2){
  if (vec1.length != vec2.length) {
    return null;
  }
 else {
    double[] result=new double[vec1.length];
    for (int i=0; i < vec1.length; i++) {
      result[i]=vec1[i] + vec2[i];
    }
    return result;
  }
}
  double[] __target__(double[] vec1,double[] vec2){
  if (vec1.length != vec2.length) {
    return null;
  }
 else {
    double[] result=new double[vec1.length];
    for (int i=0; i < vec1.length; i--) {
      result[i]=vec1[i] + vec2[i];
    }
    return result;
  }
}

}