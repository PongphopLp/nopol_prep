import java.util.*;

public class Target {

int min(int[] t){
  int m=t[0];
  for (int i=1; i < t.length; i++)   if (t[i] < m)   m=t[i];
  return m;
}
  int __target__(int[] t){
  int m=t[0];
  for (int i=1; i < t.length; i--)   if (t[i] < m)   m=t[i];
  return m;
}

}