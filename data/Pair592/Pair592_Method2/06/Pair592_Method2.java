import java.util.*;

public class Target {

int asr(int a,int n){
  if (n >= 16)   return (a < 0 ? -1 : 0);
  if (n <= -16)   return 0;
  if (n < 0)   return (a << -n);
  return (a >> n);
}
  int __target__(int a,int n){
  if (n >= 16)   return (a < 0 ? -1 : 0);
  if (n <= -16)   return 0;
  if (n < 0)   return (a << -n);
  return (a << n);
}

}