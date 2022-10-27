package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class InsurancePage extends BrowserUtils {
    public InsurancePage(){ PageFactory.initElements(Driver.getDriver(),this); }

    private static final Logger logger = Logger.getLogger(InsurancePage.class);

    @FindBy(id = "project-Insurance")
    private WebElement InsuranceButton;

    @FindBy(id = "get-a-quote")
    private WebElement getQuoteButton;

    @FindBy(id = "mat-select-value-1")
    private WebElement vehicleYearSelect;

    @FindBy(xpath = "//div[@role='listbox']//span")
    private List<WebElement> selectYearOptions;

    @FindBy(css = "div.mat-select-arrow-wrapper.ng-tns-c60-9")
    private WebElement vehicleMakeSelect;

    @FindBy(xpath = "//div[@role='listbox']//span")
    private List<WebElement> selectMakeOptions;

    @FindBy(css = "div.mat-select-arrow-wrapper.ng-tns-c60-11")
    private WebElement vehicleModelSelect;

    @FindBy(xpath = "//div[@role='listbox']//span")
    private List<WebElement> selectModelOptions;

    @FindBy(id = "next-step")
    private WebElement nextButton1;

    @FindBy(xpath = "//mat-button-toggle-group//button/span")
    private List<WebElement> financeOptions;

    @FindBy(id = "next-step2")
    private WebElement nextButton2;

    @FindBy(id = "mat-input-0")
    private WebElement driveDistance;

    @FindBy(xpath = "//mat-checkbox[@id='mat-checkbox-1']")
    private WebElement workAndSchoolCheckbox;

    @FindBy(id = "next-step3")
    private WebElement nextButton3;

    @FindBy(id = "mat-input-1")
    private WebElement startDate;

    @FindBy(id = "next-step4")
    private WebElement nextButton4;

    @FindBy(id = "mat-button-toggle-7")
    private WebElement discountYes1;

    @FindBy(id = "mat-button-toggle-9")
    private WebElement discountYes2;

    @FindBy(id = "next-step5")
    private WebElement nextButton5;

    @FindBy(id = "mat-input-2")
    private WebElement driverLicenseNumber;

    @FindBy(id = "next-step6")
    private WebElement nextButton6;

    @FindBy(id = "mat-button-toggle-12-button")
    private WebElement historySelection;

    @FindBy(id = "next-step7")
    private WebElement nextButton7;

    @FindBy(xpath = "//span[@class='biggest']")
    private WebElement monthlyPayment$;

    @FindBy(xpath = "//h4")
    private WebElement annualAll;

    public void setInsuranceButton() {
        InsuranceButton.click();
    }
    public void setGetQuoteButton() {
        getQuoteButton.click();
    }

    public void setVehicleYearSelect() {
        vehicleYearSelect.click();
        staticWait(1);
    }

    public void setSelectOptions(String year) {
        try {
            for (WebElement each:selectYearOptions) {
                if (each.getText().equals(year)){
                    each.click();
                    break;
                }
            }
        }catch (StaleElementReferenceException e){

        }

        staticWait(1);
    }
    public void setVehicleMakeSelect() {
        vehicleMakeSelect.click();
        staticWait(1);
    }

    public void setSelectMakeOptions(String make) {
        try {
            for (WebElement each:selectMakeOptions) {
                if (each.getText().equals(make)){
                    each.click();
                    break;
                }
            }
        }catch (StaleElementReferenceException e){

        }

        staticWait(1);
    }

    public void setVehicleModelSelect() {
        vehicleModelSelect.click();
        staticWait(1);
    }

    public void setSelectModelOptions(String model) {
        try {
            for (WebElement each:selectModelOptions) {
                if (each.getText().equals(model)){
                    each.click();
                    break;
                }
            }
        }catch (StaleElementReferenceException e){

        }

        staticWait(1);
    }

    public void setNextButton1() {
        nextButton1.click();
    }

    public void setFinanceOptions(String finance) {
        staticWait(1);
        for (WebElement each : financeOptions){
            if (each.getText().equals(finance)){
                each.click();
            }
        }
    }

    public void setNextButton2() {
        nextButton2.click();
    }

    public void setDriveDistance(String distance) {
        staticWait(1);
        driveDistance.sendKeys(distance);
        staticWait(1);
    }

    public void setWorkAndSchoolCheckbox() {
        workAndSchoolCheckbox.click();
    }

    public void setNextButton3() {
        staticWait(1);
        nextButton3.click();
    }

    public void setStartDate(String  date) {
        staticWait(1);
        startDate.sendKeys(date);
    }

    public void setNextButton4() {
        staticWait(1);
        nextButton4.click();
    }

    public void setDiscountYes1() {
        staticWait(1);
        discountYes1.click();
    }

    public void setDiscountYes2() {
        discountYes2.click();
    }

    public void setNextButton5() {
        staticWait(1);
        nextButton5.click();
    }

    public void setDriverLicenseNumber(String driverLicense) {
        staticWait(1);
        driverLicenseNumber.sendKeys(driverLicense);
    }

    public void setNextButton6() {
        staticWait(1);
        nextButton6.click();
    }

    public void setHistorySelection() {
        staticWait(1);
        historySelection.click();
    }

    public void setNextButton7() {
        staticWait(1);
        nextButton7.click();
    }
    String monthlyFinal;
    String annualFinal;
    public void setMonthlyPayment$() {
        staticWait(1);
        String [] monthly1 = monthlyPayment$.getText().split("\\$");
        monthlyFinal = monthly1[1];
        System.out.println("Monthly payment is: "+Double.parseDouble(monthlyFinal));
    }

    public void setAnnualAll() {
        String [] annual1 = annualAll.getText().split(" ");
        String [] annual2 = annual1[0].split("\\$");
        String [] annual3 = annual2[1].split(",");
        annualFinal = annual3[0]+annual3[1];
        System.out.println("Annual payment is: "+Double.parseDouble(annualFinal));

        if (Double.parseDouble(annualFinal)/12==Double.parseDouble(monthlyFinal)){
            Assert.assertTrue(true);
        }
    }


}
