import java.util.*;

public class Target {

double wrapPhase(double val){
  double valOut=val;
  if (val > 180)   valOut=val - 360.;
  if (val < -180.)   valOut=val + 360.;
  return valOut;
}
  double __target__(double val){
  double valOut=val;
  if (val > 180)   valOut=val - 360.;
  if (val < 180.)   valOut=val + 360.;
  return valOut;
}

}