@debug
Feature: TODOist API Assignment

Background:
    * url baseUrl
  
Scenario: Sections
    Given path 'sections'
    * def parameters = 
    """
      {
        projID : '#(projectID)'
      }
      """
    And params parameters
    Given header Authorization = ' Bearer '+ tokenID
    When method GET
    Then status 200
  # * print response

#Create New Sections
    Given path 'sections' 
    Then status 200
    * def body = read('project.json')
    * def payload = body.createSections
    And request payload
    Given header Authorization = ' Bearer '+ tokenID
 When method POST
  Then status 200
    * print response  
    * def sectionID = response.id  


    #Get Single section
    Given path 'sections/'+sectionID
    Given header Authorization = ' Bearer '+ tokenID
    When method GET
    Then status 200

    #Update section
    Given path 'sections/'+sectionID   
     * def data = read('project.json')
    * def update = data.updateSection
    And request update
    Given header Authorization = ' Bearer '+ tokenID
 When method POST
  Then status 204
    

  * def id = call read('tasks.feature') {section_Id : '#(sectionID)'}
 

