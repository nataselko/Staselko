public class Book {
    private String namebook;
    private Avtor avtor;


    public void setNamebook(String namebook) {
        this.namebook = namebook;
    }

    public Book(String namebook) {
        this.namebook = namebook;

    }

    public String getNamebook() {
        return namebook;
    }

    public Avtor getAvtor() {
        return avtor;
    }

    public void setAvtor(Avtor avtor) {
        this.avtor = avtor;
    }
}

class Avtor {
    private String name;

    public Avtor(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}


