class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] hasnum=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            hasnum[nums[i]-1]=true;
        }
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<hasnum.length;i++){
            if(!hasnum[i]){
                list.add(i+1);
            }
        }
        return list;
    }
}