package copywriting;

public class Tiktok extends Post {
    private String videoUrl;
    private String contentDescription;
    private String tags;

    public Tiktok(String title, String author, String tags, String contentDescription, String videoUrl) {
        super(title, author, contentDescription);
        this.tags = tags;
        this.videoUrl = videoUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public String getTags() {
        return tags;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    @Override
    public String getContent() {
        return videoUrl;
    }
}