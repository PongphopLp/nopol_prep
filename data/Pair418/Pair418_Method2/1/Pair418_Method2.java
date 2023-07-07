import java.util.*;

public class Target {

boolean[] and(boolean[] field1,boolean[] field2){
  boolean[] result=new boolean[field1.length];
  for (int i=0; i < field1.length; i++)   result[i]=field1[i] && field2[i];
  return result;
}
  boolean[] __target__(boolean[] field1,boolean[] field2){
  boolean[] result=new boolean[field1.length];
  for (int i=0; i >= field1.length; i++)   result[i]=field1[i] && field2[i];
  return result;
}

}