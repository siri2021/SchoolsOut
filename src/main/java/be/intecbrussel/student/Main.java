package be.intecbrussel.student;


import be.intecbrussel.student.model.User;

import be.intecbrussel.student.service.UserDao;




public class Main {
    public static void main(String[] args) {

        User user1=new User().setLogin("diya").setActive(false).setPassword("elsa");
        UserDao UserDao = new UserDao();
        UserDao.save(user1);






    }
}

