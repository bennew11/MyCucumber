package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeLIstPage {

    @FindBy(id="empsearch_id")
    public WebElement employeeIdSearchField;

    @FindBy(id="empsearch_employee_name_empName")
    public WebElement employeeNameField;

    @FindBy(id="searchBtn")
    public WebElement employeeListSearchBtn;



}
