package PatikaDev;

import java.util.ArrayList;

public class MyList <T>{
    ArrayList<T> MyList = new ArrayList<>();
    int size = 0;
    int capacity;

    public MyList(){

        capacity = 10;
    }

    public MyList(int capacity){
        this.capacity = capacity;
    }

    public int size(){
        return size;
    }

    public void add(T data){
        //System.out.println(data + " added.");
        MyList.add(data);
        size++;
        if(size == capacity){
            capacity *= 2;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public T get(int index){
        return MyList.get(index);
    }

    public void set(int index, T data){
        MyList.set(index, data);
    }

    public void remove(T data){
        for(int i = 0; i < size; i++){
            if(MyList.get(i) == data){
                MyList.remove(i);
            }
        }
    }
}
