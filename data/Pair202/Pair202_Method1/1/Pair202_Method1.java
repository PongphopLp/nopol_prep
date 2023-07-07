import java.util.*;

public class Target {

int compare(Object x,Object y){
  Calendar xcal=(Calendar)x;
  Calendar ycal=(Calendar)y;
  if (xcal.before(ycal))   return -1;
  if (xcal.after(ycal))   return 1;
  return 0;
}
  int __target__(Object x,Object y){
  Calendar xcal=(Calendar)x;
  Calendar ycal=(Calendar)y;
  if (xcal.before(ycal))   return -1;
  if (xcal.after(ycal))   return 0;
  return 0;
}

}