package be.intecbrussel.student;

import be.intecbrussel.student.model.Course;
import be.intecbrussel.student.model.GENDER;
import be.intecbrussel.student.model.Module;
import be.intecbrussel.student.model.Person;
import be.intecbrussel.student.service.CourseDao;
import be.intecbrussel.student.service.ModuleDao;
//need to make changes
import java.util.Optional;

public class ModuleApplication {
    private static ModuleDao moduleDao=new ModuleDao();

    // standard constructors

    public static void main(String[] args) {

        Module module1=new Module().setName("mod#1").setDescription("Science");
        System.out.println(module1);
        saveModule(module1);
        Module module2= getModule(9);

        deleteModule(module2);
        Module module= getModule(10);

        Module moduleToBeUpdated=new Module().setName("mod#1").setDescription("science");
        Module moduleToBeReplaced=getModule(moduleToBeUpdated.getId());
        updateModule(moduleToBeUpdated);


    }


    private static void deleteModule(Module module) {
        moduleDao.delete(module);
    }


    private static Module getModule(Integer id) {
        Optional<Module> module = moduleDao.get(id);
        return module.orElseGet(
                () -> new Module());
    }

    private static void saveModule(Module module) {
        moduleDao.save(module);
    }






    public static void updateModule(Module moduleToBeUpdated) {
        //find User TO BE replaced



        moduleDao.update(moduleToBeUpdated);
    }



}

