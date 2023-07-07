import java.util.*;

public class Target {

int minimum(int a,int b,int c){
  int mi;
  mi=a;
  if (b < mi)   mi=b;
  if (c < mi)   mi=c;
  return mi;
}
  int __target__(int a,int b,int c){
  int mi;
  mi=a;
  if (b < mi)   mi=b;
  if (c <= mi)   mi=c;
  return mi;
}

}