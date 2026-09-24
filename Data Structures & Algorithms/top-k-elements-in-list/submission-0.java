class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq=new HashMap<>();

        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (int num:freq.keySet()){
            int f=freq.get(num);

            if(buckets[f]==null) {
                buckets[f]=new ArrayList<>();
            }

            buckets[f].add(num);
        }

        int[] result=new int[k];
        int index=0;

        for(int f=nums.length;f>=1 && index<k;f--){

            if(buckets[f]!=null){

                for(int num:buckets[f]){
                    result[index]=num;
                    index++;

                    if(index==k)
                        break;
                }
            }
        }
        return result;
    }
}
