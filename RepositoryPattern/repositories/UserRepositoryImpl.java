package RepositoryPattern.repositories;

import java.util.List;

import RepositoryPattern.InMemoryDatabase;

public class UserRepositoryImpl implements UserRepository {

    private InMemoryDatabase db;

    public UserRepositoryImpl(InMemoryDatabase db)
    {
        this.db = db;
    }

    @Override
    public List<String> findUsers(int limit, int offset) {
        List<String> allUsers = db.getUsers();
        int start = (offset-1) * limit; // start of the paginated data.
        int end = Math.min(start+limit, allUsers.size()); // end of the paginated data

        if (start >= allUsers.size())
        {
            return List.of();
        }

        return allUsers.subList(start, end);
    }
}
