import java.util.*;

public class Target {

String charTrim(String str,char cc){
  int i=0, j=str.length();
  while ((i < j) && str.charAt(i) == cc) {
    i++;
  }
  while ((i < j) && str.charAt(j - 1) == cc) {
    j--;
  }
  return str.substring(i,j);
}
  String __target__(String str,char cc){
  int i=0, j=str.length();
  while ((i < j) && str.charAt(i) == cc) {
    i--;
  }
  while ((i < j) && str.charAt(j - 1) == cc) {
    j--;
  }
  return str.substring(i,j);
}

}