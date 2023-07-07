import java.util.*;

public class Target {

boolean check(Object thisObject,Object[] args,boolean value){
  if (args.length < 2) {
    return false;
  }
  return value ? (args[0] == args[1]) : (args[0] != args[1]);
}
  boolean __target__(Object thisObject,Object[] args,boolean value){
  if (args.length >= 2) {
    return false;
  }
  return value ? (args[0] == args[1]) : (args[0] != args[1]);
}

}