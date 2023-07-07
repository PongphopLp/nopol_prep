import java.util.*;

public class Target {

boolean isCellEditable(int row,int col){
  if ((col == 0) || (col == 1) || (col == 2)) {
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(int row,int col){
  if ((col == 0) || (col == 1) || (col != 2)) {
    return true;
  }
 else {
    return false;
  }
}

}