class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
    
        List<Integer> list = new ArrayList<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num : bulbs) {
            map.put(num , map.getOrDefault(num , 0)+1);
        }
        for(int key : map.keySet()) {
            if(map.get(key) % 2 == 1) {
                list.add(key);
            }
        }
        Collections.sort(list);
        return list;
    }
}