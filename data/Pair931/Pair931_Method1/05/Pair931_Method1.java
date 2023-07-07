import java.util.*;

public class Target {

int[] quicksort_rectangles(int end,int[] r_size){
  int[] size=new int[end];
  int[] ids=new int[end];
  for (int ii=0; ii < end; ii++) {
    ids[ii]=ii;
    size[ii]=r_size[ii];
  }
  int i, j, k, start=0;
  int temp, id_temp;
  for (i=start + 1; i < end; i++) {
    temp=size[i];
    id_temp=ids[i];
    k=start;
    for (j=i - 1; j >= start; j--)     if (temp < size[j]) {
      size[j + 1]=size[j];
      ids[j + 1]=ids[j];
    }
 else {
      k=j + 1;
      break;
    }
    size[k]=temp;
    ids[k]=id_temp;
  }
  return ids;
}
  int[] __target__(int end,int[] r_size){
  int[] size=new int[end];
  int[] ids=new int[end];
  for (int ii=0; ii < end; ii++) {
    ids[ii]=ii;
    size[ii]=r_size[ii];
  }
  int i, j, k, start=0;
  int temp, id_temp;
  for (i=start - 1; i < end; i++) {
    temp=size[i];
    id_temp=ids[i];
    k=start;
    for (j=i - 1; j >= start; j--)     if (temp < size[j]) {
      size[j + 1]=size[j];
      ids[j + 1]=ids[j];
    }
 else {
      k=j + 1;
      break;
    }
    size[k]=temp;
    ids[k]=id_temp;
  }
  return ids;
}

}