import java.util.ArrayList;

public class Publication {
    private String name;
    private ArrayList<Media> media;
    public Publication(String name) {
        this.name = name;
        this.media = new ArrayList<>();
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addNewMedia(Media newMedia){
        this.media.add(newMedia);
    }
    public int countMedia(){
        return this.media.size();
    }
}
