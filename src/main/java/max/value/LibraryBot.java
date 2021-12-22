package max.value;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import static max.value.Handles.UpdateHandle.handle;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class LibraryBot extends TelegramLongPollingBot {
    private static final LibraryBot instance = new LibraryBot();

    public static LibraryBot getInstance() {
        return instance;
    }

    @Override
    public void onUpdateReceived(Update update) {
        handle(update);
    }

    public void executeMessage(BotApiMethod<?> msg) {
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
}
