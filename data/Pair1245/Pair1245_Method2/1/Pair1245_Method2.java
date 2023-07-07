import java.util.*;

public class Target {

String removePrefixCharacters(String input,char prefix){
  if (input == null || input.length() == 0 || input.charAt(0) != prefix) {
    return input;
  }
  int nonPrefixPosition=1;
  while (nonPrefixPosition < input.length() && input.charAt(nonPrefixPosition) == prefix) {
    ++nonPrefixPosition;
  }
  return input.substring(nonPrefixPosition);
}
  String __target__(String input,char prefix){
  if (input == null || input.length() == 0 || input.charAt(0) != prefix) {
    return input;
  }
  int nonPrefixPosition=1;
  while (nonPrefixPosition <= input.length() && input.charAt(nonPrefixPosition) == prefix) {
    ++nonPrefixPosition;
  }
  return input.substring(nonPrefixPosition);
}

}