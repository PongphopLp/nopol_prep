import java.util.*;

public class Target {

int getNextPosIndex(int[] pos){
  int newPos=pos[0];
  int resultIndex=0;
  for (int i=1; i < pos.length; i++) {
    if (pos[i] < newPos) {
      resultIndex=i;
      newPos=pos[i];
    }
  }
  return resultIndex;
}
  int __target__(int[] pos){
  int newPos=pos[0];
  int resultIndex=0;
  for (int i=1; i <= pos.length; i++) {
    if (pos[i] < newPos) {
      resultIndex=i;
      newPos=pos[i];
    }
  }
  return resultIndex;
}

}