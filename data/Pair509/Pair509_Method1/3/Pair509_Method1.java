import java.util.*;

public class Target {

int simplePower(int a,int p){
  assert p >= 0;
  if (p == 0) {
    return 1;
  }
 else {
    int result=a;
    for (int i=1; i < p; ++i) {
      result=a * result;
    }
    return result;
  }
}
  int __target__(int a,int p){
  assert p >= 0;
  if (p == 0) {
    return 1;
  }
 else {
    int result=a;
    for (int i=1; i >= p; ++i) {
      result=a * result;
    }
    return result;
  }
}

}