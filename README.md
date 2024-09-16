## Prerequisites:
 - Install Java 11: This is required to run the application. You can download it from the official Oracle website or use OpenJDK.
 - Install Maven: This is required to build the project. You can download it from the official Apache Maven website.
## Building the Project:
 - Navigate to the project directory where the `pom.xml` file is located.
 - Run the command `mvn clean package` to build the project. This will create a `.jar` file in the `target` directory.
## Running the Application:
 - Navigate to the `target` directory where the `swagger-java-client-1.0.0.jar` file is located.
 - Run the command `java -jar swagger-java-client-1.0.0.jar` to start the application.
## Application Description:
 - Authorization and Access Token Retrieval: The application authenticates with the NLG system and retrieves an access token. This token is used for subsequent requests to the NLG system.
 - Message Creation in NLG: The application creates messages in the NLG system.
 - Experiment Variation Creation: Based on the created messages, the application creates variations for an experiment.
 - Experiment Creation: The application creates an experiment in the NLG system.
 - Retrieving the Created Experiment: The application retrieves the details of the created experiment.
 - Experiment Update: The application updates the experiment in the NLG system.
 - URL Update: The application updates the URL in the NLG system.



