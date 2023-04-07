package com.fedyushkin.dto;

import java.io.Serial;
import java.io.Serializable;

public record LoginData (String login, String password) implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
}
