package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args) {
        HashMap<String, String> map=createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);

    }

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map=new HashMap<String, String>();

        map.put("Solovei1","Volody1");
        map.put("Solovei2","Volody");
        map.put("Solovei3","Volody3");
        map.put("Solovei4","Volody4");
        map.put("Solovei5","Volody5");
        map.put("Solovei6","Volody");
        map.put("Solovei7","Volody7");
        map.put("Solovei8","Volody8");
        map.put("Solovei9","Volody");
        map.put("Solovei0","Volody0");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair1:copy.entrySet()) {
            for (Map.Entry<String, String> pair2:copy.entrySet()) {
                if (pair1.getValue().equals(pair2.getValue())&&!pair1.getKey().equals(pair2.getKey()))
                {removeItemFromMapByValue(map,pair1.getValue());}
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
