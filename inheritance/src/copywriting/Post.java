package copywriting;

public abstract class Post {
    private String title;
    private String author;
    private String contentDescription;

    public Post(String title, String author, String contentDescription) {
        this.title = title;
        this.author = author;
        this.contentDescription = contentDescription;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public abstract String getContent();
}