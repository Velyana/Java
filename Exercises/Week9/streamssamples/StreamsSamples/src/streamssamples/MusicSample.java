package streamssamples;

import java.util.ArrayList;
import java.util.List;

 
public abstract class MusicSample {
    
    protected final List<Artist> artists;
    protected final List<Album> albums;

    public MusicSample() {
        artists = new ArrayList<>();
        albums = new ArrayList<>();
        loadData("");
    }

    private void loadData(String file) {
        
    }
    
}