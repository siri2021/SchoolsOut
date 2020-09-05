package be.intecbrussel.student;

import be.intecbrussel.student.model.User;
import be.intecbrussel.student.repos.UserDao;

import java.util.Optional;

public class UserApplication {

        private static UserDao userDao=new UserDao();

        // standard constructors

        public static void main(String[] args) {
           User user1 = getUser("tanmay");
            System.out.println(user1);
          //  updateUser(user1);
            //saveUser(new User().setLogin("pavani").setActive(false).setPassword("chandu"));

            deleteUser(getUser("diana"));
           //getAllUsers().forEach(user -> System.out.println(user.getName()));
        }
    public static User getUser(String id) {
        Optional<User> user = userDao.get(id);
        return user.orElseGet(
                () -> new User());
    }




        public static void updateUser(User userToBeUpdated) {
            //find User TO BE replaced
            User UserToBeReplaced=getUser(userToBeUpdated.getLogin());
            User newUser=new User().setLogin("prasanna").setActive(false).setPassword("vinod");
            userDao.update(newUser);
        }

        public static void saveUser(User user) {
            userDao.save(user);
        }

        public static void deleteUser(User user) {
            userDao.delete(user);
        }
    }

