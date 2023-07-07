import java.util.*;

public class Target {

int a(int k,int j,int m,int l){
  if (k < 20) {
    return (j & m) | ((~j) & l);
  }
  ;
  if (k < 40) {
    return j ^ m ^ l;
  }
  ;
  if (k < 60) {
    return (j & m) | (j & l) | (m & l);
  }
  ;
  return j ^ m ^ l;
}
  int __target__(int k,int j,int m,int l){
  if (k < 20) {
    return (j & m) | ((~j) & l);
  }
  ;
  if (k < 40) {
    return j & m & l;
  }
  ;
  if (k < 60) {
    return (j & m) | (j & l) | (m & l);
  }
  ;
  return j ^ m ^ l;
}

}