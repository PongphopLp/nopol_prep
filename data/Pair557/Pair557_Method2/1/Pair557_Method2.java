import java.util.*;

public class Target {

int compare(int[] oneArray,int[] anotherArray){
  if (oneArray.length != anotherArray.length) {
    return oneArray.length - anotherArray.length;
  }
  for (int index=0; index < oneArray.length; index++) {
    if (oneArray[index] != anotherArray[index]) {
      return oneArray[index] - anotherArray[index];
    }
  }
  return 0;
}
  int __target__(int[] oneArray,int[] anotherArray){
  if (oneArray.length != anotherArray.length) {
    return oneArray.length - anotherArray.length;
  }
  for (int index=0; index <= oneArray.length; index++) {
    if (oneArray[index] != anotherArray[index]) {
      return oneArray[index] - anotherArray[index];
    }
  }
  return 0;
}

}