package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CreateAssetSubCategoryHelper {
    private static CreateAssetSubCategoryHelper assertSubCategoryHelper;
    private WebDriver wd;

    public CreateAssetSubCategoryHelper(WebDriver driver) {
        wd = driver;
    }
    public static CreateAssetSubCategoryHelper getInstance(WebDriver driver){

        assertSubCategoryHelper  = new CreateAssetSubCategoryHelper(driver);

        return assertSubCategoryHelper;
    }
    public CreateAssetSubCategoryHelper enterAssertCategory() throws InterruptedException {

        Thread.sleep(1000);
        wd.findElement(By.xpath("//span[@class='anticon anticon-close-circle']")).click();
        wd.findElement(By.xpath("//div[@name='parentAssetType']/div/span[2]")).click();
        wd.findElement(By.xpath("//div[@label='IT Assets']")).click();

        return this;
    }

    public CreateAssetSubCategoryHelper enterAssertSubCategory(){
        wd.findElement(By.xpath("//input[@name='assetTypeName']")).sendKeys("sam");
        return this;
    }

    public CreateAssetSubCategoryHelper clickCreate(){
        wd.findElement(By.id("b1_stepper_next")).click();
        return this;
    }




}
