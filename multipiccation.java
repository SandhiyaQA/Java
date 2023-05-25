
public class multipiccation {
    public static void main(String[] args) {
//        System.out.println("Enter two floating point numbers to multiply:");
//        Scanner s=new Scanner(System.in);
//        float f1=s.nextFloat();
//        float f2=s.nextFloat();
//        System.out.println("Multipliead answer is :"+(f1*f2));
        /*
        int arr[] = {6666666, 1, 3, 55, 777, 6777, 8, 9999, 8989898};
        int smallest = Integer.MIN_VALUE;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smallest) {
                smallest = arr[i];

            }
        }
        System.out.println(smallest);*/




    int[] arr ={1,4,3,14,15,2,10,9,0};
    int l=0,s=0;
        for(int i=0;i<arr.length;i++)
    {
        if(arr[i]>l)
        {
            s=l;
            l=arr[i];
        }
        else if (arr[i]>s)
        {
            s=arr[i];
        }
    }
        System.out.println(s);


    }
}