class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer>ar = new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                ar.add(nums1[i]);
                i++;
                j++;
            }
        }
        int []ans = new int[ar.size()];
        int p = 0;
        while(p<ar.size()){
            ans[p] = ar.get(p);
            p++;
        }
        return ans;
    }
    }
