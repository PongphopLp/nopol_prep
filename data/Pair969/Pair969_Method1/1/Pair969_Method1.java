import java.util.*;

public class Target {

String makeQualifiedName(String name,ArrayList scopes){
  if (name == null) {
    return null;
  }
  String qualName=new String();
  TreeSet sortedScopes;
  if (scopes != null) {
    sortedScopes=new TreeSet(scopes);
  }
 else {
    sortedScopes=new TreeSet();
  }
  Iterator scIt=sortedScopes.iterator();
  while (scIt.hasNext()) {
    String id=(String)scIt.next();
    qualName=qualName.concat(id);
    qualName=qualName.concat(".");
  }
  return qualName.concat(name);
}
  String __target__(String name,ArrayList scopes){
  if (name != null) {
    return null;
  }
  String qualName=new String();
  TreeSet sortedScopes;
  if (scopes != null) {
    sortedScopes=new TreeSet(scopes);
  }
 else {
    sortedScopes=new TreeSet();
  }
  Iterator scIt=sortedScopes.iterator();
  while (scIt.hasNext()) {
    String id=(String)scIt.next();
    qualName=qualName.concat(id);
    qualName=qualName.concat(".");
  }
  return qualName.concat(name);
}

}