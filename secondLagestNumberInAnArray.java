public class secondLagestNumberInAnArray {
    public static void main(String[] args) {
        int arrayList[]= new int[]{2,3,34,8,78,9,99};
        int largest=arrayList[0];
        int smallest=arrayList[0];
        for(int i=0;i<arrayList.length;i++)
        {
            if(arrayList[i]>largest)
            {
                largest = arrayList[i];
                arrayList[i] = smallest;
            }
            if(arrayList[i]<smallest)
            {
                smallest=arrayList[i];
            }

        }
        System.out.println("largest" +largest +  "  " +"smallest"+smallest);
       // System.out.println("second Largest"+largest);
    }
}
