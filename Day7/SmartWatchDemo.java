
interface Camera {

    void clickPhoto();
}

interface GPS {

    void trackLocation();
}

class SmartWatch implements Camera, GPS {

    public void clickPhoto() {
        System.out.println("Photo clicked");
    }

    public void trackLocation() {
        System.out.println("Tracking location...");
    }
}

public class SmartWatchDemo {

    public static void main(String[] args) {

        SmartWatch watch = new SmartWatch();

        watch.clickPhoto();
        watch.trackLocation();
    }
}
