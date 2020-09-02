package be.intecbrussel.student;

import be.intecbrussel.student.model.User;
import be.intecbrussel.student.service.UserDao;

import java.util.Optional;

public class UserApplication {


        private static UserDao userDao=new UserDao();

        // standard constructors

        public static void main(String[] args) {
            User user1 = getUser("siri");
            System.out.println(user1);
            updateUser(user1);
            saveUser(new User().setLogin("tanmay").setActive(false).setPassword("sammu"));
            deleteUser(getUser("pearl"));
           //getAllUsers().forEach(user -> System.out.println(user.getName()));
        }
    public static User getUser(String id) {
        Optional<User> user = userDao.get(id);
        return user.orElseGet(
                () -> new User());
    }




        public static void updateUser(User userToBeUpdated) {
            //find User TO BE replaced
            User UserToBeReplaced=getUser("shushan");
            User newUser=new User().setLogin("diana").setActive(false).setPassword("vidu");
            userDao.update(newUser);
        }

        public static void saveUser(User user) {
            userDao.save(user);
        }

        public static void deleteUser(User user) {
            userDao.delete(user);
        }
    }

