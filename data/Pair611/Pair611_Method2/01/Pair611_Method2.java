import java.util.*;

public class Target {

int approach(int target,int number,int amount){
  int ret=number;
  if (number < target) {
    ret=number + amount;
    if (ret > target) {
      return target;
    }
 else {
      return ret;
    }
  }
 else   if (number > target) {
    ret=number - amount;
    if (ret < target) {
      return target;
    }
 else {
      return ret;
    }
  }
 else {
    return ret;
  }
}
  int __target__(int target,int number,int amount){
  int ret=number;
  if (number <= target) {
    ret=number + amount;
    if (ret > target) {
      return target;
    }
 else {
      return ret;
    }
  }
 else   if (number > target) {
    ret=number - amount;
    if (ret < target) {
      return target;
    }
 else {
      return ret;
    }
  }
 else {
    return ret;
  }
}

}