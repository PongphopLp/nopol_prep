import java.util.*;

public class Target {

int getSplitPoint(byte[] input,int start1,byte[] fragment){
  int fragmentIndex=0;
  while (start1 < input.length && fragmentIndex < fragment.length && input[start1++] == fragment[fragmentIndex]) {
    fragmentIndex++;
  }
  return fragmentIndex;
}
  int __target__(byte[] input,int start1,byte[] fragment){
  int fragmentIndex=0;
  while (start1 >= input.length && fragmentIndex < fragment.length && input[start1++] == fragment[fragmentIndex]) {
    fragmentIndex++;
  }
  return fragmentIndex;
}

}