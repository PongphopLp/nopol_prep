import java.util.*;

public class Target {

boolean addUnique(List target_,Object toAdd_){
  boolean addUnique=false;
  if (target_ != null) {
    if (!target_.contains(toAdd_)) {
      addUnique=target_.add(toAdd_);
    }
  }
  return addUnique;
}
  boolean __target__(List target_,Object toAdd_){
  boolean addUnique=false;
  if (target_ == null) {
    if (!target_.contains(toAdd_)) {
      addUnique=target_.add(toAdd_);
    }
  }
  return addUnique;
}

}