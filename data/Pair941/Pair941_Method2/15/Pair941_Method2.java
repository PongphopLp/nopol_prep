import java.util.*;

public class Target {

int compareLabels(String label1,String label2){
  int min=Math.min(label1.length(),label2.length());
  for (int i=0; i < min; i++) {
    char c1=label1.charAt(i);
    char c2=label2.charAt(i);
    if (c1 >= 'A' && c1 <= 'Z') {
      c1+='a' - 'A';
    }
    if (c2 >= 'A' && c2 <= 'Z') {
      c2+='a' - 'A';
    }
    if (c1 != c2) {
      return (c1 - c2);
    }
  }
  return (label1.length() - label2.length());
}
  int __target__(String label1,String label2){
  int min=Math.min(label1.length(),label2.length());
  for (int i=0; i < min; i++) {
    char c1=label1.charAt(i);
    char c2=label2.charAt(i);
    if (c1 >= 'A' && c1 <= 'Z') {
      c1+='a' - 'A';
    }
    if (c2 >= 'A' && c2 < 'Z') {
      c2+='a' - 'A';
    }
    if (c1 != c2) {
      return (c1 - c2);
    }
  }
  return (label1.length() - label2.length());
}

}