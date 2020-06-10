package test.java.api;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

public class Tasks {
    Long newId;
    Long[] deleteId;

    @Test
    public void getTask() {
        Response response = given().
                header("Authorization", "Bearer 613b9feaaf1b690e86c5ba32d7ab603e1fb60437").
                when().
                get("https://api.todoist.com/rest/v1/tasks?project_id=2237883859");
        JsonPath path = response.jsonPath();
        List<Map> list = path.getList("");
        List<String> actualContent = new ArrayList<String>();
        for (Map project: list) {
            actualContent.add((String) project.get("content"));
        }
        response.
                then().
                statusCode(200).
                assertThat().
                body(matchesJsonSchemaInClasspath("getTaskBodyValidation.json"));
        assertEquals(actualContent.get(0), "read book");
        actualContent.remove(0);
        for (String content: actualContent) assertFalse(content.equals("read book"), String.format("Expected content '%s' not to be 'read book'", content));
    }

    @Test()
    public void createTask() {
        newId = given().
                header("Authorization", "Bearer 613b9feaaf1b690e86c5ba32d7ab603e1fb60437").
                contentType(ContentType.JSON).
                body(new File("createTaskBody.json")).
         when().
                post("https://api.todoist.com/rest/v1/tasks").
         then().
                statusCode(200).
                extract().
                path("id");
    }


    @Test (dependsOnMethods = "createTask")
    public void deleteTask() {
        System.out.println("deleteId" + deleteId);
        given().
                header("Authorization", "Bearer 613b9feaaf1b690e86c5ba32d7ab603e1fb60437").
        when().
                delete("https://api.todoist.com/rest/v1/tasks/" + newId).
        then().
                statusCode(204);
    }

    @Test (dependsOnMethods = "createTask")
    public void closeTask() {
        given().
                header("Authorization", "Bearer 613b9feaaf1b690e86c5ba32d7ab603e1fb60437").
        when().
                post("https://api.todoist.com/rest/v1/tasks/" + newId + "/close").
        then().
                statusCode(204);
    }

    @AfterMethod
    public void afterMethod() {
        given().
                header("Authorization", "Bearer 613b9feaaf1b690e86c5ba32d7ab603e1fb60437").
        when().
                delete("https://api.todoist.com/rest/v1/tasks/" + newId).
        then().
                statusCode(204);
    }
}
