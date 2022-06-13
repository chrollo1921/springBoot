# KPS Candidate Demo

This is a demo project to gauge a candidate's Java and Spring knowledge.

It doesn't use Hybris in case the candidate doesn't have a Hybris installation available.

It uses JPA/Hibernate as a persistence layer and whilst we don't require candidates to have direct experience of this we do expect them to have an understanding of object relational mapping and enough problem solving ability to work through the objectives.

IMPORTANT: Once you've completed the test, please email stephanie.wilson@kps.com and simon.holmes@kps.com so that we know your work is ready to be reviewed.

## Getting Started

The project is a Spring Boot Gradle project. You can start up the server by running

    gradlew bootRun

Don't worry that it only gets to 80%, this is just the percentage through the Gradle build script. You're looking out for a line that says

    Started CandidatedemoApplication in x.xxx seconds
    
You are probably used to using an IDE for development. Run the task `gradlew eclipse` to generate a project file and import it as a new project in Eclipse.

Alternatively the [Buildship](https://gradle.org/eclipse/) plugin can help. You can find it in the Eclipse Marketplace.
Just run (or debug) the `CandidatedemoApplication` class to start within Eclipse.

There is an equivalent task for IntelliJ IDEA `gradlew idea`

## Tips
* Try to have at least one commit per task so that we can see the work progress
* Use descriptive commit comments

## Tasks

### 1. Create product list page
* Create a page with a controller and view to render the list of products. Jstl will work in a jsp template.
* It should be accessible via the link from the current homepage.
  It should show product name.

### 2. Add prices to the product list
* Show the price of each product next to its name in the list.
* The current currency to display should be stored in a session variable.
* Add a currency selector to the product list page and a controller method to change the session value.

### 3. Create a product edit page
* Create a controller, form bean and jsp to edit a product and its attributes
* Link to the product list
* Implement form validation for
    * name: not blank, max length 50 characters
    * prices: valid currency, amount is a number, amount is greater than 0
* If the form fails validation then reshow the form with error messages by the relevant field
* Try to allow editing of all currencies from the one form, not just the currently selected session currency

### 4. Create a branch to model categories
* Demonstrate that you understand Git branching by creating a new feature branch with a descriptive name. Create the branch from the commit that is the current head of the source repository rather than the head of your forked repository.
* Create a new model entity for `Category`
* Each category should be able to have many parents and many children.  
  We understand that you may have not used JPA before for modelling so the Hibernate docs at https://docs.jboss.org/hibernate/stable/annotations/reference/en/html_single/#entity-mapping should help as will the example model objects already in this project.
* Each category should be able to contain many products
* Add some sample data to `import.sql`

### 5. JSON output
* Switch back to the master branch
* Create a controller method to return all products as json.
* Ideally this should use the same url as the regular product list but show when the request contains the header `Accept: application/json`.

## Finished
* Please email stephanie.wilson@kps.com and simon.holmes@kps.com so that we know your work is ready to be reviewed.  Please include a link to this repositry in the email.
