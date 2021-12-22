package max.value.Exception;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class BaseException {
    public static SendMessage handleEx(Update update){
        SendMessage msg = new SendMessage();
        msg.setChatId(update.getMessage().getChatId() + "");
        msg.setText("\uD83E\uDDD0 Something went wrong \uD83E\uDDD0");
        return msg;
    }
}
