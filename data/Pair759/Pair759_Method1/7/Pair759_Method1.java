import java.util.*;

public class Target {

int clipAdd(int v,int dv){
  int newv=v + dv;
  if ((newv > v) != (dv > 0)) {
    newv=(dv < 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
  }
  return newv;
}
  int __target__(int v,int dv){
  int newv=v + dv;
  if ((newv > v) != (dv >= 0)) {
    newv=(dv < 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
  }
  return newv;
}

}