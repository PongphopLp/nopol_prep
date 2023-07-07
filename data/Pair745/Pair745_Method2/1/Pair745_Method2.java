import java.util.*;

public class Target {

int putInBox(int dd,int box){
  if (dd < 0) {
    if (dd % box != 0) {
      return box + dd % box;
    }
 else {
      return 0;
    }
  }
 else   if (dd >= box) {
    return dd % box;
  }
 else {
    return dd;
  }
}
  int __target__(int dd,int box){
  if (dd >= 0) {
    if (dd % box != 0) {
      return box + dd % box;
    }
 else {
      return 0;
    }
  }
 else   if (dd >= box) {
    return dd % box;
  }
 else {
    return dd;
  }
}

}