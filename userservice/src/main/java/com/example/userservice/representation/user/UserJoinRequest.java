package com.example.userservice.representation.user;

public final class UserJoinRequest {

    private final String name;
    private final Integer age;

    public UserJoinRequest(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
