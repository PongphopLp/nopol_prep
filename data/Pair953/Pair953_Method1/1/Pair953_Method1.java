import java.util.*;

public class Target {

int max(int... xs){
  int max=xs[0];
  for (int i=1; i < xs.length; ++i)   if (xs[i] > max)   max=xs[i];
  return max;
}
  int __target__(int... xs){
  int max=xs[0];
  for (int i=1; i >= xs.length; ++i)   if (xs[i] > max)   max=xs[i];
  return max;
}

}