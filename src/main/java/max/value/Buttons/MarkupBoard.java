package max.value.Buttons;

import max.value.Emojis.Emojis;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboard;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.List;

/**
 * @author Elmurodov Javohir, Fri 12:09 PM. 12/17/2021
 */
public class MarkupBoard {
    private static final ReplyKeyboardMarkup board = new ReplyKeyboardMarkup();


    public static ReplyKeyboardMarkup sharePhoneNumber() {
        KeyboardButton phoneContact = new KeyboardButton(Emojis.PHONE + " Share Phone Number");
        phoneContact.setRequestContact(true);
        board.setResizeKeyboard(true);
        board.setSelective(true);
        KeyboardRow row = new KeyboardRow();
        row.add(phoneContact);
        board.setKeyboard(List.of(row));
        return board;
    }

    public static ReplyKeyboard mainMenu() {
        KeyboardRow row1 = new KeyboardRow();
        row1.add(new KeyboardButton(Emojis.SEARCH + "search book"));
        row1.add(new KeyboardButton(Emojis.CONTACT + "contact admin"));

        KeyboardRow row2 = new KeyboardRow();
        row2.add(new KeyboardButton(Emojis.BOOKS + "my books"));
        row2.add(new KeyboardButton(Emojis.ADD + "add book"));

        KeyboardRow row3 = new KeyboardRow();
        row3.add(new KeyboardButton(Emojis.SETTINGS + " Settings"));

        board.setKeyboard(List.of(row1, row2, row3));
        board.setResizeKeyboard(true);
        board.setSelective(true);
        return board;
    }
}
