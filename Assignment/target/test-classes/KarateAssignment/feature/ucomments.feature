@debug
Feature: TODOist API Assignment

Background:
    * url baseUrl

Scenario: Comments
    Given path 'comments'
    * def parameters = 
    """
      {
        tasks_ID : '#(tasksID)'
      }
      """
    And params parameters
    Given header Authorization = ' Bearer '+ tokenID
    When method GET
    Then status 200
  # * print response

#Create New comment
    Given path 'comments' 
    Then status 200
    * def body = read('project.json')
    * def payload = body.createComment
    And request payload
    Given header Authorization = ' Bearer '+ tokenID
 When method POST
  Then status 200
    * print response  
    * def commentsID = response.id  


    #Get a Single comment
    Given path 'comments/'+commentsID
    Given header Authorization = ' Bearer '+ tokenID
    When method GET
    Then status 200

    #Update section
    Given path 'comments/'+commentsID   
     * def data = read('project.json')
    * def update = data.updateComment
    And request update
    Given header Authorization = ' Bearer '+ tokenID
 When method POST
  Then status 204
    