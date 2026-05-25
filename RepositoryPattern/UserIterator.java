package RepositoryPattern;

import java.util.List;

import RepositoryPattern.repositories.UserRepository;
import RepositoryPattern.repositories.UserRepositoryImpl;

public class UserIterator implements Iterator<List<String>> {

    private UserRepository userRepository;
    private int limit = 1;
    private int offset = 0;
    private List<String> current;

    public UserIterator(int limit)
    {
        this.userRepository = new UserRepositoryImpl(null);
        this.limit = limit;
        this.current = userRepository.findUsers(limit, offset); 
    }

    @Override
    public boolean hasNext() {
        return current.size() > 0;
    }

    @Override
    public List<String> next() {
        List<String> result = current;
        this.offset += limit;
        this.current = userRepository.findUsers(limit, offset);
        return result;
    }
    
}
