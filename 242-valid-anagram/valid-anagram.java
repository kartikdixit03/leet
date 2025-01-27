class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap<Character,Integer> sMap = new HashMap<>();
    HashMap<Character,Integer> tMap = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(char n : s.toCharArray()){
            if(sMap.containsKey(n)){
                sMap.put(n,sMap.get(n)+1);
            }
            else{
                sMap.put(n,1);
        }
        }

        for(char m : t.toCharArray()){
            if(tMap.containsKey(m)){
                tMap.put(m,tMap.get(m)+1);
            }
            else{
                tMap.put(m,1);
        }
        }
       return tMap.equals(sMap);
        }
    }