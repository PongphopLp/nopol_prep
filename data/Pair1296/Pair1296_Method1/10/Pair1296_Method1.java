import java.util.*;

public class Target {

int decode(String s){
  int value=0;
  char[] src=s.toCharArray();
  for (int i=0; i < src.length; i++) {
    value*=16;
    if ((src[i] >= '0') && (src[i] <= '9'))     value+=(src[i] - '0');
 else     if ((src[i] >= 'A') && (src[i] <= 'F'))     value+=(src[i] - 'A' + 10);
 else     if ((src[i] >= 'a') && (src[i] <= 'f'))     value+=(src[i] - 'a' + 10);
 else {
      value/=16;
      break;
    }
  }
  return value;
}
  int __target__(String s){
  int value=0;
  char[] src=s.toCharArray();
  for (int i=0; i < src.length; i++) {
    value*=16;
    if ((src[i] > '0') && (src[i] <= '9'))     value+=(src[i] - '0');
 else     if ((src[i] >= 'A') && (src[i] <= 'F'))     value+=(src[i] - 'A' + 10);
 else     if ((src[i] >= 'a') && (src[i] <= 'f'))     value+=(src[i] - 'a' + 10);
 else {
      value/=16;
      break;
    }
  }
  return value;
}

}