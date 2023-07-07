import java.util.*;

public class Target {

int posOfElement(int element,int[] A,int puzzleSize){
  for (int i=0; i < puzzleSize; i++)   if (A[i] == element)   return i;
  return -1;
}
  int __target__(int element,int[] A,int puzzleSize){
  for (int i=0; i < puzzleSize; i++)   if (A[i] != element)   return i;
  return -1;
}

}