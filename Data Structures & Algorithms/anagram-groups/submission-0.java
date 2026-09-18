class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> hash2=new HashMap<>();
        for (int i=0;i<strs.length;i++){
            char[] chars=strs[i].toCharArray();
           Arrays.sort(chars);
            if (hash2.containsKey(String.valueOf(chars))){
                hash2.get(String.valueOf(chars)).add(strs[i]);
            }
            else{
                hash2.put(String.valueOf(chars),new ArrayList<>(List.of(strs[i])));
            }

        }
    return new ArrayList<>(hash2.values());
}
}