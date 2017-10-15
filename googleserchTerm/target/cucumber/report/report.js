$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("googlesearch.features/googleSearchTerm.feature");
formatter.feature({
  "line": 1,
  "name": "Search on google.co.uk using any given search term",
  "description": "As a SEO Analyst\r\nI want to be able to use google search engine\r\nSo that I can determine the pages of search results",
  "id": "search-on-google.co.uk-using-any-given-search-term",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4514481421,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "1_Google Search Engine",
  "description": "",
  "id": "search-on-google.co.uk-using-any-given-search-term;1-google-search-engine",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@wip"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on google search page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I search for \"zara.com.uk\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I should see \"ZARA United Kingdom - Official Website\" on the search page",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchTermSteps.i_am_on_google_search_page()"
});
formatter.result({
  "duration": 5427068165,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "zara.com.uk",
      "offset": 14
    }
  ],
  "location": "SearchTermSteps.i_search_for(String)"
});
formatter.result({
  "duration": 2934279046,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ZARA United Kingdom - Official Website",
      "offset": 14
    }
  ],
  "location": "SearchTermSteps.i_should_see_on_the_search_page(String)"
});
formatter.result({
  "duration": 460300700,
  "status": "passed"
});
formatter.after({
  "duration": 1289406036,
  "status": "passed"
});
});