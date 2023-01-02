package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class clasePrincipal {

    private WebDriver driver;

    public clasePrincipal(WebDriver driver){

        this.driver = driver;

    }

    public void click(By element) throws Exception {

        try {
            driver.findElement(element).click();
        }catch (Exception e){

            throw new Exception("No se pudo hacer click en el elemento " + element);
        }
    }

    public boolean isDisplayed(By element) throws Exception {

        try {
            return driver.findElement(element).isDisplayed();
        }catch (Exception e){

            throw new Exception("No se pudo encontrar el elemento " +element);
        }
    }

    public String getText(By element) throws Exception {

        try {
            return driver.findElement(element).getText();
        }catch (Exception e){

            throw new Exception("No se pudo obtener el texto de elemento " + element);
        }
    }

    public String getTitle() throws Exception {

        try {
            return driver.getTitle();
        }catch (Exception e){

            throw new Exception("No se pudo obtener el titulo de elemento");
        }
    }

    public void sendKeys(By element,String valor) throws Exception {

        try {
            driver.findElement(element).sendKeys(valor);
        }catch (Exception e){

            throw new Exception("No se pudo ingresar el texto " + valor + "en el elemento " +element);
        }
    }

}
