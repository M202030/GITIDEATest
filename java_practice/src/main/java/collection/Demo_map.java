package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author boqingbaba
 * @create 2020-12-20-16:49
 */


public class Demo_map {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(11,"张三");
        map.put(22,"郭靖");
        map.put(33,"杨康");
        System.out.println(map);

        map.put(44,"g郭靖");
        System.out.println(map);

        map.put(null,null);
        System.out.println(map);

        map.put(11,"张三丰");
        System.out.println(map);

        System.out.println(map.size());
        System.out.println(map.containsKey(22));
        System.out.println(map.containsValue("张三丰"));

        map.remove(44);
        System.out.println(map);

        Set<Integer> integers = map.keySet();
        System.out.println(integers);

        map.replace(66,"空");


        Collection<String> values = map.values();
        System.out.println(values);

      /*  map.clear();
        System.out.println(map.size());
        System.out.println(map.isEmpty());
*/

    }

}
