import java.util.*;

public class Target {

boolean equalsPasswords(char[] password1,char[] password2){
  if (password1.length != password2.length) {
    return false;
  }
 else {
    for (int i=0; i < password1.length; i++) {
      if (password1[i] != password2[i])       return false;
    }
  }
  return true;
}
  boolean __target__(char[] password1,char[] password2){
  if (password1.length != password2.length) {
    return false;
  }
 else {
    for (int i=0; i >= password1.length; i++) {
      if (password1[i] != password2[i])       return false;
    }
  }
  return true;
}

}