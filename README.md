# Web-test

This code solution cover the basic test cases in [https://www.check24.de](https://www.check24.de/) including bellow.
- Registering new customer
- Login
- Selecting ‘Travel’ section and search 
- Validate user registration page fields

Foundation of the project is created with Apache Maven build automation tool and Java. You can execute this test cases
individually or as a test suite. 

#### Possible improvements
- Add Continuous integration (CI) to the project.
- Add report generator to get visual test case reports.
- Add bug reporting module (JIRA or Bugzilla). The attached test case document is in JIRA test case format.

### Software Requirements :
1. Java 8
2. Apache Maven 3.1.1 or above
3. Mac Operating system *

*\*I used selenium webdriver Mac version to run the test cases. But it can be enhanced to work with other operating system 
as future work. You can replace your favorable webdriver version in "resources" folder and you just need to update 
the config.properties with the new webdriver name.*

### UI test Automation
This project has three main sections as, *Scripts*, *Documents* and *Contexts*. Documents and Contexts has made reusable 
so the framework follows DRY principal as much as possible. There is a separate script file for each and every test case 
and with few code lines we can declare what we need to capture from the Web-page and what we 
need to serve as input. Also, we can add *Test Case Precondition Blocks* in scripts.

##### Run UI automated test cases
1. Open up a Terminal.
2. Navigate to project folder ```$cd web-test```
4. Execute the command ```$mvn test```

### Test case Document
Please find the Test case document inside the project.
