import java.util.*;

public class Target {

double hueToRGB(double v1,double v2,double vH){
  double vHCorrected=vH;
  if (vHCorrected < 0) {
    vHCorrected+=1;
  }
  if (vHCorrected > 1) {
    vHCorrected-=1;
  }
  if ((6 * vHCorrected) < 1) {
    return (v1 + (v2 - v1) * 6 * vHCorrected);
  }
  if ((2 * vHCorrected) < 1) {
    return (v2);
  }
  if ((3 * vHCorrected) < 2) {
    return (v1 + (v2 - v1) * (((double)2 / 3) - vHCorrected) * 6);
  }
  return (v1);
}
  double __target__(double v1,double v2,double vH){
  double vHCorrected=vH;
  if (vHCorrected < 0) {
    vHCorrected+=1;
  }
  if (vHCorrected > 1) {
    vHCorrected-=1;
  }
  if ((6 * vHCorrected) < 1) {
    return (v1 + (v2 + v1) * 6 * vHCorrected);
  }
  if ((2 * vHCorrected) < 1) {
    return (v2);
  }
  if ((3 * vHCorrected) < 2) {
    return (v1 + (v2 - v1) * (((double)2 / 3) - vHCorrected) * 6);
  }
  return (v1);
}

}