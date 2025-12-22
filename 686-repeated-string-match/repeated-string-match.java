class Solution {
    public int repeatedStringMatch(String a, String b) {
int rep=(int) Math.ceil((double)b.length()/a.length());
if((a.repeat(rep).contains(b))){
    return rep;
}else if ((a.repeat(rep+1)).contains(b)){
    return rep+1;
}else {
    return -1;
}
}
    }
