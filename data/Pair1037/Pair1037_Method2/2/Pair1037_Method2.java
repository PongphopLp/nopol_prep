import java.util.*;

public class Target {

String[] shrink(String[] array,int count){
  String[] retval=new String[count];
  for (int iii=0; iii < count; iii++)   retval[iii]=array[iii];
  return retval;
}
  String[] __target__(String[] array,int count){
  String[] retval=new String[count];
  for (int iii=0; iii >= count; iii++)   retval[iii]=array[iii];
  return retval;
}

}