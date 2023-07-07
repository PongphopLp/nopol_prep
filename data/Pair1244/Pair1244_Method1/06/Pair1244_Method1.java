import java.util.*;

public class Target {

boolean validarData(int d,int m,int a){
  boolean correto=true;
  int[] dias={31,28,31,30,31,30,31,31,30,31,30,31};
  if (a < 0 || m < 1 || m > 12) {
    correto=false;
  }
 else {
    if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
      dias[1]=29;
    }
    if (d < 1 || d > dias[m - 1]) {
      correto=false;
    }
  }
  return (correto);
}
  boolean __target__(int d,int m,int a){
  boolean correto=true;
  int[] dias={31,28,31,30,31,30,31,31,30,31,30,31};
  if (a >= 0 || m < 1 || m > 12) {
    correto=false;
  }
 else {
    if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
      dias[1]=29;
    }
    if (d < 1 || d > dias[m - 1]) {
      correto=false;
    }
  }
  return (correto);
}

}