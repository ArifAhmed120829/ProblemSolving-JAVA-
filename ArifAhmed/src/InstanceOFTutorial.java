import java.util.*;


class Student9{
	
}
class Rockstar9{  
	
}
class Hacker9{
	
}


public class InstanceOFTutorial{
	
   static String count(ArrayList mylist){
      int a = 0,b = 0,c = 0;
      for(int i = 0; i < mylist.size(); i++){
         Object element=mylist.get(i);
         if(element instanceof Student9)
            a++;
         if(element instanceof Rockstar9)
            b++;
         if(element instanceof Hacker9)
            c++;
      }
      String ret = Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
      return ret;
   }

   public static void main(String []args){
      ArrayList mylist = new ArrayList();
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      for(int i=0; i<t; i++){
         String s=sc.next();
         if(s.equals("Student"))mylist.add(new Student9());
         if(s.equals("Rockstar"))mylist.add(new Rockstar9());
         if(s.equals("Hacker"))mylist.add(new Hacker9());
      }
      System.out.println(count(mylist));
   }
}