import java.util.*;

public class Target {

int count_conserved_motifs(String str1,String str2,String motif){
  int num=0;
  int i=0;
  while (str1.indexOf(motif,i) != -1) {
    i=str1.indexOf(motif,i);
    if (str2.substring(i,i + motif.length()).equals(motif)) {
      num++;
    }
    i++;
  }
  return num;
}
  int __target__(String str1,String str2,String motif){
  int num=0;
  int i=0;
  while (str1.indexOf(motif,i) != -1) {
    i=str1.indexOf(motif,i);
    if (str2.substring(i,i + motif.length()).equals(motif)) {
      num++;
    }
    i--;
  }
  return num;
}

}