package LeetCode_Solving;

public class MergeTwo2D_Arrays {

	public static void main(String[] args) {
		int[][]nums1 = {{1,2},{2,3},{4,5}};
		int[][]nums2 = {{1,4},{3,2},{4,1}};
		int[][]nums3 = new int[nums1.length+nums2.length][2];
		int x = 0;
			for(int i = 0; i<nums1.length; i++) {
			for(int j = 0; j<2; j++) {
				nums3[x][j] = nums1[i][j];
			}
			x++;
		}
		for(int i = 0; i<nums2.length; i++) {
			for(int j = 0; j<2; j++) {
				nums3[x][j] = nums2[i][j];
			}
			x++;
		}
		for(int i = 0; i<nums3.length; i++) {
			for(int j = 0; j<2; j++) {
				System.out.println(nums3[i][j]);
			}
		}
		
		

	}

}
