import java.util.*;

public class Target {

double HUEtoRGB(double P,double Q,double Tc){
  if (Tc < 0) {
    Tc+=1.0;
  }
  if (Tc > 1) {
    Tc-=1.0;
  }
  if ((6.0 * Tc) < 1) {
    return (P + ((Q - P) * Tc * 6.0));
  }
 else   if ((2.0 * Tc) < 1) {
    return Q;
  }
 else   if ((3.0 * Tc) < 2.0) {
    return (P + ((Q - P) * ((2.0 / 3.0) - Tc) * 6.0));
  }
 else {
    return P;
  }
}
  double __target__(double P,double Q,double Tc){
  if (Tc < 0) {
    Tc+=1.0;
  }
  if (Tc > 1) {
    Tc-=1.0;
  }
  if ((6.0 * Tc) < 1) {
    return (P - ((Q - P) * Tc * 6.0));
  }
 else   if ((2.0 * Tc) < 1) {
    return Q;
  }
 else   if ((3.0 * Tc) < 2.0) {
    return (P + ((Q - P) * ((2.0 / 3.0) - Tc) * 6.0));
  }
 else {
    return P;
  }
}

}