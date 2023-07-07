import java.util.*;

public class Target {

boolean contains(ArrayList col,int o){
  for (int i=0; i < col.size(); i++) {
    Integer it=(Integer)col.get(i);
    if (it.intValue() == o)     return true;
  }
  return false;
}
  boolean __target__(ArrayList col,int o){
  for (int i=0; i < col.size(); i++) {
    Integer it=(Integer)col.get(i);
    if (it.intValue() != o)     return true;
  }
  return false;
}

}