package max.value;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@NoArgsConstructor (access = AccessLevel.PRIVATE)
public class LibraryBot extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        SendMessage msg = new SendMessage();
        msg.setChatId(update.getMessage().getChatId().toString());
        msg.setText("TEST");
        try {
            executeAsync(msg);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String getBotUsername() {
        return "@mv_library_bot";
    }

    @Override
    public String getBotToken() {
        return "5008623077:AAHhi81e-FvSxg0UNsaIA5Kak7EZnZOteZo";
    }

    private static LibraryBot instance = new LibraryBot();

    public static LibraryBot getInstance() {
        return instance;
    }
}
