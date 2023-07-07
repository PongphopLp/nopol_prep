import java.util.*;

public class Target {

int matchStrings(String a,String b){
  int i;
  char[] ca=a.toCharArray();
  char[] cb=b.toCharArray();
  int len=(ca.length < cb.length) ? ca.length : cb.length;
  for (i=0; i < len; i++)   if (ca[i] != cb[i])   break;
  return i;
}
  int __target__(String a,String b){
  int i;
  char[] ca=a.toCharArray();
  char[] cb=b.toCharArray();
  int len=(ca.length >= cb.length) ? ca.length : cb.length;
  for (i=0; i < len; i++)   if (ca[i] != cb[i])   break;
  return i;
}

}