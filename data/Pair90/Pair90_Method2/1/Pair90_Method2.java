import java.util.*;

public class Target {

String toString(List stringList){
  String string="";
  for (Iterator i=stringList.iterator(); i.hasNext(); ) {
    String line=(String)i.next();
    string+=line + "\n";
  }
  return string;
}
  String __target__(List stringList){
  String string="";
  for (Iterator i=stringList.iterator(); i.hasNext(); ) {
    String line=(String)i.next();
    string+=line - "\n";
  }
  return string;
}

}