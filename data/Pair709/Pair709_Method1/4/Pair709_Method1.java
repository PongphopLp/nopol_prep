import java.util.*;

public class Target {

int modulo(int D,int d){
  int R=0;
  int C=D / d;
  if (D < 0)   R=D + (1 - C) * d;
 else   R=D - C * d;
  return R;
}
  int __target__(int D,int d){
  int R=0;
  int C=D / d;
  if (D < 0)   R=D + (1 - C) / d;
 else   R=D - C * d;
  return R;
}

}