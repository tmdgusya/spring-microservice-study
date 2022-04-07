package com.example.userservice.domain;

public final class UserJoinDomain {

    private final String name;
    private final Integer age;

    private final String STOP_WORD = "_";

    public UserJoinDomain(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public boolean hasStopWord() {
        return name.startsWith(STOP_WORD);
    }

}
