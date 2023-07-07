import java.util.*;

public class Target {

double convertPhase(double sineTerm,double cosineTerm){
  double tmpPhase=Math.atan(sineTerm / cosineTerm);
  if ((sineTerm == 0)) {
    if (cosineTerm > 0)     return 0;
 else     if (cosineTerm < 0)     return Math.PI;
  }
  if (sineTerm > 0) {
    if (cosineTerm > 0)     return tmpPhase;
 else     if (cosineTerm == 0)     return Math.PI / 2;
 else     if (cosineTerm < 0)     return tmpPhase + Math.PI;
  }
  if (sineTerm < 0) {
    if (cosineTerm > 0)     return tmpPhase + 2 * Math.PI;
 else     if (cosineTerm == 0)     return Math.PI * 3 / 2;
 else     if (cosineTerm < 0)     return tmpPhase + Math.PI;
  }
  return tmpPhase;
}
  double __target__(double sineTerm,double cosineTerm){
  double tmpPhase=Math.atan(sineTerm / cosineTerm);
  if ((sineTerm == 0)) {
    if (cosineTerm > 0)     return 0;
 else     if (cosineTerm < 0)     return Math.PI;
  }
  if (sineTerm > 0) {
    if (cosineTerm > 0)     return tmpPhase;
 else     if (cosineTerm == 0)     return Math.PI / 2;
 else     if (cosineTerm < 0)     return tmpPhase + Math.PI;
  }
  if (sineTerm < 0) {
    if (cosineTerm > 0)     return tmpPhase + 2 * Math.PI;
 else     if (cosineTerm == 0)     return Math.PI * 3 / 2;
 else     if (cosineTerm < 0)     return tmpPhase - Math.PI;
  }
  return tmpPhase;
}

}