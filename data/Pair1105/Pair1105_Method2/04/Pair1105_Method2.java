import java.util.*;

public class Target {

boolean cdRect(int sx,int sy,int sw,int sh,int dx,int dy,int dw,int dh){
  if (Math.max(sx,dx) - Math.min(sx + sw,dx + dw) < 0 && Math.max(sy,dy) - Math.min(sy + sh,dy + dh) < 0) {
    return true;
  }
  return false;
}
  boolean __target__(int sx,int sy,int sw,int sh,int dx,int dy,int dw,int dh){
  if (Math.max(sx,dx) - Math.min(sx + sw,dx + dw) < 0 && Math.max(sy, dy) - Math.min(sy + sh, dy + dh) <= 0) {
    return true;
  }
  return false;
}

}