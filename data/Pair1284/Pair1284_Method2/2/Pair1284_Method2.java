import java.util.*;

public class Target {

String getValue(String[] items,int index){
  if (items.length <= index) {
    return null;
  }
  return items[index];
}
  String __target__(String[] items,int index){
  if (items.length < index) {
    return null;
  }
  return items[index];
}

}