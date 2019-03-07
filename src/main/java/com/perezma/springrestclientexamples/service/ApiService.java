package com.perezma.springrestclientexamples.service;

import com.perezma.api.domain.User;

import java.util.List;

public interface ApiService {
    List<User> getUsers(Integer limit);
}
