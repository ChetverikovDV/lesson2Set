package Lesson2;

import java.util.HashSet;

public class HashTest {
    public HashSet<String> createHashSet(String array[]){
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < array.length; i++){
            hashSet.add(array[i]);
        }
return hashSet;
    }
}
