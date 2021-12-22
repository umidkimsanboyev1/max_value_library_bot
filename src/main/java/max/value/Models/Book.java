package max.value.Models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Book extends BaseModel {
    private String fileId;
    private String ownerId;
    private String size;
    private String type;
    private String downloadCount;
    private String filePath;

    public Book(Long id, String name, String fileId, String ownerId, String size, String type, String downloadCount, String filePath) {
        super(id, name);
        this.fileId = fileId;
        this.ownerId = ownerId;
        this.size = size;
        this.type = type;
        this.downloadCount = downloadCount;
        this.filePath = filePath;
    }
}
