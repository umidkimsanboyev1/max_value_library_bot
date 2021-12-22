package max.value.Handles;

import org.telegram.telegrambots.meta.api.objects.CallbackQuery;

public class CallBackQueryHandle {
    private static CallBackQueryHandle instance = new CallBackQueryHandle();

    public void handle(CallbackQuery callbackQuery){

    }

    public static CallBackQueryHandle getInstance() {
        return instance;
    }


}
