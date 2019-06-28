/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.CarDao;
import java.util.List;
import models.Car;

/**
 *
 * @author bestuser
 */
public class CarService {
    
    CarDao cdao = new CarDao();
    
    public String getCars() {

        CarDao stuDao = new CarDao();
        List<Car> cars = stuDao.getCars();
        StringBuilder strB = new StringBuilder();

        strB.append("<!DOCTYPE html>")
                .append("<html>")
                .append("<head>")
                .append("<title>My First Servlet</title>")
                .append("</head>")
                .append("<body>");
        for (Car s : cars) {
                        strB.append("<p>").append(s).append("</p>");
        }
        strB.append("<div>Click <a href=\"login.html\">Logout</a></div>");
        strB.append("</body>")
                .append("</html>");

        return strB.toString();
    }
    
}
