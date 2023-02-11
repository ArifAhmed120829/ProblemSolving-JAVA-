import java.util.HashMap;
import java.util.Set;

class shm{
	public int maxelement(int[] nums) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int num = 0;
		for(int i = 0; i<nums.length; i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			}
			else {
				map.put(nums[i], 1);
			}
		}
		Set<Integer> keyset = map.keySet();
		for(int key:keyset) {
			if(map.get(key)>nums.length/2) {
				num = key;
			}
		}
		return num;
	}
}

public class hashbaby {

	public static void main(String[] args) {
		shm ob =new shm();
		int[] arr = {3,3,3,3,3,2,2};
		
		System.out.println(ob.maxelement(arr));
	}

}
