import java.util.*;

public class Target {

int min(int i1,int i2,int i3){
  if ((i1 < i2) && (i1 < i3))   return i1;
  return i2 < i3 ? i2 : i3;
}
  int __target__(int i1,int i2,int i3){
  if ((i1 < i2) && (i1 < i3))   return i1;
  return i2 <= i3 ? i2 : i3;
}

}