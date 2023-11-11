package org.example;



import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

import java.sql.*;


public class DB_INSERT {
    private static Logger logger = Logger.getLogger(DB_INSERT.class);
    static {
        SimpleLayout simpleLayout = new SimpleLayout();
        ConsoleAppender consoleAppender = new ConsoleAppender(simpleLayout);
        logger.addAppender(consoleAppender);
        logger.setLevel(Level.ALL);

    }
    public static void main(String[] args) {
        logger.debug("Main Class Started");
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            logger.debug("Database software Driver Loaded");
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe","employeetable","employee");
            logger.info("Connection established with database s/w");
            Statement statement = connection.createStatement();
            logger.debug("statement object created");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM realtimedi_customer");
            logger.info("resultset data fetched fron database");
            while (resultSet.next()){
                System.out.println("-------------------------");
                System.out.println("Employee ID: " + resultSet.getInt(1));
                System.out.println("Employee Name: " + resultSet.getString(2));
                System.out.println("Employee Address: " + resultSet.getString(3));
                System.out.println("Employee Principle: " + resultSet.getFloat(4));
                System.out.println("Employee Time: " + resultSet.getFloat(5));
                System.out.println("Employee Rate: " + resultSet.getFloat(6));
                System.out.println("Employee Amount: " + resultSet.getFloat(7));
            }
            logger.debug("resultset data printed in console");

            resultSet.close();
            logger.debug("result object set closed");
            statement.close();
            logger.debug("statement object set closed");

        }catch (ClassNotFoundException e){
            logger.error("Problem in loading the driver " + e.getMessage()+ "-"+ e.getLocalizedMessage());
            e.printStackTrace();
        }catch (SQLException e){
            logger.error("Problem in fetching sql query from database " + e.getMessage()+ "-"+ e.getLocalizedMessage());
            e.printStackTrace();
        }catch (Exception e){
            logger.fatal("Other unknown exception generated "+ e.getMessage()+ "-"+ e.getLocalizedMessage());
            e.printStackTrace();
        }

        logger.debug("Main class End");
    }
}
