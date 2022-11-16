@debug

Feature: TODOist API Assignment

Background:
    * url baseUrl


Scenario: Tasks
    Given path 'tasks'
    * def parameters = 
    """
      {
        section_Id : '#(sectionID)'
      }
      """
    And params parameters
    Given header Authorization = ' Bearer '+ tokenID
    When method GET
    Then status 200
  # * print response

#Create New Sections
    Given path 'tasks' 
    Then status 200
    * def body = read('project.json')
    * def payload = body.createTasks
    And request payload
    Given header Authorization = ' Bearer '+ tokenID
 When method POST
  Then status 200
    * print response  
    * def tasksID = response.id  


    #Get Single section
    Given path 'tasks/'+tasksID
    Given header Authorization = ' Bearer '+ tokenID
    When method GET
    Then status 200

    #Update section
    Given path 'tasks/'+tasksID   
     * def data = read('project.json')
    * def update = data.updateTasks
    And request update
    Given header Authorization = ' Bearer '+ tokenID
 When method POST
  Then status 204


  #close task

  Given path 'tasks/'+tasksID +"/close"
  Given header Authorization = ' Bearer '+ tokenID
  When method POST

  #reopen task

#   Given path 'tasks/'+tasksID +"/reopen"
#   Given header Authorization = ' Bearer '+ tokenID
#   When method POST

 * def id = call read('ucomments.feature') {tasks_ID : '#(tasksID)'}
  
