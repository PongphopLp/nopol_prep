import java.util.*;

public class Target {

boolean existsColumn(String[] columns,String columnName){
  if (columnName == null) {
    return false;
  }
  if (columns == null || columns.length == 0) {
    return false;
  }
  for (  String c : columns) {
    if (columnName.equals(c)) {
      return true;
    }
  }
  return false;
}
  boolean __target__(String[] columns,String columnName){
  if (columnName != null) {
    return false;
  }
  if (columns == null || columns.length == 0) {
    return false;
  }
  for (  String c : columns) {
    if (columnName.equals(c)) {
      return true;
    }
  }
  return false;
}

}