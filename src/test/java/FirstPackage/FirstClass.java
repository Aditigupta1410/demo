package FirstPackage;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstClass {
    @Test(groups = {"Smoke", "Regression"})
    public void test1(){

    }

    @Test(groups = {"Regression"})
    public void test2(){

    }

    @Parameters({"name", "id"})
    @BeforeTest(groups = {"Smoke", "Regression"})
    public void test3(String name, String id){
        System.out.println("My name is :: " + name + " and id is :: "  + id);
    }
}

