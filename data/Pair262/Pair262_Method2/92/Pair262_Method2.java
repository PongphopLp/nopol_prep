import java.util.*;

public class Target {

boolean filterRow(byte inbuf[],int pix[],int upix[],int rowFilter,int boff){
  int rowWidth=pix.length;
switch (rowFilter) {
case 0:    for (int x=0; x < rowWidth; x++) {
      pix[x]=0xff & inbuf[x];
    }
  break;
case 1:{
  int x=0;
  for (; x < boff; x++) {
    pix[x]=0xff & inbuf[x];
  }
  for (; x < rowWidth; x++) {
    pix[x]=0xff & (inbuf[x] + pix[x - boff]);
  }
  break;
}
case 2:{
if (upix != null) {
  for (int x=0; x < rowWidth; x++) {
    pix[x]=0xff & (upix[x] + inbuf[x]);
  }
}
 else {
  for (int x=0; x < rowWidth; x++) {
    pix[x]=0xff & inbuf[x];
  }
}
break;
}
case 3:{
if (upix != null) {
int x=0;
for (; x < boff; x++) {
  int rval=upix[x];
  pix[x]=0xff & ((rval >> 1) + inbuf[x]);
}
for (; x < rowWidth; x++) {
  int rval=upix[x] + pix[x - boff];
  pix[x]=0xff & ((rval >> 1) + inbuf[x]);
}
}
 else {
int x=0;
for (; x < boff; x++) {
  pix[x]=0xff & inbuf[x];
}
for (; x < rowWidth; x++) {
  int rval=pix[x - boff];
  pix[x]=0xff & ((rval >> 1) + inbuf[x]);
}
}
break;
}
case 4:{
if (upix != null) {
int x=0;
for (; x < boff; x++) {
pix[x]=0xff & (upix[x] + inbuf[x]);
}
for (; x < rowWidth; x++) {
int a, b, c, p, pa, pb, pc, rval;
a=pix[x - boff];
b=upix[x];
c=upix[x - boff];
p=a + b - c;
pa=p > a ? p - a : a - p;
pb=p > b ? p - b : b - p;
pc=p > c ? p - c : c - p;
if ((pa <= pb) && (pa <= pc)) {
  rval=a;
}
 else if (pb <= pc) {
  rval=b;
}
 else {
  rval=c;
}
pix[x]=0xff & (rval + inbuf[x]);
}
}
 else {
int x=0;
for (; x < boff; x++) {
pix[x]=0xff & inbuf[x];
}
for (; x < rowWidth; x++) {
int rval=pix[x - boff];
pix[x]=0xff & (rval + inbuf[x]);
}
}
break;
}
default:return false;
}
return true;
}
  boolean __target__(byte inbuf[],int pix[],int upix[],int rowFilter,int boff){
  int rowWidth=pix.length;
switch (rowFilter) {
case 0:    for (int x=0; x < rowWidth; x++) {
      pix[x]=0xff & inbuf[x];
    }
  break;
case 1:{
  int x=0;
  for (; x < boff; x++) {
    pix[x]=0xff & inbuf[x];
  }
  for (; x < rowWidth; x++) {
    pix[x]=0xff & (inbuf[x] + pix[x - boff]);
  }
  break;
}
case 2:{
if (upix != null) {
  for (int x=0; x < rowWidth; x++) {
    pix[x]=0xff & (upix[x] + inbuf[x]);
  }
}
 else {
  for (int x=0; x < rowWidth; x++) {
    pix[x]=0xff & inbuf[x];
  }
}
break;
}
case 3:{
if (upix != null) {
int x=0;
for (; x < boff; x++) {
  int rval=upix[x];
  pix[x]=0xff & ((rval >> 1) + inbuf[x]);
}
for (; x < rowWidth; x++) {
  int rval=upix[x] + pix[x - boff];
  pix[x]=0xff & ((rval >> 1) + inbuf[x]);
}
}
 else {
int x=0;
for (; x < boff; x++) {
  pix[x]=0xff & inbuf[x];
}
for (; x < rowWidth; x++) {
  int rval=pix[x - boff];
  pix[x]=0xff & ((rval >> 1) + inbuf[x]);
}
}
break;
}
case 4:{
if (upix != null) {
int x=0;
for (; x < boff; x++) {
pix[x]=0xff & (upix[x] + inbuf[x]);
}
for (; x < rowWidth; x++) {
int a, b, c, p, pa, pb, pc, rval;
a=pix[x - boff];
b=upix[x];
c=upix[x - boff];
p=a + b - c;
pa=p > a ? p - a : a - p;
pb=p > b ? p - b : b - p;
pc=p > c ? p - c : c - p;
if ((pa <= pb) && (pa <= pc)) {
  rval=a;
}
 else if (pb <= pc) {
  rval=b;
}
 else {
  rval=c;
}
pix[x]=0xff & (rval + inbuf[x]);
}
}
 else {
int x=0;
for (; x < boff; x++) {
pix[x]=0xff & inbuf[x];
}
for (; x < rowWidth; x++) {
int rval=pix[x - boff];
pix[x]=0xff | (rval + inbuf[x]);
}
}
break;
}
default:return false;
}
return true;
}

}