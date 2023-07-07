import java.util.*;

public class Target {

int nextMatchingByte(char lookFor,char[] buf,int startAt,int limit){
  searching:   for (; startAt < limit; startAt++) {
    if (buf[startAt] == lookFor)     return startAt;
  }
  return -1;
}
  int __target__(char lookFor,char[] buf,int startAt,int limit){
  searching:   for (; startAt <= limit; startAt++) {
    if (buf[startAt] == lookFor)     return startAt;
  }
  return -1;
}

}