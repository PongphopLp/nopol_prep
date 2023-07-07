import java.util.*;

public class Target {

String getParm(Map<String,String[]> parms,String parm_name){
  String value;
  String[] id_array=(String[])parms.get(parm_name);
  if (id_array != null && id_array.length > 0) {
    value=id_array[0];
  }
 else {
    value=null;
  }
  return value;
}
  String __target__(Map<String,String[]> parms,String parm_name){
  String value;
  String[] id_array=(String[])parms.get(parm_name);
  if (id_array != null && id_array.length <= 0) {
    value=id_array[0];
  }
 else {
    value=null;
  }
  return value;
}

}