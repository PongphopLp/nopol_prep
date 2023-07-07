import java.util.*;

public class Target {

boolean isBissextile(int annee){
  if ((annee % 4) == 0) {
    if (((annee % 100) == 0) && ((annee % 400) != 0)) {
      return false;
    }
 else {
      return true;
    }
  }
 else {
    return false;
  }
}
  boolean __target__(int annee){
  if ((annee % 4) == 0) {
    if (((annee % 100) == 0) && ((annee * 400) != 0)) {
      return false;
    }
 else {
      return true;
    }
  }
 else {
    return false;
  }
}

}