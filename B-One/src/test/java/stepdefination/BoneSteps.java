package stepdefination;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobjects.*;
import resuable.LaunchBrowser;

import java.io.IOException;

public class BoneSteps {

    private WebDriver driver;
    private  LoginPageHelper loginPageHelper;
    private DashBoardHelper dashBoardHelper;
    private StoreHubHelper storeHubHelper;

    private CreateAssetSubCategoryHelper createAssetSubCategoryHelper;

    private AssetSubCategoryHelper assetSubCategoryHelper;


    @Given("user logins the b one application")
    public void loginApplication() throws IOException, InterruptedException {
        driver = LaunchBrowser.navigateToUrl();
        loginPageHelper=LoginPageHelper.getInstance(driver);
        dashBoardHelper=DashBoardHelper.getInstance(driver);
        storeHubHelper= StoreHubHelper.getInstance(driver);
        createAssetSubCategoryHelper = CreateAssetSubCategoryHelper.getInstance(driver);
        assetSubCategoryHelper=AssetSubCategoryHelper.getInstance(driver);
        loginPageHelper.enterUsername().enterpassword().clickSignIn();
        dashBoardHelper.clickSettings();
        storeHubHelper.clickAssertSubCategory();
        assetSubCategoryHelper.clickCreate();
        createAssetSubCategoryHelper.enterAssertCategory().enterAssertSubCategory().clickCreate();
        Assert.assertEquals("sam",assetSubCategoryHelper.getSubCategorytext());



    }
}
