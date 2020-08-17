# Tyl - Home Technical Task

## Objective

This project is developed as a home techincal task for Tyl.

## Overview 

This project uses 

- **_Java_** : Programming Language

- **_Selenium_** : Web Automation Tool

- **_Cucumber_** :  BDD Tool

- **_Junit_** : Assertion Library

- **_Page Object Model_** : Design Pattern

- **_Maven_** : Build Tool

- **_Log4j2_** : Logging Library

- **_Maven-Cucumber-Reporting_** : Reporting Library

## Pre-requisites

- Install maven with version >= 3.6.0
- Install java with version >= 1.8.0
- Install Chrome Browser with version >= 84.0.0 and < 85.0.0
- Install Firefox Browser with version >= 79.0.0 and < 80.0.0
- Install git/github with version >= 2.28.0

## How does it work

Page Object model is used with BDD style framework using cucumber and selenium. Failed Scenarios will be 
automatically executed again once to minimize the chances of flaky failure. Build will be failed for any failed 
test scenario. Report is generated at the end of execution. Screenshot is attached in report for any 
failure test scenario after hook step is executed.
 
## How to run it 

1. Open terminal(MacOS/Linux) or command prompt(Windows) according to your operating system

2. Traverse to the directory where you want to clone/download the project

3. Clone [this](https://github.com/deepanshugoyal1989/tyl) repository using git on your system

    `git clone https://github.com/deepanshugoyal1989/tyl.git`
  
4. Run mvn clean install

5. Go to target/cucumber-reports

6. Open `overview-features.html` in any preferred browser to see test execution result