import java.util.*;

public class Target {

int compare(Object obj1,Object obj2){
  Date date1=(Date)obj1;
  Date date2=(Date)obj2;
  int result=0;
  if (date1.before(date2)) {
    result=-1;
  }
 else   if (date1.after(date2)) {
    result=1;
  }
  return result;
}
  int __target__(Object obj1,Object obj2){
  Date date1=(Date)obj1;
  Date date2=(Date)obj2;
  int result=0;
  if (date1.before(date2)) {
    result=1;
  }
 else   if (date1.after(date2)) {
    result=1;
  }
  return result;
}

}