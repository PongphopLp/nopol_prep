import java.util.*;

public class Target {

int strlen(byte[] s,int from){
  int p=from;
  while (p < s.length && s[p] != 0)   p++;
  return (p - from);
}
  int __target__(byte[] s,int from){
  int p=from;
  while (p < s.length && s[p] != 0)   p--;
  return (p - from);
}

}