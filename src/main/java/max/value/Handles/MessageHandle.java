package max.value.Handles;

import org.telegram.telegrambots.meta.api.objects.Message;

public class MessageHandle {
    private static MessageHandle instance = new MessageHandle();

    public void handle(Message message){

    }

    public static MessageHandle getInstance() {
        return instance;
    }
}
