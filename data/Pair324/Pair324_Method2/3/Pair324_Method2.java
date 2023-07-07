import java.util.*;

public class Target {

List method2(List param1,List param2){
  if (param1 != null) {
    if (param2 != null) {
      param1.addAll(param2);
      return param1;
    }
 else {
      return param1;
    }
  }
 else {
    return param2;
  }
}
  List __target__(List param1,List param2){
  if (param1 != null) {
    if (param2 != null) {
      return param1;
    }
 else {
      return param1;
    }
  }
 else {
    return param2;
  }
}

}