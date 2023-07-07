import java.util.*;

public class Target {

int min(int i,int j,int k){
  if (i < j) {
    return (i < k) ? i : k;
  }
 else {
    return (j < k) ? j : k;
  }
}
  int __target__(int i,int j,int k){
  if (i < j) {
    return (i >= k) ? i : k;
  }
 else {
    return (j < k) ? j : k;
  }
}

}