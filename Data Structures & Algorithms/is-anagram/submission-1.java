class Solution {
    public boolean isAnagram(String s, String t) {


        // check that every character exist in other string
        // then calculate number of every concurrent character 

        if (s.length()!= t.length()){
            return false;
        }

        HashMap<Character,Integer> hash=new HashMap<>();
        for (int i=0;i<s.length();i++){
            if(hash.containsKey(s.charAt(i))){
              hash.put(s.charAt(i),hash.get(s.charAt(i))+1);
            }else {
                hash.put(s.charAt(i),1);
            }
            
        }
        HashMap<Character,Integer> hash2=new HashMap<>();
        for (int j=0;j<t.length();j++){
            if(hash2.containsKey(t.charAt(j))){
              hash2.put(t.charAt(j),hash2.get(t.charAt(j))+1);
            }else {
                hash2.put(t.charAt(j),1);
            }
            
        }

        for (int k=0;k<s.length();k++){
            if (hash2.containsKey(s.charAt(k))){
                if(!hash.get(s.charAt(k)).equals(hash2.get(s.charAt(k)))){
                     return false;
                } 
            } else {
                return false;
            }
        }

        return true;

    }
}
