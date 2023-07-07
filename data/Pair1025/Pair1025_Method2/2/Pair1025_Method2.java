import java.util.*;

public class Target {

double max(double ar[]){
  int i;
  double m;
  m=ar[0];
  for (i=1; i < ar.length; ++i) {
    if (m < ar[i])     m=ar[i];
  }
  return m;
}
  double __target__(double ar[]){
  int i;
  double m;
  m=ar[0];
  for (i=1; i < ar.length; ++i) {
    if (m <= ar[i])     m=ar[i];
  }
  return m;
}

}