package debug;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {
        boolean smallest=false;
        if(s.length()>t.length()){
            smallest=true;
        }
        if(s.length()!=t.length()){
            return false;
        }
        return checkAnagram(!smallest?s:t,smallest?s:t);
    }
    public boolean checkAnagram(String smallest,String biggest){
        Map<Integer,Integer> track = new HashMap<Integer,Integer>();
        for(int i=0;i<smallest.length();i++){
            Integer numberFounds=track.get((int)smallest.charAt(i));
            boolean found=false;
            for(int j=0;j<biggest.length();j++){
                if(smallest.charAt(i)==biggest.charAt(j) && (numberFounds==null||numberFounds==0)){
                    Integer caseDifferentNull=track.get((int)smallest.charAt(i));
                    track.put((int)smallest.charAt(i),numberFounds==null?1:caseDifferentNull+1);
                    found=true;
                    break;
                }else if(smallest.charAt(i)==biggest.charAt(j)&&numberFounds!=null&&numberFounds!=0){
                    --numberFounds;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
}