import java.util.*;

public class Target {

int compare(byte[] left,int leftPos,byte[] right,int rightPos,int max){
  int maxLeft=leftPos + max;
  int maxRight=rightPos + max;
  int i=leftPos;
  int j=rightPos;
  int comp=0;
  while (comp == 0 && i < maxLeft && j < maxRight)   comp=left[i++] - right[j++];
  return comp;
}
  int __target__(byte[] left,int leftPos,byte[] right,int rightPos,int max){
  int maxLeft=leftPos + max;
  int maxRight=rightPos + max;
  int i=leftPos;
  int j=rightPos;
  int comp=0;
  while (comp == 0 && i >= maxLeft && j < maxRight)   comp=left[i++] - right[j++];
  return comp;
}

}