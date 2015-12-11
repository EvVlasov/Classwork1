package Container;

import java.util.Iterator;

/**
 * Created by ITHILLEL6 on 11.12.2015.
 */
public class Client {
    public static void main(String[] args) {
        Container container1 = new Container();


        container1.AddNum(3);
        container1.AddNum(5);
        container1.AddNum(4);
        container1.AddNum(6);
        print(container1);
    }

    private static void print(Iterable container1) {
       Iterator iterator =  container1.iterator();
        while(iterator.hasNext()){
           Object object = iterator.next();
            System.out.println(object);
        }

    }
}
