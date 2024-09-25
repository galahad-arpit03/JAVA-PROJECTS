package video;

public class Video {
    private String videoName;
    private boolean checkout;
    private int rating;

    public Video(String name) {
        this.videoName = name;
        this.checkout = false;
        this.rating = 0; 
    }

    
    public String getName() {
        return videoName;
    }

   
    public void doCheckout() {
        checkout = true;
    }

 
    public void doReturn() {
        checkout = false;
    }

    public void receiveRating(int rating) {
        this.rating = rating;
    }


    public int getRating() {
        return rating;
    }

 
    public boolean getCheckout() {
        return checkout;
    }
}
