[![Cucumber CI](https://github.com/Damm999/CucumberBDD/actions/workflows/CI.yml/badge.svg)](https://github.com/Damm999/CucumberBDD/actions/workflows/CI.yml)

### Framework Developed By Tamil
  
# CucumberBDD
> * This Framework contains cucumber.io and cucumber info cakes pom.xml file.
> * Any JDK or JVm related check under pom.xml or build path to match the system required paths

## Prerequisite: 

1. Java : Use (17.0.X) or More- LTS  
2. Maven (3.9.X) or More
3. Node.js
4. Eclipse IDE
5. Cucumber Plugin

## Steps Needs to Do:

* Import Project
* To Run in Chrome - Download Chrome for Testing Version 17.0.X or More & Download Chrome Driver for the same Version
* Get & Paste the Binary File \\src\\main\\resources\\Chrome\\win64\\chrome.exe
* Get & Paste the Driver File in to \\src\\main\\resources\\Drivers\\chromedriver.exe

* This Can be Configured in COnfiguration.properties File (Path : src\main\java\configuration\Configuration.properties)


## Execution: 
**Junit**:
* Run from `MainRunner.java` file
  
**Using Maven**:
* Either Configure mvn build in eclipse with:
  * `clean compile test`
* Or Run form command prompt:
  * `mvn clean compile test`

- Use For CICD Execution

**Using Cucumber.Feature File**:
* Open Feature File & Run As Cucumber Feature

## Features:

* Integrated With SLF4J For Logging Backend API Request & Reponse

* Cucumber Report

![image](https://github.com/TAMILHUNTER/ValueLabs/assets/42236012/b82fc187-ff05-495b-a199-eda1b295625a)


* Junit Reporting
![image](https://github.com/TAMILHUNTER/ValueLabs/assets/42236012/0a326afc-806f-43fe-94e6-fab49885cbfd)

* PDF Reporting

  ![image](https://github.com/TAMILHUNTER/ValueLabs/assets/42236012/9d973a52-378b-4b04-88f4-61fbd83abcde)

* Screen Recording - Click to View Sample - https://github.com/TAMILHUNTER/ValueLabs/assets/42236012/0486cf27-1661-4277-96a2-4453707fc0fe
   
https://github.com/TAMILHUNTER/ValueLabs/assets/42236012/0486cf27-1661-4277-96a2-4453707fc0fe

* Screenshots logging for reports

* Extent Reporting.

  ![image](https://github.com/TAMILHUNTER/ValueLabs/assets/42236012/7d50e722-6b01-472c-b0bb-5bdaefac9bd8)

* Cucumber latest jars (v6)
* Extent Reports (v5)

## Framework Structure

![image](https://github.com/TAMILHUNTER/ValueLabs/assets/42236012/95aadd44-30e9-4b5b-b022-e3dcb6ee1ded)
