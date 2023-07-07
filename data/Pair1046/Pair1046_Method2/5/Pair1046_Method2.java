import java.util.*;

public class Target {

String[] subArgs(String[] args,int pos){
  String result[]=new String[args.length - pos];
  for (int i=pos; i < args.length; i++)   result[i - pos]=args[i];
  return result;
}
  String[] __target__(String[] args,int pos){
  String result[]=new String[args.length - pos];
  for (int i=pos; i < args.length; i--)   result[i - pos]=args[i];
  return result;
}

}