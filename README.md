Bank API Service Testing using Rest Assured

# Prerequisites
- Java
- Eclipse or any other Java IDE
- Maven (if using eclipse, install Maven Integration for Eclipse)
- TestNG (if using eclipse, install TestNG Integration for Eclipse)


# Getting Started
Download the project (zip) or you can checkout the project from github.

import project as existing maven project.

# Installation
- On successful import, the project will build and install all the dependencies

# Running Tests
Select the `BankAPITest.java` and run as TestNG Test.

# Test Cases
1. `getCustomerDetails` - Get the customer details using customer id.

2. `getAccountDetailsById` - Get account details using account id. 

3. `getTransactionDetailsForId` - Get transaction details for an transaction id.

# Notes

All the tests uses assert for
- response status code - `200`
- Body Type: `json`
- `request id` matches the `response id`.
