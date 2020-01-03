package tech.kuba.sda.systemDoLogowania.systemDoLogowania;

import javax.security.auth.login.LoginException;

class InvalidPasswordException extends LoginException {
    InvalidPasswordException(String invalidPassword) {
        super(invalidPassword);
    }
}
