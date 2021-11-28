
#Feature:Successful login
#Scenario Outline:  Login Facebook
    #Given valid url
    #When I launch the browser it should navigate facbook
    #When I enters valid username '<username>'
    #When I enter valid password'<password>'
#		Then Login button should be click'<login>'
    #Then I validate the outcomes
    #Examples: 
      #| username          | password      |   
      #| LakshmiGmail.com  | lakshmi@123   |  
      #| vasanthGmail.com  | vasanth@123   | 
      #| AravindhGmail.com | aravbindh@123 |
    
    
    Feature: Login Hotel Adactin
    Scenario: Verify the login page
    Given: positive url of adactin web page 
    When: User enters the valid "username" & "password" 
    Then: The page should successfuly navigate HotelAdactin home page