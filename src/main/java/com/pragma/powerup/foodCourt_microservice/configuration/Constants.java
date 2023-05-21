package com.pragma.powerup.foodCourt_microservice.configuration;

public class Constants {

    private Constants() {
        throw new IllegalStateException("Utility class");
    }


    public static final String USER_SERVICE_NAME = "user-service";
    public static final String USER_SERVICE_URL = "http://localhost:8090/user";


    public static final String NAME_ROLE_OWNER = "ROLE_OWNER";
    public static final String EMPTY_NAME_MESSAGE = "The name field cannot be empty";
    public static final String EMPTY_DIRECTION_MESSAGE = "The direction field cannot be empty";
    public static final String EMPTY_IDOWNER_MESSAGE = "The idOwner field cannot be null";
    public static final String INVALID_FORMAT_PHONE_MESSAGE = "Invalid phone number format";
    public static final String INVALID_FORMAT_NIT_MESSAGE = "Invalid nil number format";
    public static final String INVALID_FORMAT_NAME_MESSAGE = "Invalid nil number format";
    public static final String INVALID_SIZE_PHONE_MESSAGE = "Invalid nil number format";
    public static final String EMPTY_PHONE_MESSAGE = "The PHONE field cannot be empty";
    public static final String EMPTY_URLLOGOTYPE_MESSAGE = "The urlLogotype field cannot be empty";
    public static final String EMPTY_NIT_MESSAGE = "The nit field cannot be empty";
    public static final String RESPONSE_ERROR_MESSAGE_KEY = "error";
    public static final String WRONG_CREDENTIALS_MESSAGE = "Wrong credentials or role not allowed";
    public static final String ROLE_NOT_FOUND_MESSAGE = "No role found with the id provided";
    public static final String USER_NOT_FOUND_MESSAGE = "No user found";
    public static final String SWAGGER_TITLE_MESSAGE = "User API Pragma Power Up";
    public static final String SWAGGER_DESCRIPTION_MESSAGE = "User microservice";
    public static final String SWAGGER_VERSION_MESSAGE = "1.0.0";
    public static final String SWAGGER_LICENSE_NAME_MESSAGE = "Apache 2.0";
    public static final String SWAGGER_LICENSE_URL_MESSAGE = "http://springdoc.org";
    public static final String SWAGGER_TERMS_OF_SERVICE_MESSAGE = "http://swagger.io/terms/";

}
