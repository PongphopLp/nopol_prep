import java.util.*;

public class Target {

boolean comparePassword(byte[] text,byte[] password){
  if (text.length != password.length)   return false;
  for (int i=0; i < text.length && i < password.length; i++) {
    if (text[i] != password[i])     return false;
  }
  return true;
}
  boolean __target__(byte[] text,byte[] password){
  if (text.length != password.length)   return false;
  for (int i=0; i < text.length && i < password.length; i--) {
    if (text[i] != password[i])     return false;
  }
  return true;
}

}