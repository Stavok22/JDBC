/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package jdbc;

import services.Database;
import services.DatabaseQueryService;



public class App {


    public static void main(String[] args)  {
        Database database = Database.getInstanse();
        DatabaseQueryService databaseQueryService = new DatabaseQueryService();

        System.out.println(databaseQueryService.findLongestProject(database));
        System.out.println(databaseQueryService.findMaxSalaryWorker(database));
        System.out.println(databaseQueryService.findMaxProjectCountClient(database));
        System.out.println(databaseQueryService.findProjectPrices(database));
        System.out.println(databaseQueryService.findYoungestEldestWorkers(database));
    }
}
