import java.util.*;

public class Target {

int countConservedMotifs(String seq1,String seq2,String motif){
  int count=0;
  int ii=-1;
  while (seq1.indexOf(motif,ii) != -1) {
    ii=seq1.indexOf(motif,ii);
    if (seq2.substring(ii,ii + motif.length()).equals(motif)) {
      count++;
    }
    ii++;
  }
  return count;
}
  int __target__(String seq1,String seq2,String motif){
  int count=0;
  int ii=1;
  while (seq1.indexOf(motif,ii) != -1) {
    ii=seq1.indexOf(motif,ii);
    if (seq2.substring(ii,ii + motif.length()).equals(motif)) {
      count++;
    }
    ii++;
  }
  return count;
}

}