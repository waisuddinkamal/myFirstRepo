package stepDefinitions;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.DropDownPageObjects;
import utilities.CucumberReportingConfig;
import utilities.UtilityClass;

public class DropDownStepDef extends Base {
	DropDownPageObjects dropDownObj = new DropDownPageObjects();

	@Given("user on retail website")
	public void user_on_retail_website() {
	
	}

	@And("user click on desktop menue")
	public void user_click_on_desktop_menue() {
		dropDownObj.desktopsMenue();
		logger.info("user clicked on desktop munue");
		UtilityClass.takeScreenShot();
		
	}

	@And("user click on All show all desktops")
	public void user_click_on_all_show_all_desktops() {
		dropDownObj.showAllDesktopsList();
		logger.info("user clicked on all show all desktops");
		UtilityClass.takeScreenShot();
		
	}

	@And("user click on sort by drop down list")
	public void user_click_on_sort_by_drop_down_list() {
		dropDownObj.sortByList();
		logger.info("user lick on sort by drop down list");
		UtilityClass.takeScreenShot();
		
	}

	@Then("user select one of drop down options")
	public void user_select_one_of_drop_down_options() {
		dropDownObj.sortByList();
		dropDownObj.validation();
		logger.info("user seleced (Name A - Z) sort list");
		UtilityClass.takeScreenShot();
	}
	
}
