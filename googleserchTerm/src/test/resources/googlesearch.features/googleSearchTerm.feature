Feature:  Search on google.co.uk using any given search term
  As a SEO Analyst
  I want to be able to use google search engine
  So that I can determine the pages of search results

  @wip
  Scenario: 1_Google Search Engine
    Given I am on google search page
    When  I search for "zara.com.uk"
    Then  I should see "ZARA United Kingdom - Official Website" on the search page


