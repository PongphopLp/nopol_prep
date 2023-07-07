import java.util.*;

public class Target {

Object getValueAt(int row,int col){
  if (col == 0) {
    if (row == 0)     return "Voiced";
 else     if (row == 1)     return "Unvoiced";
 else     if (row == 2)     return "Track";
  }
  return new Integer(0);
}
  Object __target__(int row,int col){
  if (col == 0) {
    if (row == 0)     return "Voiced";
 else     if (row != 1)     return "Unvoiced";
 else     if (row == 2)     return "Track";
  }
  return new Integer(0);
}

}