package com.api;


	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;
	import static io.restassured.RestAssured.*;
	import io.restassured.RestAssured;
	import io.restassured.http.ContentType;
	import static org.hamcrest.Matchers.*;


	public class BankAPITest {
		
		// Search by name
		Integer customerId = 12212;
		Integer accountId = 12456;
		Integer transactionId = 12478;

	  @BeforeClass
	  public void setBaseUri () {

	    RestAssured.baseURI = "http://parabank.parasoft.com/parabank/services/bank";
	  }
	  
	  @Test
	  //Testing Get request for Customer Details and getting Response Json with status code 
	  public void getCustomerDetails () {
	    given ()
	    	.header("Accept", "application/json")
	    .when()
	    	.get ("/customers/{customerId}", customerId)
        .then ()
            .assertThat()
            	.statusCode (200)
            	.and()
            	.contentType(ContentType.JSON)
            	.and()
            	.body("customer.id", equalTo(customerId));
    	}
	  
	  @Test
	  //Testing Get request for Account Details and getting Response Json with status code 
	  public void getAccountDetailsById () {
	    
	    given ()
	    	.header("Accept", "application/json")
	    .when()
	    	.get ("/accounts/{accountId}", accountId)
        .then ()
        	.assertThat()
	        	.statusCode (200)
	        	.and()
	        	.contentType(ContentType.JSON)
		        .and()
	            .body("account.id", equalTo(accountId));
	  }
	  
	  @Test
	  //Testing Get request for Transaction Details and getting Response Json with status code 
	  public void getTransactionDetailsForId () {
	    
	    given ()
	    	.header("Accept", "application/json")
	    .when()
	    	.get ("/transactions/{transactionId}", transactionId)
        .then ()
        	.assertThat()
        		.statusCode (200)
	        	.and()
	        	.contentType(ContentType.JSON)
	        	.and()
	            .body("transaction.id", equalTo(transactionId));
         }

}
