package com.mdigital;

import java.util.ArrayList;

public class ArrayMethodClass {
    static void main() {
        ArrayList<String> bus = new ArrayList<>();
        bus.add("Ryan");
        bus.add("Brandon");
        bus.add("Rebecca");
        bus.add("Richard");
        bus.add("Jessica");
        bus.add("Brian");
        bus.add("Antoinne");
        bus.add("Grace");
        bus.add("Zee");
        bus.add("Ibrahim");


        System.out.println("Ibrahim feels unwell and asks if he can sit at the back of the bus. Move Ibrahim to the back.\n");
        System.out.println(bus);
        bus.remove("Ibrahim");
        bus.addFirst("Ibrahim");
        System.out.println(bus);

        System.out.println("Rebecca is singing and upsetting the rest. To resolve this, move Rebecca to the front of the bus \n");
        System.out.println(bus);
        bus.remove("Rebecca");
        bus.addLast("Rebecca");
        System.out.println(bus);

        System.out.println("Richard and Antoinne are best friends and are talking loudly across the bus. The teacher has decided it's best to separate them. Move Richard to sit behind Antoinne.\n");
        System.out.println(bus);
        bus.remove("Richard");
        bus.add(5, "Richard ");
        System.out.println(bus);

        System.out.println("Ryan wants to sit at the front where he can enjoy the trip more. However, Rebecca must remain right at the front. Rearrange the array to move Ryan directly behind Rebecca\n");
        System.out.println(bus);
        bus.remove("Ryan");
        bus.add(8, "Ryan");
        System.out.println(bus);
    }
}
