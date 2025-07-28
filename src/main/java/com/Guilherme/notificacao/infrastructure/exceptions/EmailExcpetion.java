package com.Guilherme.notificacao.infrastructure.exceptions;

public class EmailExcpetion extends RuntimeException {
    public EmailExcpetion(String message) {
        super(message);
    }

  public EmailExcpetion(String message, Throwable cause) {
    super(message, cause);
  }
}
