package Lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String[] persones = new String[7];
        persones[0] = "Sheldon";
        persones[1] = "Leonard";
        persones[2] = "Radj";
        persones[3] = "Hovard";
        persones[4] = "Penny";
        persones[5] = "Bernadet";
        persones[6] = "Amy";
        System.out.println(Arrays.toString(persones));

        HashTest test = new HashTest();
        test.createHashSet(persones);

        System.out.println(test);
    }
}
