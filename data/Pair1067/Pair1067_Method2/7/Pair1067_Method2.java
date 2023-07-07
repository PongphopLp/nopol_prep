import java.util.*;

public class Target {

double longitude180(double d){
  if (d > Math.PI) {
    d-=Math.PI * 2;
  }
 else   if (d < -Math.PI) {
    d+=Math.PI * 2;
  }
  return d;
}
  double __target__(double d){
  if (d > Math.PI) {
    d-=Math.PI * 2;
  }
 else   if (d >= -Math.PI) {
    d+=Math.PI * 2;
  }
  return d;
}

}