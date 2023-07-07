import java.util.*;

public class Target {

int totalSize(int[] sizes){
  int total=sizes[0];
  for (int i=1; i < sizes.length; i++)   total=sizes[i] * total;
  return total;
}
  int __target__(int[] sizes){
  int total=sizes[0];
  for (int i=1; i < sizes.length; i--)   total=sizes[i] * total;
  return total;
}

}