import java.util.*;

public class Target {

int max(int[] s){
  int mx=s[0];
  for (int k=1; k < s.length; ++k) {
    if (mx < s[k]) {
      mx=s[k];
    }
  }
  return mx;
}
  int __target__(int[] s){
  int mx=s[0];
  for (int k=1; k < s.length; ++k) {
    if (mx >= s[k]) {
      mx=s[k];
    }
  }
  return mx;
}

}