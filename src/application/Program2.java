package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class Program2 {

    public static void main(String[] args) {

    DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

    System.out.println("=== TEST 1: department findById =====");
        Department department = departmentDao.findById(2);
        System.out.println(department);

        System.out.println("=== TEST 2: department findAll =====");
        List<Department> list = departmentDao.findAll();
        for (Department obj: list) {
            System.out.println(obj);
        }

        System.out.println("=== TEST 3: department insert =====");
        Department newDepartment = new Department(5, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());




}
    }