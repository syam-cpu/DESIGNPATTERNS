package RepositoryPattern.services;

import RepositoryPattern.repositories.UserRepository;
import RepositoryPattern.repositories.UserRepositoryImpl;

public class UserService {
    
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository)
    {
        this.userRepository = new UserRepositoryImpl();
    }

    public void getUsersOnPlatform()
    {
        //1. the service layer has to keep track of current offset 
        //2. where ever this pagination is required we need to maintain offset there.
        //3. we dont know went to stop ? we might have to write a custom logic to check if no more data is there.
        
        this.userRepository.findUsers(10, 1);
    }
}
