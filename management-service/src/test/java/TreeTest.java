import com.google.gson.Gson;

import java.util.LinkedList;
import java.util.TreeSet;

/**
 * @author lizhe
 */
public class TreeTest {

    public static void main(String[] args) {


        TreeSet treeSet = new TreeSet();
        treeSet.add("123");

        treeSet.add("222");

        treeSet.add("333");


        Gson gson = new Gson();
        gson.toJson(treeSet);
        System.out.print(treeSet);
    }
}
