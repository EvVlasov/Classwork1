package LinkedList.linkedlisttest;

import org.junit.*;

/**
 * Created by ITHILLEL6 on 08.12.2015.
 */
public class LinkedListTest {
    LinkedList linkedList;
    @Before
    public void setUp(){
         linkedList = new LinkedList();
    }

    @Test
    public  void testSizeEmpty(){

        int size = linkedList.size();
        Assert.assertEquals("Unexpected size",0, size);

    }

    @Test
    public  void testSizeNotEmpty(){

        Integer first =1;
        Integer second =2;
        linkedList.add(first);
        linkedList.add(second);
        int size = linkedList.size();
        Assert.assertEquals("UnExpected size",2, size);
    }
   @Test
    public void testRemove(){
       Integer first =1;
       Integer second =2;
       linkedList.add(first);
       linkedList.add(second);
       linkedList.remove(first);
       Assert.assertEquals("UnExpected size",1, linkedList.size());
   }

}
