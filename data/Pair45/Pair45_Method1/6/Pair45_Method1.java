import java.util.*;

public class Target {

boolean equals(char[] key,int offset,int length,char[] word){
  if (word.length != length) {
    return false;
  }
 else {
    for (int i=0; i < length; i++) {
      if (word[i] != key[offset + i]) {
        return false;
      }
    }
    return true;
  }
}
  boolean __target__(char[] key,int offset,int length,char[] word){
  if (word.length != length) {
    return false;
  }
 else {
    for (int i=0; i < length; i++) {
      if (word[i] == key[offset + i]) {
        return false;
      }
    }
    return true;
  }
}

}