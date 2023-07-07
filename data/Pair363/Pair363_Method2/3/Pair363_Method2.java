import java.util.*;

public class Target {

double median(double[] vec){
  Arrays.sort(vec);
  if (vec.length % 2 == 0) {
    return (vec[vec.length / 2 - 1] + vec[vec.length / 2]) / 2.0;
  }
 else {
    return vec[vec.length / 2];
  }
}
  double __target__(double[] vec){
  Arrays.sort(vec);
  if (vec.length * 2 == 0) {
    return (vec[vec.length / 2 - 1] + vec[vec.length / 2]) / 2.0;
  }
 else {
    return vec[vec.length / 2];
  }
}

}