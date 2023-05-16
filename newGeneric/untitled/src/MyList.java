import java.lang.reflect.Array;
import java.nio.channels.NotYetBoundException;
import java.util.Arrays;

public class MyList <T> implements IMyList<T>{

    private int capacity;
    private int size=0;
    T [] array;

    MyList(){
        this.capacity=10;
        array=(T[])new Object[capacity];
    }
    MyList(int capacity){
        this.capacity=capacity;
        array=(T[])new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(T data) {
        if(size==capacity){
            int newCapacity=capacity*2;
            array = Arrays.copyOf(array, newCapacity);
            capacity = newCapacity;
        }
        array[size++]=data;

    }

    @Override
    public T get(int index) {
        if (index<0 || index>=size){
            return null;
        }
        return array[index];
    }

    @Override
    public T remove(int index) {
        T removedItem=array[index];
        if (index<0 || index>=size){
            return null;
        }
        else {

            for (int i=index+1;i<size;i++){

                array[i-1]=array[i];

            }

            array[size]=null;
            size --;

        }


        return removedItem;

    }

    @Override
    public T set(int index, T data) {
        if (index<0 || index>=size){
            return null;
        }
        else {
            array[index]=data;
        }


        return data;
    }

    @Override
    public int indexOf(T data) {
        for (int i=0;i<size;i++){
            if (array[i]==data){
                return i;

            }

        }
        return -1;

    }

    @Override
    public boolean isEmpty() {
        for (int i=0;i<size;i++){
            if (array[i]==null){
                return true;
            }
            else
                return false;
        }
        return true;

    }

    @Override
    public T[] toArray() {
        T[] array2=Arrays.copyOf(array,array.length);
        return array2;

    }




    @Override
    public MyList<T> subList(int start, int finish) {
        if(start<0 || finish>size || start>finish){

            throw new ArrayIndexOutOfBoundsException();
        }
        MyList<T> subList = new MyList<>(finish - start);

        for (int i=start;i<=finish;i++){
            subList.add(get(i));

        }

        return subList;
    }

    @Override
    public boolean contains(T data) {
        for (int i=0;i<size;i++){
            if (array[i]==data){
                return true;

            }

        }
        return false;

    }

    public void clear() {
        Arrays.fill(array,null);
        size=0;
    }


    public void print() {

        T [] arrayPrint=(T[]) new Object[size];
        for (int i=0;i<size;i++){
            if (array[i]!=null){
                arrayPrint[i]=array[i];
            }
        }

        System.out.println(Arrays.toString(arrayPrint));


    }









}





