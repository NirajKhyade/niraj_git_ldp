@debug
Feature: TODOist API Assignment

Background:
    * url baseUrl
  
Scenario: Labels
    Given path 'labels'
    Given header Authorization = ' Bearer '+ tokenID
    When method GET
    Then status 200
  # * print response

#Create New labels
    Given path 'labels' 
    Then status 200
    * def body = read('project.json')
    * def payload = body.createLabel
    And request payload
    Given header Authorization = ' Bearer '+ tokenID
 When method POST
  Then status 200
    * print response  
    * def labelID = response.id  
    


    #Get a label

    Given path 'labels/'+labelID
    Given header Authorization = ' Bearer '+ tokenID
    When method GET
    Then status 200

    #Update labels
    Given path 'labels/'+labelID   
     * def data = read('project.json')
    * def update = data.updateLabel
    And request update
    Given header Authorization = ' Bearer '+ tokenID
 When method POST
  Then status 204
    
