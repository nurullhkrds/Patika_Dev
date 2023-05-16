public interface IMyList <T>{
    int size();
    int getCapacity();
    void add(T data);
    T get(int index);
    T remove(int index);
    T set(int index, T data);
    int indexOf(T data);
    boolean isEmpty();
    T[] toArray();
    MyList<T> subList(int start, int finish);
    boolean contains(T data);

}
