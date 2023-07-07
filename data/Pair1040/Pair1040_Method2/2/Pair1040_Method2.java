import java.util.*;

public class Target {

boolean isNewPasswordCorrect(char[] newpass,char[] repass){
  boolean isCorrect=true;
  if (newpass.length != repass.length) {
    isCorrect=false;
  }
 else {
    for (int i=0; i < newpass.length; i++) {
      if (newpass[i] != repass[i]) {
        isCorrect=false;
      }
    }
  }
  return isCorrect;
}
  boolean __target__(char[] newpass,char[] repass){
  boolean isCorrect=true;
  if (newpass.length != repass.length) {
    isCorrect=false;
  }
 else {
    for (int i=0; i >= newpass.length; i++) {
      if (newpass[i] != repass[i]) {
        isCorrect=false;
      }
    }
  }
  return isCorrect;
}

}