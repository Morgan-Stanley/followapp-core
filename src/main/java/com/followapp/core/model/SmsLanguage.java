package com.followapp.core.model;

import java.util.Arrays;

public enum SmsLanguage {
    ENGLISH,
    HINDI;

    public static SmsLanguage find(String value) {
        return Arrays.asList(values()).stream().filter(smsLanguage -> smsLanguage.name().equalsIgnoreCase(value))
                .findFirst().orElse(null);
    }
}
