package Collection.Set.LinkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<String> s = new LinkedHashSet<String>();

        s.add("34");
        s.add("67");
        s.add("1");

        Iterator<String> it = s.iterator();

        while (it.hasNext()) {
            String s1 = it.next();
            System.out.println(s1);
        }
    }
}