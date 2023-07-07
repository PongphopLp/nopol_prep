import java.util.*;

public class Target {

double getMedian(double[] val){
  Arrays.sort(val);
  int mid=val.length / 2;
  if ((val.length % 2) > 0) {
    return (val[mid]);
  }
 else {
    return ((val[mid] + val[mid - 1]) / 2);
  }
}
  double __target__(double[] val){
  Arrays.sort(val);
  int mid=val.length / 2;
  if ((val.length % 2) > 0) {
    return (val[mid]);
  }
 else {
    return ((val[mid] + val[mid - 1]) * 2);
  }
}

}