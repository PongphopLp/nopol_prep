import java.util.*;

public class Target {

int choose(int set,int combinations){
  int[] row=new int[set + 1];
  row[0]=1;
  for (int i=0; i < set; ++i) {
    row[i + 1]=1;
    for (int j=i; j > 0; --j) {
      row[j]+=row[j - 1];
    }
  }
  return row[combinations];
}
  int __target__(int set,int combinations){
  int[] row=new int[set + 1];
  row[0]=1;
  for (int i=0; i < set; ++i) {
    row[i + 1]=1;
    for (int j=i; j > 0; --j) {
      row[j]+=row[j + 1];
    }
  }
  return row[combinations];
}

}