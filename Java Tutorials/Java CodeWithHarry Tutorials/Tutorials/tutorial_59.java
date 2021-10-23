/*
Date 23-10-2021

In this Java tutorial, you will learn about Polymorphism in Interfaces and where to implement polymorphism.
*/

import java.util.concurrent.ThreadLocalRandom;

interface tutorial_59_camera {
    /*
     * Interface is been copied from tutorial_57's interface with name
     * "tutorial_59_camera"
     */
    tutorial_59_smart_phone take_photo();

    tutorial_59_smart_phone record_video();

    private void print_recording() {
        System.out.print("Recording");

    }

    default void record_4k_video() {
        print_recording();
        System.out.print(" 4k video!\n");
    }
}

interface tutorial_59_GPS {
    /*
     * Interface is been copied from tutorial_57's interface with name
     * "tutorial_59_GPS"
     */
    tutorial_59_smart_phone get_latitude();

    tutorial_59_smart_phone get_longitude();
}

interface tutorial_59_music_player {
    /*
     * Interface is been copied from tutorial_57's interface with name
     * "tutorial_59_music_player"
     */
    tutorial_59_smart_phone play_song();

    tutorial_59_smart_phone play_next_song();
}

interface tutorial_59_video_game {
    /*
     * Interface is been copied from tutorial_57's interface with name
     * "tutorial_59_video_game"
     */

    tutorial_59_smart_phone play_game();

    tutorial_59_smart_phone get_score();
}

class tutorial_59_cell_phone {
    /*
     * Class is been copied from tutorial_57's class with name
     * "tutorial_59_cell_phone"
     */

    void call_person(long phone_number) {
        System.out.println("Calling +91 " + phone_number);
    }

    void pick_call() {
        int phone_number_1 = ThreadLocalRandom.current().nextInt(10000, 99999);
        int phone_number_2 = ThreadLocalRandom.current().nextInt(10000, 99999);
        System.out.printf("Call picked up from +91 %d%d\n", phone_number_1, phone_number_2);
    }
}

class tutorial_59_smart_phone extends tutorial_59_cell_phone
        implements tutorial_59_camera, tutorial_59_GPS, tutorial_59_music_player, tutorial_59_video_game {
    /*
     * Class is been copied from tutorial_57's class with name
     * "tutorial_59_smart_phone"
     */

    public tutorial_59_smart_phone get_latitude() {
        int latitude_before_decimal = ThreadLocalRandom.current().nextInt(0, 361);
        int latitude_after_decimal = ThreadLocalRandom.current().nextInt(1, 999999);

        System.out.printf("Latitude is %d.%d\n", latitude_before_decimal, latitude_after_decimal);
        return this;
    }

    public tutorial_59_smart_phone get_longitude() {
        int longitude_before_decimal = ThreadLocalRandom.current().nextInt(0, 361);
        int longitude_after_decimal = ThreadLocalRandom.current().nextInt(1, 999999);

        System.out.printf("Longitude is %d.%d\n", longitude_before_decimal, longitude_after_decimal);
        return this;
    }

    public tutorial_59_smart_phone play_game() {
        System.out.printf("Starting Game.....\n");
        return this;
    }

    public tutorial_59_smart_phone get_score() {
        int score = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.printf("Your Score is %d out of 100\n", score);
        return this;
    }

    public tutorial_59_smart_phone play_song() {
        System.out.printf("Playing Song...\n");
        return this;
    }

    public tutorial_59_smart_phone play_next_song() {
        System.out.printf("Playing next Song...\n");
        return this;
    }

    public tutorial_59_smart_phone take_photo() {
        System.out.printf("Photo captured...\n");
        return this;
    }

    public tutorial_59_smart_phone record_video() {
        System.out.printf("Video recording started...\n");
        return this;
    }

}

public class tutorial_59 {
    public static void main(String[] args) {
        tutorial_59_camera camera = new tutorial_59_smart_phone();

        /*
         * The below after this comment will give an error because we made reference of
         * camera not of Smart Phone or music player
         */
        // ! camera.play_next_song();
        /*
         * The above before this comment will give an error because we made reference of
         * camera not of Smart Phone or music player
         */

        camera.take_photo().record_video();
        camera.record_4k_video();

    }
}
