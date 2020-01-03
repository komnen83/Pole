package tech.kuba.sda.systemDoLogowania.systemDoLogowania;

import javax.security.auth.login.LoginException;

class UnknownUserException extends LoginException {
    UnknownUserException(String unknownUser) {
        super(unknownUser);
    }
}
