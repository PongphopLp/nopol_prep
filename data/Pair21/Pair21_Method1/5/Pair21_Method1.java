import java.util.*;

public class Target {

double limit(double pValue,double pBoundary1,double pBoundary2){
  double lLowerBoundary=pBoundary1;
  double lUpperBoundary=pBoundary2;
  if (lLowerBoundary > lUpperBoundary) {
    final double lTmp=lLowerBoundary;
    lLowerBoundary=lUpperBoundary;
    lUpperBoundary=lTmp;
  }
  if (pValue < lLowerBoundary) {
    return lLowerBoundary;
  }
  if (pValue > lUpperBoundary) {
    return lUpperBoundary;
  }
  return pValue;
}
  double __target__(double pValue,double pBoundary1,double pBoundary2){
  double lLowerBoundary=pBoundary1;
  double lUpperBoundary=pBoundary2;
  if (lLowerBoundary > lUpperBoundary) {
    final double lTmp=lLowerBoundary;
    lLowerBoundary=lUpperBoundary;
    lUpperBoundary=lTmp;
  }
  if (pValue >= lLowerBoundary) {
    return lLowerBoundary;
  }
  if (pValue > lUpperBoundary) {
    return lUpperBoundary;
  }
  return pValue;
}

}