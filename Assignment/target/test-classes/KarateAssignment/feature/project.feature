@debug
Feature: TODOist API Assignment

Background:
    * url baseUrl

Scenario: CRUD Projects
    Given path 'projects'
    Given header Authorization = ' Bearer '+ tokenID
    When method GET
    Then status 200
  # * print response

#Create Project
    Given path 'projects' 
    Then status 200
    * def body = read('project.json')
    * def payload = body.createProject
    And request payload
    Given header Authorization = ' Bearer '+ tokenID
 When method POST
  Then status 200
    * print response  
    * def projectID = response.id  
    
    #Get Project
    Given path 'projects/'+projectID
    Given header Authorization = ' Bearer '+ tokenID
    When method GET
    Then status 200

    #Update Project
    Given path 'projects/'+projectID   
     * def data = read('project.json')
    * def update = data.updateProject
    And request update
    Given header Authorization = ' Bearer '+ tokenID
 When method POST
  Then status 204
    

  #Get all colaboratorss

  Given path 'projects/'+projectID +"/collaborators"
  Given header Authorization = ' Bearer '+ tokenID
  When method GET


  * def id = call read('sections.feature') {projID : '#(projectID)'}
 