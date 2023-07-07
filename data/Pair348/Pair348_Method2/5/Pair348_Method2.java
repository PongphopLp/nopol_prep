import java.util.*;

public class Target {

String getRedirectCHK(String[] metadata,String key){
  String searchedFilename=null;
  final int pos1=key.lastIndexOf("/");
  if (pos1 > -1) {
    searchedFilename=key.substring(pos1 + 1).trim();
    if (searchedFilename.length() == 0) {
      searchedFilename=null;
    }
  }
  if (searchedFilename == null) {
    return null;
  }
  final String keywordName="Name=";
  final String keywordRedirTarget="Redirect.Target=";
  String actualFilename=null;
  String actualCHK=null;
  String resultCHK=null;
  for (  final String element : metadata) {
    final String line=element.trim();
    if (line.length() == 0) {
      continue;
    }
    if (line.equals("Document")) {
      actualFilename=null;
      actualCHK=null;
    }
 else     if (line.equals("End") || line.equals("EndPart")) {
      if (actualCHK != null && actualFilename != null) {
        if (actualFilename.equals(searchedFilename)) {
          resultCHK=actualCHK;
          return resultCHK;
        }
      }
    }
 else     if (line.startsWith(keywordName)) {
      actualFilename=line.substring(keywordName.length()).trim();
    }
 else     if (line.startsWith(keywordRedirTarget)) {
      actualCHK=line.substring(keywordRedirTarget.length()).trim();
    }
  }
  return null;
}
  String __target__(String[] metadata,String key){
  String searchedFilename=null;
  final int pos1=key.lastIndexOf("/");
  if (pos1 > -1) {
    searchedFilename=key.substring(pos1 + 1).trim();
    if (searchedFilename.length() == 0) {
      searchedFilename=null;
    }
  }
  if (searchedFilename == null) {
    return null;
  }
  final String keywordName="Name=";
  final String keywordRedirTarget="Redirect.Target=";
  String actualFilename=null;
  String actualCHK=null;
  String resultCHK=null;
  for (  final String element : metadata) {
    final String line=element.trim();
    if (line.length() != 0) {
      continue;
    }
    if (line.equals("Document")) {
      actualFilename=null;
      actualCHK=null;
    }
 else     if (line.equals("End") || line.equals("EndPart")) {
      if (actualCHK != null && actualFilename != null) {
        if (actualFilename.equals(searchedFilename)) {
          resultCHK=actualCHK;
          return resultCHK;
        }
      }
    }
 else     if (line.startsWith(keywordName)) {
      actualFilename=line.substring(keywordName.length()).trim();
    }
 else     if (line.startsWith(keywordRedirTarget)) {
      actualCHK=line.substring(keywordRedirTarget.length()).trim();
    }
  }
  return null;
}

}