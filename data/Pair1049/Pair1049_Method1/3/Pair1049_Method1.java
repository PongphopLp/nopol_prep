import java.util.*;

public class Target {

int najmanji(int[] polje){
  int min=polje[0];
  for (int i=1; i < polje.length; i++) {
    if (polje[i] < min)     min=polje[i];
  }
  return min;
}
  int __target__(int[] polje){
  int min=polje[0];
  for (int i=1; i < polje.length; i--) {
    if (polje[i] < min)     min=polje[i];
  }
  return min;
}

}