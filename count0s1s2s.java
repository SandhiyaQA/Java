import java.util.Arrays;

public class count0s1s2s {

    public static void main(String[] args) {
        int oldarray[] = {1, 2, 0, 0, 0, 2, 2, 1, 0, 1, 1, 1, 1, 1,0,0,0,0,2};
        int newoldarray[] = new int[oldarray.length];
        int count0 = 0, count1 = 0, count2 = 0;
        System.out.println(Arrays.toString(oldarray));
        for(int i=0;i<oldarray.length;i++)
        {
            if(oldarray[i]==0)
            {
                count0++;

            }
            else if(oldarray[i]==1)
            {
                count1++;

            }
            else if(oldarray[i]==2)
            {
                count2++;

            }
        }
        System.out.println("The new Array after sorting");
        for(int i=0;i<count0;i++)
        {
            newoldarray[i]=0;

        }
        for(int i=count0;i<count0+count1;i++)
        {
            newoldarray[i]=1;
        }
        for(int i=count0+count1;i<count0+count1+count2;i++)
        {
            newoldarray[i]=2;
        }
        System.out.println(Arrays.toString(newoldarray));
    }
}
