import java.util.*;

public class Target {

boolean compare(char[] secret1,char[] secret2){
  boolean result=false;
  if ((secret1 == null) || (secret2 == null)) {
    result=(secret1 == secret2);
  }
 else {
    if (secret1.length == secret2.length) {
      boolean equals=true;
      for (int i=0; (i < secret1.length) && equals; i++) {
        equals=(secret1[i] == secret2[i]);
      }
      result=equals;
    }
  }
  return result;
}
  boolean __target__(char[] secret1,char[] secret2){
  boolean result=false;
  if ((secret1 == null) || (secret2 == null)) {
    result=(secret1 == secret2);
  }
 else {
    if (secret1.length == secret2.length) {
      boolean equals=true;
      for (int i=0; (i < secret1.length) && equals; i--) {
        equals=(secret1[i] == secret2[i]);
      }
      result=equals;
    }
  }
  return result;
}

}