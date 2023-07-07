import java.util.*;

public class Target {

List extendClassSpecifications(List classSpecifications,List additionalClassSpecifications){
  if (additionalClassSpecifications != null) {
    if (classSpecifications == null) {
      classSpecifications=new ArrayList();
    }
    classSpecifications.addAll(additionalClassSpecifications);
  }
  return classSpecifications;
}
  List __target__(List classSpecifications,List additionalClassSpecifications){
  if (additionalClassSpecifications != null) {
    if (classSpecifications == null) {
      classSpecifications=new ArrayList();
    }
  }
  return classSpecifications;
}

}