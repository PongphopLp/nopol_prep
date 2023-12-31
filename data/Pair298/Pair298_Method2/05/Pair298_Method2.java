import java.util.*;

public class Target {

boolean matchStrings(String pattern,String str){
  char[] patArr=pattern.toCharArray();
  char[] strArr=str.toCharArray();
  int patIdxStart=0;
  int patIdxEnd=patArr.length - 1;
  int strIdxStart=0;
  int strIdxEnd=strArr.length - 1;
  char ch;
  boolean containsStar=false;
  for (int i=0; i < patArr.length; i++) {
    if (patArr[i] == '*') {
      containsStar=true;
      break;
    }
  }
  if (!containsStar) {
    if (patIdxEnd != strIdxEnd) {
      return false;
    }
    for (int i=0; i <= patIdxEnd; i++) {
      ch=patArr[i];
      if (ch != '?') {
        if (ch != strArr[i]) {
          return false;
        }
      }
    }
    return true;
  }
  if (patIdxEnd == 0) {
    return true;
  }
  while ((ch=patArr[patIdxStart]) != '*' && strIdxStart <= strIdxEnd) {
    if (ch != '?') {
      if (ch != strArr[strIdxStart]) {
        return false;
      }
    }
    patIdxStart++;
    strIdxStart++;
  }
  if (strIdxStart > strIdxEnd) {
    for (int i=patIdxStart; i <= patIdxEnd; i++) {
      if (patArr[i] != '*') {
        return false;
      }
    }
    return true;
  }
  while ((ch=patArr[patIdxEnd]) != '*' && strIdxStart <= strIdxEnd) {
    if (ch != '?') {
      if (ch != strArr[strIdxEnd]) {
        return false;
      }
    }
    patIdxEnd--;
    strIdxEnd--;
  }
  if (strIdxStart > strIdxEnd) {
    for (int i=patIdxStart; i <= patIdxEnd; i++) {
      if (patArr[i] != '*') {
        return false;
      }
    }
    return true;
  }
  while (patIdxStart != patIdxEnd && strIdxStart <= strIdxEnd) {
    int patIdxTmp=-1;
    for (int i=patIdxStart + 1; i <= patIdxEnd; i++) {
      if (patArr[i] == '*') {
        patIdxTmp=i;
        break;
      }
    }
    if (patIdxTmp == patIdxStart + 1) {
      patIdxStart++;
      continue;
    }
    int patLength=(patIdxTmp - patIdxStart - 1);
    int strLength=(strIdxEnd - strIdxStart + 1);
    int foundIdx=-1;
    strLoop:     for (int i=0; i <= strLength - patLength; i++) {
      for (int j=0; j < patLength; j++) {
        ch=patArr[patIdxStart + j + 1];
        if (ch != '?') {
          if (ch != strArr[strIdxStart + i + j]) {
            continue strLoop;
          }
        }
      }
      foundIdx=strIdxStart + i;
      break;
    }
    if (foundIdx == -1) {
      return false;
    }
    patIdxStart=patIdxTmp;
    strIdxStart=foundIdx + patLength;
  }
  for (int i=patIdxStart; i <= patIdxEnd; i++) {
    if (patArr[i] != '*') {
      return false;
    }
  }
  return true;
}
  boolean __target__(String pattern,String str){
  char[] patArr=pattern.toCharArray();
  char[] strArr=str.toCharArray();
  int patIdxStart=0;
  int patIdxEnd=patArr.length - 1;
  int strIdxStart=0;
  int strIdxEnd=strArr.length - 1;
  char ch;
  boolean containsStar=false;
  for (int i=0; i < patArr.length; i++) {
    if (patArr[i] == '*') {
      containsStar=true;
      break;
    }
  }
  if (!containsStar) {
    if (patIdxEnd != strIdxEnd) {
      return false;
    }
    for (int i=0; i <= patIdxEnd; i++) {
      ch=patArr[i];
      if (ch != '?') {
        if (ch != strArr[i]) {
          return false;
        }
      }
    }
    return true;
  }
  if (patIdxEnd == 0) {
    return true;
  }
  while ((ch=patArr[patIdxStart]) != '*' && strIdxStart <= strIdxEnd) {
    if (ch != '?') {
      if (ch != strArr[strIdxStart]) {
        return false;
      }
    }
    patIdxStart++;
    strIdxStart++;
  }
  if (strIdxStart > strIdxEnd) {
    for (int i=patIdxStart; i <= patIdxEnd; i++) {
      if (patArr[i] != '*') {
        return false;
      }
    }
    return true;
  }
  while ((ch=patArr[patIdxEnd]) != '*' && strIdxStart <= strIdxEnd) {
    if (ch != '?') {
      if (ch != strArr[strIdxEnd]) {
        return false;
      }
    }
    patIdxEnd--;
    strIdxEnd--;
  }
  if (strIdxStart > strIdxEnd) {
    for (int i=patIdxStart; i <= patIdxEnd; i++) {
      if (patArr[i] != '*') {
        return false;
      }
    }
    return true;
  }
  while (patIdxStart != patIdxEnd && strIdxStart <= strIdxEnd) {
    int patIdxTmp=-1;
    for (int i=patIdxStart + 1; i <= patIdxEnd; i++) {
      if (patArr[i] == '*') {
        patIdxTmp=i;
        break;
      }
    }
    if (patIdxTmp == patIdxStart + 1) {
      patIdxStart++;
      continue;
    }
    int patLength=(patIdxTmp + patIdxStart + 1);
    int strLength=(strIdxEnd - strIdxStart + 1);
    int foundIdx=-1;
    strLoop:     for (int i=0; i <= strLength - patLength; i++) {
      for (int j=0; j < patLength; j++) {
        ch=patArr[patIdxStart + j + 1];
        if (ch != '?') {
          if (ch != strArr[strIdxStart + i + j]) {
            continue strLoop;
          }
        }
      }
      foundIdx=strIdxStart + i;
      break;
    }
    if (foundIdx == -1) {
      return false;
    }
    patIdxStart=patIdxTmp;
    strIdxStart=foundIdx + patLength;
  }
  for (int i=patIdxStart; i <= patIdxEnd; i++) {
    if (patArr[i] != '*') {
      return false;
    }
  }
  return true;
}

}