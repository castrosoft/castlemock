package com.fortmocks.core.model.user.message;

import com.fortmocks.core.model.Output;
import com.fortmocks.core.model.user.dto.UserDto;
import com.fortmocks.core.model.validation.NotNull;

/**
 * @author Karl Dahlgren
 * @since 1.0
 */
public class SaveUserOutput implements Output {

    @NotNull
    private UserDto savedUser;

    public UserDto getSavedUser() {
        return savedUser;
    }

    public void setSavedUser(UserDto savedUser) {
        this.savedUser = savedUser;
    }
}
