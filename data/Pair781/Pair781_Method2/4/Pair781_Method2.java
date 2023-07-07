import java.util.*;

public class Target {

int mod(int a,int b){
  int res=a % b;
  if (res < 0 && b > 0) {
    res+=b;
  }
  return res;
}
  int __target__(int a,int b){
  int res=a % b;
  if (res < 0 && b <= 0) {
    res+=b;
  }
  return res;
}

}