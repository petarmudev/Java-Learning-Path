package Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant;


import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.core.ControllerImpl;
import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.core.EngineImpl;
import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.core.interfaces.Controller;
import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.entities.drinks.interfaces.Beverages;
import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.entities.healthyFoods.interfaces.HealthyFood;
import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.entities.tables.interfaces.Table;
import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.io.ConsoleReader;
import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.io.ConsoleWriter;
import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.repositories.BeverageRepositoryImpl;
import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.repositories.HealthFoodRepositoryImpl;
import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.repositories.TableRepositoryImpl;
import Exam_RetakeExam15Aug2021.Task01_HighQualityStructure.restaurant.repositories.interfaces.*;
public class Main {
    public static void main(String[] args) {
        // TODO: Optional - Create new instances for all repositories to test your code locally.

        HealthFoodRepository<HealthyFood> healthFoodRepository = new HealthFoodRepositoryImpl();
        BeverageRepository<Beverages> beverageRepository = new BeverageRepositoryImpl();
        TableRepository<Table> tableRepository = new TableRepositoryImpl();


        Controller controller = new ControllerImpl(healthFoodRepository, beverageRepository, tableRepository);

        ConsoleReader reader = new ConsoleReader();
        ConsoleWriter writer = new ConsoleWriter();
        EngineImpl engine = new EngineImpl(reader, writer, controller);
        engine.run();


    }
}
