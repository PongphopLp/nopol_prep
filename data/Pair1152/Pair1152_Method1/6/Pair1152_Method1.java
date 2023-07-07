import java.util.*;

public class Target {

boolean estCaseCouleur(int X,int Y){
  if (X % 2 == 0) {
    if (Y % 2 == 0) {
      return false;
    }
 else {
      return true;
    }
  }
 else {
    if (Y % 2 == 0) {
      return true;
    }
 else {
      return false;
    }
  }
}
  boolean __target__(int X,int Y){
  if (X % 2 == 0) {
    if (Y % 2 == 0) {
      return false;
    }
 else {
      return true;
    }
  }
 else {
    if (Y % 2 != 0) {
      return true;
    }
 else {
      return false;
    }
  }
}

}