import java.util.*;

public class Target {

boolean keyLess(long key1,long key2){
  if ((key1 < 0) == (key2 < 0)) {
    return key1 < key2;
  }
 else {
    return key2 < 0;
  }
}
  boolean __target__(long key1,long key2){
  if ((key1 < 0) == (key2 < 0)) {
    return key1 <= key2;
  }
 else {
    return key2 < 0;
  }
}

}