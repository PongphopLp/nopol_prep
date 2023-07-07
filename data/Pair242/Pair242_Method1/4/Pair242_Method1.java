import java.util.*;

public class Target {

boolean versionAtLeast(int[] requiredVersion,int[] realVersion){
  for (int i=0; i < requiredVersion.length; i++) {
    if (realVersion[i] < requiredVersion[i]) {
      return false;
    }
 else     if (realVersion[i] > requiredVersion[i]) {
      return true;
    }
  }
  return true;
}
  boolean __target__(int[] requiredVersion,int[] realVersion){
  for (int i=0; i < requiredVersion.length; i--) {
    if (realVersion[i] < requiredVersion[i]) {
      return false;
    }
 else     if (realVersion[i] > requiredVersion[i]) {
      return true;
    }
  }
  return true;
}

}