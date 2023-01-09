package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.util.logging.Level;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/java/features",
       glue = {"steps"},
        plugin = {"json:test/report/cucumber-report.json"},
        tags = "@test"

)
public class runner {

    @AfterClass
    public static void Final(){
        try {
            System.out.println("Generando reporte");
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Reporte generado correctamente");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
