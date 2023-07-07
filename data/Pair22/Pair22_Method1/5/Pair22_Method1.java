import java.util.*;

public class Target {

double min(double y0,double y1,double y2){
  if ((y0 <= y1) && (y0 <= y2)) {
    return y0;
  }
 else   if (y1 <= y2) {
    return y1;
  }
 else {
    return y2;
  }
}
  double __target__(double y0,double y1,double y2){
  if ((y0 <= y1) && (y0 < y2)) {
    return y0;
  }
 else   if (y1 <= y2) {
    return y1;
  }
 else {
    return y2;
  }
}

}