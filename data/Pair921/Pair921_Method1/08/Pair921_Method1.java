import java.util.*;

public class Target {

int binarySearch(int[] array,int length,int value){
  int lowIndex=0;
  int highIndex=length - 1;
  while (lowIndex <= highIndex) {
    int midIndex=(lowIndex + highIndex) >>> 1;
    int midValue=array[midIndex];
    if (midValue > value) {
      highIndex=midIndex - 1;
    }
 else     if (midValue < value) {
      lowIndex=midIndex + 1;
    }
 else {
      return midIndex;
    }
  }
  return -lowIndex - 1;
}
  int __target__(int[] array,int length,int value){
  int lowIndex=0;
  int highIndex=length - 1;
  while (lowIndex <= highIndex) {
    int midIndex=(lowIndex + highIndex) >>> 1;
    int midValue=array[midIndex];
    if (midValue >= value) {
      highIndex=midIndex - 1;
    }
 else     if (midValue < value) {
      lowIndex=midIndex + 1;
    }
 else {
      return midIndex;
    }
  }
  return -lowIndex - 1;
}

}