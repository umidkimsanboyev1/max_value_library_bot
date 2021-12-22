package max.value.Handles;

import max.value.LibraryBot;
import org.telegram.telegrambots.meta.api.objects.Update;

import static max.value.Exception.BaseException.handleEx;

public class UpdateHandle {
    private static MessageHandle messageHandle = MessageHandle.getInstance();
    private static CallBackQueryHandle callBackQueryHandle = CallBackQueryHandle.getInstance();
    private static LibraryBot BOT = LibraryBot.getInstance();

    public static void handle(Update update) {
        if (update.hasMessage()) messageHandle.handle(update.getMessage());
        else if (update.hasCallbackQuery()) callBackQueryHandle.handle(update.getCallbackQuery());
        else {
            BOT.executeMessage(handleEx(update));
        }
    }
}
