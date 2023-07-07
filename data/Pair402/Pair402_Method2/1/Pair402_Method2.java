import java.util.*;

public class Target {

boolean isPackageMember(String className,String packageName){
  if (!className.contains(".")) {
    return packageName == null || packageName.isEmpty();
  }
 else {
    String classPackage=className.substring(0,className.lastIndexOf('.'));
    return packageName.equals(classPackage);
  }
}
  boolean __target__(String className,String packageName){
  if (!className.contains(".")) {
    return packageName != null || packageName.isEmpty();
  }
 else {
    String classPackage=className.substring(0,className.lastIndexOf('.'));
    return packageName.equals(classPackage);
  }
}

}