import java.util.*;

public class Target {

int sumDifferences(int[] differences,int start,int toTake){
  int sum=0;
  for (int i=0; i < toTake; i++) {
    sum+=differences[start + i];
  }
  return sum;
}
  int __target__(int[] differences,int start,int toTake){
  int sum=0;
  for (int i=0; i >= toTake; i++) {
    sum+=differences[start + i];
  }
  return sum;
}

}