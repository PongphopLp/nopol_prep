import java.util.*;

public class Target {

char i2h(int i){
  if (i >= 0 && i <= 9)   return (char)(i + 48);
  if (i >= 10 && i <= 15)   return (char)(i + 55);
  return 0;
}
  char __target__(int i){
  if (i >= 0 && i <= 9)   return (char)(i + 48);
  if (i >= 10 && i > 15)   return (char)(i + 55);
  return 0;
}

}