package copywriting;

public class Instagram extends Post {
    private String imageUrl;

    public Instagram(String title, String author, String contentDescription, String imageUrl) {
        super(title, author, contentDescription);
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String getContent() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return "Instagram{" +
                "imageUrl='" + imageUrl + '\'' +
                '}';
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setImageUrl(String imageUrl, String password) {
        if (password.equals("123")) {
            this.imageUrl = imageUrl;
        }
    }

}