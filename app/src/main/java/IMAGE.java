public class IMAGE
@Entity(tableName = "notes")
public class Note {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;
    private String content;
    private String imageUri; // To store the image's URI

    public Note(String title, String content, String imageUri) {
        this.title = title;
        this.content = content;
        this.imageUri = imageUri;
    }

    // Getters and Setters
    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }
}{
}
