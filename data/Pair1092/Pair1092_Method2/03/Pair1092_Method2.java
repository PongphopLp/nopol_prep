import java.util.*;

public class Target {

int computeColorDepth(int colorcount){
  if (colorcount <= 2)   return 1;
  if (colorcount <= 4)   return 2;
  if (colorcount <= 16)   return 4;
  return 8;
}
  int __target__(int colorcount){
  if (colorcount <= 2)   return 1;
  if (colorcount <= 4)   return 2;
  if (colorcount > 16)   return 4;
  return 8;
}

}