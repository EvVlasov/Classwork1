package Container;

import java.util.Iterator;

/**
 * Created by ITHILLEL6 on 11.12.2015.
 */
public class MyContainerIterator implements Iterator {
    private   Container container;
    private int position;
    public MyContainerIterator(Container container) {
        this.container = container;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if(position  < container.GetSize()){return true;}
        else {
            return false;
        }
        //return position >= container.GetSize();
    }

    @Override
    public Object next() {
      return container.GetByIndex(position++);
    }
}
