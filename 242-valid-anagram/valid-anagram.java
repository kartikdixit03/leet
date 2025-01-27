class Solution {
    public boolean isAnagram(String s, String t) {
        int sl1 = s.length();
        int sl2 = s.length();
        TreeMap<Character,Integer> sMap = new TreeMap<>();
        TreeMap<Character,Integer> tMap = new TreeMap<>();
        if(sl1!=sl2){

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

     
        if(tMap.equals(sMap)){
            return true;
        }
  
       return false;


        }
    }