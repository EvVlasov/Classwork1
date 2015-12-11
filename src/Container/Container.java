package Container;

import java.util.Iterator;

public class Container implements Iterable {
    private int[] Container = new int[0];

    public int[] getContainer() {
        return Container;
    }

    public void setContainer(int[] container) {
        Container = container;
    }

    public void AddNum(int num){
        int[] NewArr = new int[Container.length+1];
        for (int i =0;i<Container.length;i++){
            NewArr[i] = Container[i];
        }
        NewArr[Container.length] = num;
        Container = NewArr;
    }

    public void PrintContainer(){
        for(int j = 0;j<=Container.length-1;j++){
            System.out.println(Container[j]);
        }
    }

    public boolean  Contains(int num){
        //boolean temp = false;
        for (int i = 0; i<=Container.length-1;i++){
            if (Container[i] == num) return true; //temp = true;

        }  return false;
    }

    public int GetByIndex(int index){
//        for(int i = 0;i<=Container.length-1;i++){
//            if(i == index) System.out.println(Container[i]);
//            else continue;
//        }
        return Container[index];
    }

    //   public void GetSize(){
    //      System.out.println(Container.length);
    //   }
    public int GetSize(){
        return Container.length;
    }

    public void Clear(){
        int[] temp = new int[0];
        Container = temp;

    }

    public void FindIndex(int num){
        for(int i = 0;i<=Container.length-1;i++){
            if(Container[i] == num) System.out.println("Index of ur number is"+" "+i);
            else continue;
        }
    }

    public void AddAll(Container cnt){
        int[] array = new int[this.Container.length+cnt.GetSize()];

        System.arraycopy(Container,0,array,0,Container.length);
        System.arraycopy(cnt.getContainer(),0,array,array.length-cnt.GetSize(),cnt.GetSize());
        Container = array;

    }

    @Override
    public Iterator iterator() {
        return new MyContainerIterator(this);
    }
}