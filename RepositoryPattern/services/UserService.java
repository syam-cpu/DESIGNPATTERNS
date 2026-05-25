package RepositoryPattern.services;

import java.util.List;

import RepositoryPattern.Iterator;
import RepositoryPattern.UserIterator;
import RepositoryPattern.repositories.UserRepository;
import RepositoryPattern.repositories.UserRepositoryImpl;

public class UserService {
    
    //private final UserRepository userRepository;
    private final Iterator<List<String>> userIterator;

    public UserService(UserRepository userRepository)
    {
        //this.userRepository = new UserRepositoryImpl();
        this.userIterator = new UserIterator(10);
    }

    public void getUsersOnPlatform()
    {
        //1. the service layer has to keep track of current offset 
        //2. where ever this pagination is required we need to maintain offset there.
        //3. we dont know went to stop ? we might have to write a custom logic to check if no more data is there.
        
        //this.userRepository.findUsers(10, 1);

        while (userIterator.hasNext())
        {
            List<String> users = userIterator.next();
            System.out.println(users);
        }
    }
}
