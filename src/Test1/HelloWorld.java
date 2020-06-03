package Test1;

import com.sun.imageio.plugins.jpeg.JPEGStreamMetadataFormat;

import java.util.ArrayList;
import java.util.Arrays;

//这是单行注释
/*
这是多行注释
 */
public class HelloWorld<syso> {
    public static void main(String[] args) {

        System.out.println("Helloworld!");
        ArrayList<String> list=new ArrayList<>();
        System.out.println();
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("HelloWorld.main");
        System.out.println("list = " + list);
        String[] arr=new String[]{"aaa","vvv","www"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //iter
        for (String s : arr) {
            System.out.println(s);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }
        ArrayList<Object> list1 = new ArrayList<>();
        list1.add("123");
        list1.add("33w");
        list1.add("qqq");
        list1.forEach(item->{
            System.out.println(item);
        });
        list1.forEach(i->{
            System.out.println(i);
        });
        if (list1 == null) {

        }
        if (list1 != null) {

        }
        if (list1 != null) {

        }
        if (list == null) {

        }

    }
    public static final String QS="q";

}
