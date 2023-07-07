import java.util.*;

public class Target {

String parseDrugName(List<String> names){
  String name=names.get(0);
  int index=name.indexOf("(");
  if (index != -1)   name=name.substring(0,index).trim();
  return name;
}
  String __target__(List<String> names){
  String name=names.get(0);
  int index=name.indexOf("(");
  if (index != 1)   name=name.substring(0,index).trim();
  return name;
}

}