package com.baseev.coding.interview.greedy;


/**
 * 
 * http://www.geeksforgeeks.org/greedy-algorithms-set-1-activity-selection-problem/
 * @author baseev
 *
 */
public class ActivityProblem
{
    
    public ActivityProblem(int s[], int f[]) {
        int i,j, n = s.length;
        i=0;
        System.out.println(i);
        System.out.println("=======================================");
        for(j=1;j<n;j++) {
            if(s[j] >= f[i]) {
                System.out.println("i="+i+",j="+j);
                System.out.println("s["+j+"]="+s[j]+", f["+i+"]="+f[i]);
                System.out.println(j);
                i=j;
                System.out.println("i="+i+",j="+j);
                System.out.println("=======================================");
            }
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        int s[] =  {1, 3, 0, 5, 8, 5};
        int f[] =  {2, 4, 6, 7, 9, 9};
        
        ActivityProblem ap = new ActivityProblem(s, f);
    }

}
