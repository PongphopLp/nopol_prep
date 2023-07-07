import java.util.*;

public class Target {

int reverse(int heading){
  if ((heading >= 0) && (heading <= 5))   return ((9 + heading) % 6);
  return 6;
}
  int __target__(int heading){
  if ((heading >= 0) && (heading <= 5))   return ((9 + heading) % 6);
  return 0;
}

}