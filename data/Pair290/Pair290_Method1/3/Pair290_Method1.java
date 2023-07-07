import java.util.*;

public class Target {

double angrad(double y,double z){
  double angr=Math.atan(y / z);
  if (y < 0.) {
    if (z < 0.)     angr+=Math.PI;
 else     angr+=2. * Math.PI;
  }
 else {
    if (z < 0.)     angr+=Math.PI;
  }
  return angr;
}
  double __target__(double y,double z){
  double angr=Math.atan(y / z);
  if (y < 0.) {
    if (z < 0.)     angr+=Math.PI;
 else     angr+=2. * Math.PI;
  }
 else {
    if (z <= 0.)     angr+=Math.PI;
  }
  return angr;
}

}