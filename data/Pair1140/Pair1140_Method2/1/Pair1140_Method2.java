import java.util.*;

public class Target {

boolean isCellEditable(int row,int column){
  if (column == 0) {
    return true;
  }
 else   if (column == 1) {
    return true;
  }
 else   if (column == 2) {
    return true;
  }
 else {
    return false;
  }
}
  boolean __target__(int row,int column){
  if (column != 0) {
    return true;
  }
 else   if (column == 1) {
    return true;
  }
 else   if (column == 2) {
    return true;
  }
 else {
    return false;
  }
}

}