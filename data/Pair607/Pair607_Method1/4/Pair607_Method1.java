import java.util.*;

public class Target {

int max(int a,int b,int c){
  int ma;
  ma=a;
  if (b > ma) {
    ma=b;
  }
  if (c > ma) {
    ma=c;
  }
  return ma;
}
  int __target__(int a,int b,int c){
  int ma;
  ma=a;
  if (b > ma) {
    ma=b;
  }
  if (c >= ma) {
    ma=c;
  }
  return ma;
}

}