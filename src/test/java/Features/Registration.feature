Feature: Registration Functionality
@Reg
Scenario: Registration button exists
Given I open guru99 website
When user enter valid data on the page
| Fields | Values |                             
| Title         | Miss |                  
| First Name    | Nandhini |         
| Surname       | Shanmugam |
| Phone         | 9807896541 |
| Year_DOB      | 1994 |                  
| Month_DOB     | October |         
| Date_DOB      | 17 |
| License Period| 10 |                  
| Occupation    | Social worker |         
| Address       | Rangan Street |
| City          | Chennai |
| Country       | India |
| Postal code   | 600 006 |                  
| Email id      | nandy@gmail.com |         
| Password      | urspassword@123 |
| Confirm password| urspassword@123 |
Then the user registration should be successful