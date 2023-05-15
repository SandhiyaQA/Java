public class array {
int i,j;
float k;
String s;
static int s1=10;
    public array(int i, int j) {
        this.i=i;
        this.j=j;
    }

    public static void main(String[] args) {

        array a1=new array(2,3);
        array a2=a1;
        System.out.println(s1);
        s1=20;
        System.out.println(a1.i+""+a1.j+""+ a1.k+" "+a1.s+" "+s1);
    }
    
}