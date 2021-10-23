/*
Date 23-10-2021

In this Java tutorial, you will learn about difference between Abstract Based classes and Interfaces Based classes
You can create properties in Interfaces
You cannot modify the properties in Interfaces as they are final by-default
*/

interface tutorial_55_bicycle {

    void apply_brake();

    void accelerate(float percent_of_increasing_speed);

}

interface tutorial_55_blow_horn {

    void blow_horn_high_volume();

    void blow_horn_low_volume();

}

class tutorial_55_avon_cycle implements tutorial_55_bicycle, tutorial_55_blow_horn {

    public void blow_horn() {
        System.out.println("Blowing horn of Avon Cycle");
    }

    public void apply_brake() {
        System.out.println("Break applied in Avon Cycle");
    }

    public void accelerate(float percent_of_increasing_speed) {
        System.out.printf("%f percent speed is increased in Avon Cycle", percent_of_increasing_speed);
    }

    public void blow_horn_low_volume() {
        System.out.println("Blowing Low volume horn of Avon Cycle");
    }

    public void blow_horn_high_volume() {
        System.out.println("Blowing High volume horn of Avon Cycle");
    }

}

class tutorial_55_atlas_cycle implements tutorial_55_bicycle, tutorial_55_blow_horn {
    public void blow_horn() {
        System.out.println("Blowing horn of Atlas Cycle");
    }

    public void apply_brake() {
        System.out.println("Break applied in Atlas Cycle");
    }

    public void accelerate(float percent_of_increasing_speed) {
        System.out.printf("%f percent speed is increased in Atlas Cycle", percent_of_increasing_speed);
    }

    public void blow_horn_low_volume() {
        System.out.println("Blowing Low volume horn of Atlas Cycle");
    }

    public void blow_horn_high_volume() {
        System.out.println("Blowing High volume horn of Atlas Cycle");
    }
}

public class tutorial_55_1 {
    public static void main(String[] args) {

        tutorial_55_avon_cycle av_obj = new tutorial_55_avon_cycle();
        av_obj.blow_horn();
        av_obj.apply_brake();
        av_obj.accelerate(5.3f);
        System.out.print("\n\n");
        tutorial_55_atlas_cycle at_obj = new tutorial_55_atlas_cycle();
        at_obj.blow_horn();
        at_obj.apply_brake();
        at_obj.accelerate(7.9f);

    }
}
