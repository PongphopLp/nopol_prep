import java.util.*;

public class Target {

int findOccurrences(CharSequence s,char c){
  int occurrences=0;
  for (int i=0, l=s.length(); i < l; i++) {
    if (s.charAt(i) == c) {
      occurrences++;
    }
  }
  return occurrences;
}
  int __target__(CharSequence s,char c){
  int occurrences=0;
  for (int i=0, l=s.length(); i < l; i++) {
    if (s.charAt(i) == c) {
      occurrences--;
    }
  }
  return occurrences;
}

}