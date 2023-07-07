import java.util.*;

public class Target {

double hypot(double aa,double bb){
  double cc=0.0D, ratio=0.0D;
  double amod=Math.abs(aa);
  double bmod=Math.abs(bb);
  if (amod == 0.0D) {
    cc=bmod;
  }
 else {
    if (bmod == 0.0D) {
      cc=amod;
    }
 else {
      if (amod <= bmod) {
        ratio=amod / bmod;
        cc=bmod * Math.sqrt(1.0D + ratio * ratio);
      }
 else {
        ratio=bmod / amod;
        cc=amod * Math.sqrt(1.0D + ratio * ratio);
      }
    }
  }
  return cc;
}
  double __target__(double aa,double bb){
  double cc=0.0D, ratio=0.0D;
  double amod=Math.abs(aa);
  double bmod=Math.abs(bb);
  if (amod == 0.0D) {
    cc=bmod;
  }
 else {
    if (bmod == 0.0D) {
      cc=amod;
    }
 else {
      if (amod < bmod) {
        ratio=amod / bmod;
        cc=bmod * Math.sqrt(1.0D + ratio * ratio);
      }
 else {
        ratio=bmod / amod;
        cc=amod * Math.sqrt(1.0D + ratio * ratio);
      }
    }
  }
  return cc;
}

}