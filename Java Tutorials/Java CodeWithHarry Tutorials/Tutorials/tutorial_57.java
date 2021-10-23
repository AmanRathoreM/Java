
/*
Date 23-10-2021

In this Java tutorial, we will see examples of Interfaces and Default methods
Java 8 has introduced the concept of default methods which allow the interfaces to have methods with implementation without affecting the classes that implement the interface. Default methods are also known as defender methods or virtual extension methods. You can define Default methods int interface itself
*/

import java.util.concurrent.ThreadLocalRandom;

interface tutorial_57_camera {
    tutorial_57_smart_phone take_photo();

    tutorial_57_smart_phone record_video();

    private void print_recording() {
        System.out.print("Recording");

    }

    default void record_4k_video() {
        print_recording();
        System.out.print(" 4k video!\n");
    }
}

interface tutorial_57_GPS {
    tutorial_57_smart_phone get_latitude();

    tutorial_57_smart_phone get_longitude();
}

interface tutorial_57_music_player {
    tutorial_57_smart_phone play_song();

    tutorial_57_smart_phone play_next_song();
}

interface tutorial_57_video_game {

    tutorial_57_smart_phone play_game();

    tutorial_57_smart_phone get_score();
}

class tutorial_57_cell_phone {

    void call_person(long phone_number) {
        System.out.println("Calling +91 " + phone_number);
    }

    void pick_call() {
        int phone_number_1 = ThreadLocalRandom.current().nextInt(10000, 99999);
        int phone_number_2 = ThreadLocalRandom.current().nextInt(10000, 99999);
        System.out.printf("Call picked up from +91 %d%d\n", phone_number_1, phone_number_2);
    }
}

class tutorial_57_smart_phone extends tutorial_57_cell_phone
        implements tutorial_57_camera, tutorial_57_GPS, tutorial_57_music_player, tutorial_57_video_game {

    public tutorial_57_smart_phone get_latitude() {
        int latitude_before_decimal = ThreadLocalRandom.current().nextInt(0, 361);
        int latitude_after_decimal = ThreadLocalRandom.current().nextInt(1, 999999);

        System.out.printf("Latitude is %d.%d\n", latitude_before_decimal, latitude_after_decimal);
        return this;
    }

    public tutorial_57_smart_phone get_longitude() {
        int longitude_before_decimal = ThreadLocalRandom.current().nextInt(0, 361);
        int longitude_after_decimal = ThreadLocalRandom.current().nextInt(1, 999999);

        System.out.printf("Longitude is %d.%d\n", longitude_before_decimal, longitude_after_decimal);
        return this;
    }

    public tutorial_57_smart_phone play_game() {
        System.out.printf("Starting Game.....\n");
        return this;
    }

    public tutorial_57_smart_phone get_score() {
        int score = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.printf("Your Score is %d out of 100\n", score);
        return this;
    }

    public tutorial_57_smart_phone play_song() {
        System.out.printf("Playing Song...\n");
        return this;
    }

    public tutorial_57_smart_phone play_next_song() {
        System.out.printf("Playing next Song...\n");
        return this;
    }

    public tutorial_57_smart_phone take_photo() {
        System.out.printf("Photo captured...\n");
        return this;
    }

    public tutorial_57_smart_phone record_video() {
        System.out.printf("Video recording started...\n");
        return this;
    }

    // public void record_4k_video() {
    // System.out.printf("Recording 4k video in Smart Phone!\n");
    // }
}

public class tutorial_57 {
    public static void main(String[] args) {

        tutorial_57_smart_phone iphone_13 = new tutorial_57_smart_phone();
        iphone_13.get_longitude().get_latitude();
        iphone_13.play_game().get_score();
        iphone_13.take_photo().record_video();
        iphone_13.pick_call();
        iphone_13.call_person(7854397458L);
        iphone_13.play_song().play_next_song();
        iphone_13.record_4k_video();

    }
}
