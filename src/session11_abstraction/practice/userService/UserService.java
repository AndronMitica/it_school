package session11_abstraction.practice.userService;

public interface UserService {
    /**
     * Creates a user
     * @param user
     */
    void createUser(User user);

    /**
     *
     * @param id
     * @return
     */
    User findUsedById(long id);

    void deleteUser(long id);
}
