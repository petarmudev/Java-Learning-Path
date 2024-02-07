package L17_Generics_Task02_ArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator {
    public static <T> T[] create(int lenght, T item) {  //Тук не трябва да подадем клас на метода
        // , а взимаме класа от променливата item
        int length = lenght;
        T[] array = (T[]) Array.newInstance(item.getClass(), length); //newInstance е премахната след Java 11,
        //точно заради тоя миш-маш при работата с нея!
        for (int i = 0; i < lenght; i++) {
            array[i] = item;
        }
        return array;
    }


    public static <T> T[] create(Class<T> myClass, int length, T item) {    //Тук трябва да подадем клас на метода
        @SuppressWarnings("unchecked")              //Because .newInstance is removed from JDK 11 onwards
        T[] array = (T[]) Array.newInstance(myClass, length);
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }


}
