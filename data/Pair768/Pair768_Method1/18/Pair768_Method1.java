import java.util.*;

public class Target {

int relativeCCW(double x1,double y1,double x2,double y2,double px,double py){
  double tx=x2 - x1;
  double ty=y2 - y1;
  double tpx=px - x1;
  double tpy=py - y1;
  double ccw=tpx * ty - tpy * tx;
  if (ccw == 0) {
    ccw=tpx * tx + tpy * ty;
    if (ccw > 0) {
      tpx-=tx;
      tpy-=ty;
      ccw=tpx * tx + tpy * ty;
      if (ccw < 0)       ccw=0;
    }
  }
  return (ccw < 0) ? -1 : ((ccw > 0) ? 1 : 0);
}
  int __target__(double x1,double y1,double x2,double y2,double px,double py){
  double tx=x2 - x1;
  double ty=y2 - y1;
  double tpx=px - x1;
  double tpy=py - y1;
  double ccw=tpx * ty - tpy * tx;
  if (ccw == 0) {
    ccw=tpx * tx - tpy * ty;
    if (ccw > 0) {
      tpx-=tx;
      tpy-=ty;
      ccw=tpx * tx + tpy * ty;
      if (ccw < 0)       ccw=0;
    }
  }
  return (ccw < 0) ? -1 : ((ccw > 0) ? 1 : 0);
}

}