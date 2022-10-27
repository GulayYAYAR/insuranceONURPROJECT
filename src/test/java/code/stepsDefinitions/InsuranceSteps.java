package code.stepsDefinitions;

import code.pages.InsurancePage;
import code.utils.BrowserUtils;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class InsuranceSteps extends BrowserUtils {

    InsurancePage insurancePage = new InsurancePage();

    @Given("The user wants to go to the home website")
    public void the_user_wants_to_go_to_the_home_website() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("URL"));
    }
    @Then("The user wants to click on the Insurance modules")
    public void the_user_wants_to_click_on_the_insurance_modules() {
        insurancePage.setInsuranceButton();
    }
    @Then("The user wants to click on the Get a Quote button")
    public void the_user_wants_to_click_on_the_get_a_quote_button() {
        insurancePage.setGetQuoteButton();
    }
    @Then("The user wants to select the vehicleYear as {string}")
    public void the_user_wants_to_select_the_vehicle_year_as(String year) {
        insurancePage.setVehicleYearSelect();
        insurancePage.setSelectOptions(year);
    }
    @Then("The user wants to select the vehicleMake as {string}")
    public void the_user_wants_to_select_the_vehicle_make_as(String make) {
        insurancePage.setVehicleMakeSelect();
        insurancePage.setSelectMakeOptions(make);
    }
    @Then("The user wants to select the vehicleModel as {string}")
    public void the_user_wants_to_select_the_vehicle_model_as(String model) {
        insurancePage.setVehicleModelSelect();
        insurancePage.setSelectModelOptions(model);
        insurancePage.setNextButton1();
    }

    @Then("The user wants to select the financeDetails as {string}")
    public void the_user_wants_to_select_the_finance_details_as(String finance) {
        insurancePage.setFinanceOptions(finance);
        insurancePage.setNextButton2();
    }
    @Then("The user wants to enter {string} and select the applicable checkbox as I commute to work or school")
    public void the_user_wants_to_enter_and_select_the_applicable_checkbox_as_i_commute_to_work_or_school(String distance) {
        insurancePage.setDriveDistance(distance);
        insurancePage.setWorkAndSchoolCheckbox();
        insurancePage.setNextButton3();

    }
    @Then("The user wants to select the coverage {string}")
    public void the_user_wants_to_select_the_coverage(String date) {
        insurancePage.setStartDate(date);
        insurancePage.setNextButton4();
    }

    @Then("The user wants to select bth saving and discount as yes")
    public void the_user_wants_to_select_bth_saving_and_discount_as_yes() {
        insurancePage.setDiscountYes1();
        insurancePage.setDiscountYes2();
        insurancePage.setNextButton5();
    }
    @Then("The user wants to enter the {string}")
    public void the_user_wants_to_enter_the(String driverLicense) {
        insurancePage.setDriverLicenseNumber(driverLicense);
        insurancePage.setNextButton6();
    }
    @Then("The user wants to select No for the other licence option")
    public void the_user_wants_to_select_no_for_the_other_licence_option() {
        insurancePage.setHistorySelection();

    }
    @Then("The user wants to click the Submit button")
    public void the_user_wants_to_click_the_submit_button() {
        insurancePage.setNextButton7();
    }
    @Then("The user wants to verify that the monthly and annual prices are match")
    public void the_user_wants_to_verify_that_the_monthly_and_annual_prices_are_match() {
        insurancePage.setMonthlyPayment$();
        insurancePage.setAnnualAll();
    }

}
