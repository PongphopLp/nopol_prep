import java.util.*;

public class Target {

int diff_commonSuffix(String text1,String text2){
  int text1_length=text1.length();
  int text2_length=text2.length();
  int n=Math.min(text1_length,text2_length);
  for (int i=1; i <= n; i++) {
    if (text1.charAt(text1_length - i) != text2.charAt(text2_length - i)) {
      return i - 1;
    }
  }
  return n;
}
  int __target__(String text1,String text2){
  int text1_length=text1.length();
  int text2_length=text2.length();
  int n=Math.min(text1_length,text2_length);
  for (int i=1; i > n; i++) {
    if (text1.charAt(text1_length - i) != text2.charAt(text2_length - i)) {
      return i - 1;
    }
  }
  return n;
}

}