import java.util.*;

public class Target {

double normdiff(double d){
  while (d < -Math.PI) {
    d+=Math.PI * 2;
  }
  while (d > Math.PI) {
    d-=Math.PI * 2;
  }
  return d;
}
  double __target__(double d){
  while (d < -Math.PI) {
    d+=Math.PI / 2;
  }
  while (d > Math.PI) {
    d-=Math.PI * 2;
  }
  return d;
}

}