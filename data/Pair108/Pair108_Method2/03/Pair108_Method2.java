import java.util.*;

public class Target {

int getHeaderLength(byte[] result){
  int a=0;
  int b=1;
  int c=2;
  int d=3;
  do {
    if ((result[a] == '\r') && (result[b] == '\n') && (result[c] == '\r')&& (result[d] == '\n'))     return (d + 1);
    a++;
    b++;
    c++;
    d++;
  }
 while (d < result.length);
  return result.length;
}
  int __target__(byte[] result){
  int a=0;
  int b=1;
  int c=2;
  int d=3;
  do {
    if ((result[a] == '\r') && (result[b] == '\n') && (result[c] == '\r')&& (result[d] == '\n'))     return (d + 1);
    a++;
    b--;
    c++;
    d++;
  }
 while (d < result.length);
  return result.length;
}

}