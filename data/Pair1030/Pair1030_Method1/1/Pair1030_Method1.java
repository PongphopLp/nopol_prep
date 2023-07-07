import java.util.*;

public class Target {

boolean passwordsMatch(char[] password,char[] verifyPassword){
  if (password.length != verifyPassword.length) {
    return false;
  }
  for (int i=0; i < password.length; i++) {
    if (password[i] != verifyPassword[i]) {
      return false;
    }
  }
  return true;
}
  boolean __target__(char[] password,char[] verifyPassword){
  if (password.length != verifyPassword.length) {
    return false;
  }
  for (int i=0; i < password.length; i--) {
    if (password[i] != verifyPassword[i]) {
      return false;
    }
  }
  return true;
}

}