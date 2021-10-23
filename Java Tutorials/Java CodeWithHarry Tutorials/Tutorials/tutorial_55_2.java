/*
Date 23-10-2021

In this Java tutorial, you will learn about difference between Abstract Based classes and Interfaces Based classes
You can create properties in Interfaces
You cannot modify the properties in Interfaces as they are final by-default
*/

public class tutorial_55_2 {
    public static void main(String[] args) {

        tutorial_55_avon_cycle av_obj = new tutorial_55_avon_cycle();
        av_obj.blow_horn_high_volume();
        av_obj.blow_horn_low_volume();
        System.out.print("\n\n");
        tutorial_55_atlas_cycle at_obj = new tutorial_55_atlas_cycle();
        at_obj.blow_horn_high_volume();
        at_obj.blow_horn_low_volume();

    }
}
