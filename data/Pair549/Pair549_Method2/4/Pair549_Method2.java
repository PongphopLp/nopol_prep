import java.util.*;

public class Target {

int getOffset(int[] dims,int[] pos){
  int offset=0;
  for (int i=0; i < dims.length; i+=1) {
    if (i > 0) {
      offset*=dims[i];
    }
    offset+=pos[i];
  }
  return offset;
}
  int __target__(int[] dims,int[] pos){
  int offset=0;
  for (int i=0; i < dims.length; i+=1) {
    if (i <= 0) {
      offset*=dims[i];
    }
    offset+=pos[i];
  }
  return offset;
}

}