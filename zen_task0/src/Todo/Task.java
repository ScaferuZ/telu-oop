package Todo;

public class Task {
  private int id;
  private String title;
  private String tags;
  private String description;
  private String status;
  private String projectName;

  public Task(
      int id, String title, String tags, String description, String status, String projectName) {
    this.id = id;
    this.title = title;
    this.tags = tags;
    this.description = description;
    this.status = status;
    this.projectName = projectName;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public String getStatus() {
    return status;
  }

  public String getProjectName() {
    return projectName;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setDescription(String desc) {
    this.description = desc;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  // Overiding default toString() method
  @Override
  public String toString() {
    return id + ", " + title + ", " + tags + ", " + description + ", " + status + ", " + projectName;
  }

}
