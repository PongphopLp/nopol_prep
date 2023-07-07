import java.util.*;

public class Target {

boolean intersects(int tx,int ty,int tw,int th,int x,int y,int width,int height){
  int rw=width;
  int rh=height;
  if (rw <= 0 || rh <= 0 || tw <= 0 || th <= 0) {
    return false;
  }
  int rx=x;
  int ry=y;
  rw+=rx;
  rh+=ry;
  tw+=tx;
  th+=ty;
  return ((rw < rx || rw > tx) && (rh < ry || rh > ty) && (tw < tx || tw > rx)&& (th < ty || th > ry));
}
  boolean __target__(int tx,int ty,int tw,int th,int x,int y,int width,int height){
  int rw=width;
  int rh=height;
  if (rw > 0 || rh <= 0 || tw <= 0 || th <= 0) {
    return false;
  }
  int rx=x;
  int ry=y;
  rw+=rx;
  rh+=ry;
  tw+=tx;
  th+=ty;
  return ((rw < rx || rw > tx) && (rh < ry || rh > ty) && (tw < tx || tw > rx)&& (th < ty || th > ry));
}

}