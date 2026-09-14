package project.lybrary.domain.library;
import project.lybrary.domain.common.tool.idgenerator.contract.IdGenerator;

public class Author {

    private String name;
    private String id;

    public Author(String name, IdGenerator idGenerator) {
        this.name = name;
        this.id = idGenerator.generate();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

}
