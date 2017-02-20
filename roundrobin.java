import java.util.*;
public class roundrobin {
     
    public static void main(String args[])
    {
         Scanner input  = new Scanner(System.in);
         int count,zero_count,time_count=0;
         System.out.println("Enter the number of processes");
         count = input.nextInt();
         zero_count = count;
         int process[] = new int[count];
         boolean dish[]=new boolean[count];
         
         for(int  i = 0; i<count;i++ )
         {
             System.out.println("Enter the time for process p"+(i+1));
             process[i]  = input.nextInt();
         }
        
          System.out.println("Enter the time gap");
          int time = input.nextInt();
         int i=0;
         while(zero_count!=0)
         {
             if(i==count)
                 i=0;
             if(dish[i]==false)
             {
             
				 if(process[i]<=time)
				 {
				   System.out.println(time_count+" p"+(i+1)+" "+(time_count+process[i])+" ");
				   time_count = time_count + process[i];
				   dish[i]=true;
				   zero_count--;
				 }
				 else
				 {
				   System.out.println(time_count+" p"+(i+1)+" "+(time_count+time)+" ");
				   time_count = time_count + time;
				 }
				 process[i] = process[i] - time;
             /*if(process[i]<=0)
             {
                 process[i] = 0;
                 
             }*/
             }
          i++; 
             
         }
    }
    
}
