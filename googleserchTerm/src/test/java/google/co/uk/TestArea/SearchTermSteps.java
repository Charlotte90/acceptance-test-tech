package google.co.uk.TestArea;

import browserFactory.Browsers;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageElements.BasePage;
import pageElements.GoogleHomePage;
import pageElements.SearchResultPage;

public class SearchTermSteps {

    private Browsers browsers;
    private GoogleHomePage homePage;
    private SearchResultPage searchResultPage;

    @Before
    public void setup() {
        this.browsers = new Browsers();
        browsers.initiliaseBrowser();
    }


    @Given("^I am on google search page$")
    public void i_am_on_google_search_page() throws Throwable {
        BasePage basePage = new BasePage(Browsers.getDriver());
        homePage = basePage.goToGoogleHomePage();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String termToBeSearched) throws Throwable {
        searchResultPage = homePage.searchFor(termToBeSearched);
    }

    @Then("^I should see \"([^\"]*)\" on the search page$")
    public void i_should_see_on_the_search_page(String expectedResult) throws Throwable {
        boolean result = searchResultPage.validateResult(expectedResult);
        Assert.assertTrue("Didn't find "+expectedResult, result);
        boolean pageRes = searchResultPage.validatePage();
        Assert.assertTrue(pageRes);
    }


    @After
    public void closeBrowser() {
        browsers.closeBrowser();
    }



}
