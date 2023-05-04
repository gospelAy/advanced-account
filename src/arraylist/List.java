package arraylist;

public interface List {

    boolean isEmpty();

    void add(int value);

    void remove(int value);

    int size();

    int get(int index);

    void add(int value, int index);

    int getIndexOf(int value);

    int getCapacity();
}
