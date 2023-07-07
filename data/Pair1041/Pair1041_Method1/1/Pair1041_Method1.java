import java.util.*;

public class Target {

String[] lastElements(String[] args,int offset){
  if (offset >= args.length) {
    return new String[]{};
  }
  String[] ret=new String[args.length - offset];
  System.arraycopy(args,offset,ret,0,ret.length);
  return ret;
}
  String[] __target__(String[] args,int offset){
  if (offset < args.length) {
    return new String[]{};
  }
  String[] ret=new String[args.length - offset];
  System.arraycopy(args,offset,ret,0,ret.length);
  return ret;
}

}