import java.util.*;

public class Target {

int compare(Object arg0,Object arg1){
  String aName=(String)arg0;
  String bName=(String)arg1;
  if ((aName == null) && (bName == null)) {
    return 0;
  }
  if ((aName != null) && (bName == null)) {
    return 1;
  }
  if ((aName == null) && (bName != null)) {
    return -1;
  }
  return aName.compareTo(bName);
}
  int __target__(Object arg0,Object arg1){
  String aName=(String)arg0;
  String bName=(String)arg1;
  if ((aName == null) && (bName == null)) {
    return 0;
  }
  if ((aName != null) && (bName != null)) {
    return 1;
  }
  if ((aName == null) && (bName != null)) {
    return -1;
  }
  return aName.compareTo(bName);
}

}