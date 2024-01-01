package com.dextracodes.propertymgt.service;

import com.dextracodes.propertymgt.model.UserDTO;

public interface UserService {
    UserDTO register(UserDTO userDTO);
    UserDTO login(String email, String password);
}
