import java.util.*;

public class Target {

boolean equals0(int[] p0,int[] p1){
  if (p0.length != p1.length) {
    return false;
  }
  int size=p0.length;
  boolean nonEqual=false;
  for (int x=0; x < size; x++) {
    nonEqual|=!(p0[x] == p1[x]);
  }
  return !nonEqual;
}
  boolean __target__(int[] p0,int[] p1){
  if (p0.length != p1.length) {
    return false;
  }
  int size=p0.length;
  boolean nonEqual=false;
  for (int x=0; x < size; x--) {
    nonEqual|=!(p0[x] == p1[x]);
  }
  return !nonEqual;
}

}