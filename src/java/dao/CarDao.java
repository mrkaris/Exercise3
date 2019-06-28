/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Car;

/**
 *
 * @author bestuser
 */
public class CarDao extends Database{
    private String server = "localhost:3306";
    private String database = "USERCAR";
    private String username = "root";
    private String password = "therootisonfire";

    public CarDao() {
        super();
    }

    public List<Car> getCars() {
        String query = "SELECT * FROM `USERCAR`.`cars`";
        Car st;
        List<Car> cars = new ArrayList<>();

        setOptions("?zeroDateTimeBehavior=convertToNull&serverTimezone=Europe/Athens&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false");
        ResultSet rs = Database(server, database, username, password, query);
        if (rs == null) {
            System.out.println("Error to the database");
        }
        try {
            System.out.println("LALA FROM GETCARS DAO");
            while (rs.next()) {
                st = new Car(rs.getInt("carID"), rs.getString("brand"),
                        rs.getString("model"), rs.getInt("horsepower"));
                cars.add(st);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return cars;
    }
}

 