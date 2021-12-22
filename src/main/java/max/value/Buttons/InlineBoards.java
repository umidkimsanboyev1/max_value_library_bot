package max.value.Buttons;

import max.value.Emojis.Emojis;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.Arrays;
import java.util.List;

/**
 * @author Elmurodov Javohir, Fri 12:09 PM. 12/17/2021
 */
public class InlineBoards {
    private static final InlineKeyboardMarkup board = new InlineKeyboardMarkup();

    public static InlineKeyboardMarkup languageButtons(String... caption) {
        InlineKeyboardButton uz = new InlineKeyboardButton(Emojis.UZ + " Uzbek");
        uz.setCallbackData("uz");

        InlineKeyboardButton ru = new InlineKeyboardButton(Emojis.RU + " Russian");
        ru.setCallbackData("ru");

        InlineKeyboardButton en = new InlineKeyboardButton(Emojis.EN + " English");
        en.setCallbackData("en");
        board.setKeyboard(Arrays.asList(getRow(uz), getRow(ru), getRow(en)));
        return board;
    }

    public static ReplyKeyboard gender() {
        InlineKeyboardButton male = new InlineKeyboardButton(Emojis.MALE+ " Male");
        male.setCallbackData("male");

        InlineKeyboardButton female = new InlineKeyboardButton(Emojis.FEMALE + " Female");
        female.setCallbackData("female");

        board.setKeyboard(Arrays.asList(getRow(male), getRow(female)));
        return board;
    }


    private static List<InlineKeyboardButton> getRow(InlineKeyboardButton... buttons) {
        return Arrays.stream(buttons).toList();
    }
}
