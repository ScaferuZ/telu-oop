package copywriting;

public class Linkedin extends Post {
    private String linkUrl;

    public Linkedin(String title, String author, String contentDescription, String linkUrl) {
        super(title, author, contentDescription);
        this.linkUrl = linkUrl;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    @Override
    public String getContent() {
        return linkUrl;
    }
}