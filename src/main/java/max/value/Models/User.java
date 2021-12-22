package max.value.Models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class User extends BaseModel{
    private String chatId;
    private String fullName;
    private String username;
    private String phoneNumber;
    private String language;
    private String state;

    public User(Long id, String name, String chatId, String fullName, String username, String phoneNumber, String language, String state) {
        super(id, name);
        this.chatId = chatId;
        this.fullName = fullName;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.language = language;
        this.state = state;
    }
}
