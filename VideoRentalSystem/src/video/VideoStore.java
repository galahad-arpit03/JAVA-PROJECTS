package video;

import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Video> store = new ArrayList<>();

    public void addVideo(String name) {
        Video video = new Video(name);
        store.add(video);
        System.out.println("Video \"" + name + "\" added successfully.");
    }

    public void doCheckout(String name) {
        for (Video video : store) {
            if (video.getName().equalsIgnoreCase(name)) {
                video.doCheckout();
                System.out.println("Video \"" + name + "\" checked out successfully.");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found.");
    }

    public void doReturn(String name) {
        for (Video video : store) {
            if (video.getName().equalsIgnoreCase(name)) {
                video.doReturn();
                System.out.println("Video \"" + name + "\" returned successfully.");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found.");
    }

    public void receiveRating(String name, int rating) {
        for (Video video : store) {
            if (video.getName().equalsIgnoreCase(name)) {
                video.receiveRating(rating);
                System.out.println("Rating \"" + rating + "\" has been mapped to the video \"" + name + "\".");
                return;
            }
        }
        System.out.println("Video \"" + name + "\" not found.");
    }

    public void listInventory() {
        System.out.println("Video Name\t| Checkout Status\t| Rating");
        for (Video video : store) {
            System.out.println(video.getName() + "\t| " + (video.getCheckout() ? "Checked out" : "Available") + "\t| " + video.getRating());
        }
    }
}
