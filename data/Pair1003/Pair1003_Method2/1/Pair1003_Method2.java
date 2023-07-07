import java.util.*;

public class Target {

int max(int[] _d){
  int max=_d[0];
  for (int i=1; i < _d.length; i++) {
    if (_d[i] > max)     max=_d[i];
  }
  return max;
}
  int __target__(int[] _d){
  int max=_d[0];
  for (int i=1; i >= _d.length; i++) {
    if (_d[i] > max)     max=_d[i];
  }
  return max;
}

}