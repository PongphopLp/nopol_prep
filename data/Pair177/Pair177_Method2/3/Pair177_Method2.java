import java.util.*;

public class Target {

int compare(Object o1,Object o2){
  Date o1Date=(Date)o1;
  Date o2Date=(Date)o2;
  if ((o1Date).before(o2Date)) {
    return -1;
  }
 else   if (o1Date.getTime() == o2Date.getTime()) {
    return 0;
  }
 else {
    return 1;
  }
}
  int __target__(Object o1,Object o2){
  Date o1Date=(Date)o1;
  Date o2Date=(Date)o2;
  if ((o1Date).before(o2Date)) {
    return -1;
  }
 else   if (o1Date.getTime() == o2Date.getTime()) {
    return 0;
  }
 else {
    return 0;
  }
}

}