import java.util.*;

public class Target {

Object getArg(Object[] args,int index){
  if (args != null && index < args.length) {
    return args[index];
  }
  return null;
}
  Object __target__(Object[] args,int index){
  if (args == null && index < args.length) {
    return args[index];
  }
  return null;
}

}