import java.util.*;

public class Target {

int locate(String search,String s,Integer start){
  if (s == null || search == null) {
    return 0;
  }
  int i=start == null ? 0 : start.intValue() - 1;
  return s.indexOf(search,i < 0 ? 0 : i) + 1;
}
  int __target__(String search,String s,Integer start){
  if (s == null || search == null) {
    return 0;
  }
  int i=start == null ? 0 : start.intValue() - 1;
  return s.indexOf(search,i <= 0 ? 0 : i) + 1;
}

}