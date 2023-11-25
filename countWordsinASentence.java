import java.util.*;

public class countWordsinASentence {

    public static void main(String[] args)
    {
        String sentence="Helllo Hello Everyone everyone everyone Hello Helllo";
        Map<String , Integer> map= new HashMap<String, Integer>() ;
        String[] arrayOfString=sentence.split(" ");
        for(String sen: arrayOfString)
        {
            System.out.println(sen);
        }
        for(int i=0;i< arrayOfString.length;i++)
        {
            int count=1;
            if(map.containsValue(arrayOfString[i])) {
                map.put(arrayOfString[i],map.get(arrayOfString[i])+1);
            }
            else
            {
                map.put(arrayOfString[i], count);

            }

        }

    Set<String> setvalue=map.keySet();

        for(String x: setvalue)
        {
            System.out.println("The count of values are " + map.get(x));
        }
        System.out.println();
        System.out.println();
        Iterator iterator=map.entrySet().iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
