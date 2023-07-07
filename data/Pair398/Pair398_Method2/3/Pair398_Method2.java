import java.util.*;

public class Target {

char upperCaseToLowerCase(char ch){
  if (ch >= 65 && ch <= 90) {
    ch=(char)(ch + 32);
  }
  return ch;
}
  char __target__(char ch){
  if (ch < 65 && ch <= 90) {
    ch=(char)(ch + 32);
  }
  return ch;
}

}