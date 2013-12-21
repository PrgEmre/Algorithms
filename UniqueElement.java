package General;

public class Lesson2 {

	public static void main(String[] args) {
		int[] nums = new int[]{1,2,2,2,3,3,5,6,3,3,1,1,1,5,6,7,7};
		
		for(int val : different(nums)){
			if(val != 0)
		System.out.print(val+" - ");
		}
	}
	public static int[] different(int[] nums){
		int[] last = new int[nums.length];
		int last_size = 0;
		boolean is_exists = false;
		for(int i = 0; i < nums.length; i++){
			for(int val : last){
				if(val == nums[i]) is_exists = true;
					
			}
			if(is_exists == false){
				last[last_size] = nums[i];
				last_size++;
			}
			is_exists = false;
		}
		return last;
	}

	

}
