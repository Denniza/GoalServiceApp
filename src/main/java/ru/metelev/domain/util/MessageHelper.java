package ru.metelev.domain.util;

import ru.metelev.domain.User;

public abstract class MessageHelper {
    public static String getAuthorName(User user){
        return user !=null?user.getUsername():"<none>";
    }
}
