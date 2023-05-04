package arraylist;

import java.util.Arrays;

public class ArrayList implements List {

    int[] numberArray = new int[10];

    @Override
    public boolean isEmpty() {
        int count = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] != 0) {
                count++;
            }
        }
        if (count == 0) {
            return true;
        } else return false;
    }

    @Override
    public void add(int value) {
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == 0) {
                numberArray[i] = value;
                return;
            }

        }
    }

    @Override
    public void remove(int value) {
        int count = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (value == numberArray[i]) {
                count++;
            }
        }
        if (count == 0) {
            throw new IllegalArgumentException("item is not found");
        }


        numberArray[0] = 0;

    }

    @Override
    public int size() {
        int count = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] > 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int get(int index) {
        return numberArray[index];
    }

    @Override
    public void add(int value, int index) {
        if (numberArray[index] > 0) {

            for (int i = index; i < numberArray.length - 1; i++) {
                numberArray[i + 1] = numberArray[i+1];
            }
            numberArray[index] = value;
            System.out.println(Arrays.toString(numberArray));
            return;
        }
        numberArray[index] = value;

    }

    @Override
    public int getIndexOf(int value) {
        return 0;
    }

    @Override
    public int getCapacity() {
        return 0;
    }
}
