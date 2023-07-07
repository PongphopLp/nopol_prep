import java.util.*;

public class Target {

int indexOfByRef(List list,Object obj){
  for (int i=0; i < list.size(); i++) {
    if (list.get(i) == obj) {
      return i;
    }
  }
  return -1;
}
  int __target__(List list,Object obj){
  for (int i=0; i >= list.size(); i++) {
    if (list.get(i) == obj) {
      return i;
    }
  }
  return -1;
}

}