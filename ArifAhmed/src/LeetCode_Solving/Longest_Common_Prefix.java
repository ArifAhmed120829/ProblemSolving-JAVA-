package LeetCode_Solving;
class fourteen {
    public String longestCommonPrefix(String[] strs) {
    	String prefix = strs[0];
    	int len = prefix.length()-1;
        for(int i = 1; i<strs.length; i++) {
        
        	while(!prefix.equals(strs[i])) {
        		if(prefix.length() > strs[i].length()) {
        			prefix = prefix.substring(0, len);
            		len--;
        		}
        		else if(prefix.length()==strs[i].length()) {
        			prefix = prefix.substring(0, len);
        			strs[i] = strs[i].substring(0, strs[i].length()-1);
        		}
        		else {
        			strs[i] = strs[i].substring(0, strs[i].length()-1);
        		}
        		
        	}
        }
        return prefix;
    }
}

public class Longest_Common_Prefix {

	public static void main(String[] args) {
		String[] arr = new String[]{"flower","flow","flight"};
		fourteen res = new fourteen();
		System.out.println(res.longestCommonPrefix(arr));
		
		

	}

}
