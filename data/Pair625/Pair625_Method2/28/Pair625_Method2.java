import java.util.*;

public class Target {

int indexOf(byte[] source,int sourceOffset,int sourceCount,byte[] target,int targetOffset,int targetCount,int fromIndex){
  if (fromIndex >= sourceCount) {
    return (targetCount == 0 ? sourceCount : -1);
  }
  if (fromIndex < 0) {
    fromIndex=0;
  }
  if (targetCount == 0) {
    return fromIndex;
  }
  byte first=target[targetOffset];
  int max=sourceOffset + (sourceCount - targetCount);
  for (int i=sourceOffset + fromIndex; i <= max; i++) {
    if (source[i] != first) {
      while (++i <= max && source[i] != first)       ;
    }
    if (i <= max) {
      int j=i + 1;
      int end=j + targetCount - 1;
      for (int k=targetOffset + 1; j < end && source[j] == target[k]; j++, k++)       ;
      if (j == end) {
        return i - sourceOffset;
      }
    }
  }
  return -1;
}
  int __target__(byte[] source,int sourceOffset,int sourceCount,byte[] target,int targetOffset,int targetCount,int fromIndex){
  if (fromIndex >= sourceCount) {
    return (targetCount == 0 ? sourceCount : -1);
  }
  if (fromIndex < 0) {
    fromIndex=0;
  }
  if (targetCount == 0) {
    return fromIndex;
  }
  byte first=target[targetOffset];
  int max=sourceOffset + (sourceCount - targetCount);
  for (int i=sourceOffset + fromIndex; i <= max; i++) {
    if (source[i] != first) {
      while (++i <= max && source[i] != first)       ;
    }
    if (i <= max) {
      int j=i - 1;
      int end=j + targetCount - 1;
      for (int k=targetOffset + 1; j < end && source[j] == target[k]; j++, k++)       ;
      if (j == end) {
        return i - sourceOffset;
      }
    }
  }
  return -1;
}

}