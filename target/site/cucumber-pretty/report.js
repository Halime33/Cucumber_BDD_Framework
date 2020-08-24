$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DarkSkyMain.feature");
formatter.feature({
  "line": 3,
  "name": "DarkSky Page feature",
  "description": "",
  "id": "darksky-page-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 5162337403,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": ":",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on DarkSky Main Page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkSkyMainPageSD.setDarkSkyMainPage()"
});
formatter.result({
  "duration": 1561451226,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify timeline is displayed in correct format",
  "description": "",
  "id": "darksky-page-feature;verify-timeline-is-displayed-in-correct-format",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@timeline"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I entered California into search box and click search button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I verify timeline is displayed with two hours incremented",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "California",
      "offset": 10
    }
  ],
  "location": "DarkSkyMainPageSD.verifyChosenLocation(String)"
});
formatter.result({
  "duration": 5323295686,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkyMainPageSD.verifyTimeLine()"
});
formatter.result({
  "duration": 2341614490,
  "status": "passed"
});
formatter.after({
  "duration": 178659277,
  "status": "passed"
});
formatter.before({
  "duration": 2558834216,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": ":",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on DarkSky Main Page",
  "keyword": "Given "
});
formatter.match({
  "location": "DarkSkyMainPageSD.setDarkSkyMainPage()"
});
formatter.result({
  "duration": 1010564008,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Verify day temperatures timeline",
  "description": "",
  "id": "darksky-page-feature;verify-day-temperatures-timeline",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@temperature"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I expand today",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I get all tempList",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I find maximum temperature",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I find minimum temperature",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I verify maximum temperature",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I verify minimum temperature",
  "keyword": "Then "
});
formatter.match({
  "location": "DarkSkyMainPageSD.expandToday()"
});
formatter.result({
  "duration": 4065382826,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkyMainPageSD.getAlltempList()"
});
formatter.result({
  "duration": 164954142,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkyMainPageSD.findMaxTemp()"
});
formatter.result({
  "duration": 3101796726,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkyMainPageSD.findMinTemp()"
});
formatter.result({
  "duration": 3102458359,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkyMainPageSD.verifyMaxTemp()"
});
formatter.result({
  "duration": 3189545180,
  "status": "passed"
});
formatter.match({
  "location": "DarkSkyMainPageSD.verifyMinTemp()"
});
formatter.result({
  "duration": 3127098785,
  "status": "passed"
});
formatter.after({
  "duration": 137782205,
  "status": "passed"
});
});