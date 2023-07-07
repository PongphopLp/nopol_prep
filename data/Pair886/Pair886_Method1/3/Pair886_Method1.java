import java.util.*;

public class Target {

int findObject(List list,Object o){
  if (list instanceof ArrayList) {
    int ln=list.size();
    int i=0;
    while (i < ln) {
      if (list.get(i) == o) {
        return i;
      }
      i++;
    }
    return -1;
  }
 else {
    int i=0;
    Iterator it=list.iterator();
    while (it.hasNext()) {
      if (it.next() == o) {
        return i;
      }
      i++;
    }
    return -1;
  }
}
  int __target__(List list,Object o){
  if (list instanceof ArrayList) {
    int ln=list.size();
    int i=0;
    while (i < ln) {
      if (list.get(i) == o) {
        return i;
      }
      i++;
    }
    return -1;
  }
 else {
    int i=0;
    Iterator it=list.iterator();
    while (it.hasNext()) {
      if (it.next() != o) {
        return i;
      }
      i++;
    }
    return -1;
  }
}

}