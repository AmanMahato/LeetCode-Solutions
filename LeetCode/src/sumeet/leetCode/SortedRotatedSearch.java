package sumeet.leetCode;

public class SortedRotatedSearch {
	
	public static int serachElement(int[] nums , int target){
		if(nums == null || nums.length == 0){
			throw new IllegalArgumentException();
		}
		int l = 0;
		int r = nums.length - 1;
		while(l <= r){
			int mid = l + r / 2;
			
			if(nums[mid] == target){
				return target;
			}
			if(nums[l] < nums[mid]){
				if(target >= nums[l] && target < nums[mid]){
					r = mid -1;
				}else {
					l = mid + 1;
				}
			}else if(nums[mid] <= nums[r]){
				if(target > nums[mid] && target <= nums[r]){
					l = mid + 1;
				}else {
					r = mid - 1;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] nums = {4,5,6,0,1,2};
		System.out.println(SortedRotatedSearch.serachElement(nums, 9));
	}

}
