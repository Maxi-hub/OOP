import java.util.Collections;

public class StreamService {
    private Stream stream;

    public Stream SortListStream(Stream stream) {
        Collections.sort(stream.getStudentGroups(), new StreamComparator());
        return stream;
    }

    public StreamService() { stream = new Stream();}


}





