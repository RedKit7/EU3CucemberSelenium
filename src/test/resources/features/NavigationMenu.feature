@navigate
  Feature: Logged in sales managers should be able to navigate to
    pages using the top menu. Once in the expected page, user should see
    correct page Title.


    Scenario: see the Vehicles title
      Given the SM logged in and is on the dashboard page
      When the SM hovers over the Fleet button and clicks the Vehicles button
      Then the SM should be able see Vehicles title

    @db
    Scenario: see the Campaigns title
      Given the SM logged in and is on the dashboard page
      When the SM hovers over the Marketing button and clicks the Campaigns button
      Then the SM should be able see Campaigns title


    Scenario: see the Calendars title
      Given the SM logged in and is on the dashboard page
      When the SM hovers over the Activities button and clicks the Calendar Events button
      Then the SM should be able see Calendars title