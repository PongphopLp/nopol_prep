import java.util.*;

public class Target {

int max(int a1,int a2,int a3){
  if (a1 >= a2 && a1 >= a3) {
    return a1;
  }
 else   if (a2 >= a1 && a2 >= a3) {
    return a2;
  }
 else   return a3;
}
  int __target__(int a1,int a2,int a3){
  if (a1 >= a2 && a1 >= a3) {
    return a1;
  }
 else   if (a2 >= a1 && a2 > a3) {
    return a2;
  }
 else   return a3;
}

}