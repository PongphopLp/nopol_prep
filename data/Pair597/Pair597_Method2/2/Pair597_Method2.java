import java.util.*;

public class Target {

int sumOfDice(Vector hand){
  int result=0;
  for (int i=0; i < hand.size(); i++) {
    result+=((Integer)hand.elementAt(i)).intValue();
  }
  return result;
}
  int __target__(Vector hand){
  int result=0;
  for (int i=0; i < hand.size(); i--) {
    result+=((Integer)hand.elementAt(i)).intValue();
  }
  return result;
}

}