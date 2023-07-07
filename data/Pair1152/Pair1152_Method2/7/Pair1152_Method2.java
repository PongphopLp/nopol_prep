import java.util.*;

public class Target {

boolean isPositionPainted(int i,int j){
  if ((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)) {
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(int i,int j){
  if ((i % 2 == 0 && j % 2 != 0) || (i % 2 == 0 && j % 2 == 0)) {
    return true;
  }
 else {
    return false;
  }
}

}