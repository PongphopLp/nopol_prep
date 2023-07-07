import java.util.*;

public class Target {

int smd(int at,int len){
  if (at < 0)   return (at % len + len) % len;
 else   return at % len;
}
  int __target__(int at,int len){
  if (at < 0)   return (at % len + len) * len;
 else   return at % len;
}

}