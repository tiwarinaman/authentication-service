package com.techienaman.authenticationservice.email;

public interface EmailSender {
    void send(String to, String email);
}
