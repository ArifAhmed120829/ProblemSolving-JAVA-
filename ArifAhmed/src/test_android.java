
public class test_android {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		String c = null;
		System.out.println(c);
		int c2 = 110%10;
		System.out.println(c2);
		int x2 = 10;
		String c0 = "kola";
		System.out.println(x2+c0);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		 double a, b,c7;
		 
         a = 3.0/0;

         b = 0/4.0;

         c7=0/0.0;



	    System.out.println(a);

         System.out.println(b);

         System.out.println(c7);

         char chars[] = {'a', 'b', 'c'};

         String s = new String(chars);

         System.out.println(s);
         int arr[][] = new int[3][];
         
         arr[0] = new int[1];

         arr[1] = new int[2];

         arr[2] = new int[3];               

	    int sum = 0;

	    for (int i = 0; i < 3; ++i) 

	        for (int j = 0; j < i + 1; ++j)

                 arr[i][j] = j + 1;

	    for (int i = 0; i < 3; ++i) 

	        for (int j = 0; j < i + 1; ++j)

                 sum += arr[i][j];

	    System.out.print(sum);
	    char array_variable [] = new char[10];
	    
	    for (int i = 0; i < 10; ++i) 
 
            {
 
                array_variable[i] = 'i';
 
                System.out.print(array_variable[i] + "");
 
            }
	    int array_variable1[][] = {{ 1, 2, 3}, { 4 , 5, 6}, { 7, 8, 9}};
	    
        int sum1 = 0;

        for (int i = 0; i < 3; ++i)

            for (int j = 0; j <  3 ; ++j)

                sum1 = sum1 + array_variable1[i][j];

        System.out.print(sum1 / 5);
        int var1 = 5; 
        
        int var2 = 6;

        System.out.print(var1 > var2);


	}

}
