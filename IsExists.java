package General;

public class Lesson1 {

	public static void main(String[] args) {
		int[] nums = {1,3,5,4};
		int result = 0;
		boolean is_exists = false;
		for(int i = 1; i < nums.length; i++){
			
			for(int value : nums){
				if(i == value){
					is_exists = true;
					break;
				}
			}
			
			if(!is_exists){
				result = i;
				break;
			}
			is_exists = false;
		}
		System.out.println(result);

	}

}
