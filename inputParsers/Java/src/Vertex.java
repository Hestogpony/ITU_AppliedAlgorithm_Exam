import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String id;
    private Vertex prev = new Vertex();
    private List<Vertex> adjVertices = new ArrayList<>();

    Vertex() {
    }

    public Vertex(String id, Vertex prev, List<Vertex> adjVertices) {
        this.id = id;
        this.prev = prev;
        this.adjVertices = adjVertices;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Vertex getPrev() {
        return prev;
    }

    public void setPrev(Vertex prev) {
        this.prev = prev;
    }

    public List<Vertex> getAdjVertices() {
        return adjVertices;
    }

    public void setAdjVertices(List<Vertex> adjVertices) {
        this.adjVertices = adjVertices;
    }
}
