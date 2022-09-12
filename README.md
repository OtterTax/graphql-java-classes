# Java classes for OtterTax GraphQL queries and mutations

This repository contains the code for generating plain old Java objects
(POJOs) for all statement objects and return objects, along with 
several useful helper objects.

## Prerequisites

This code works in conjunction with the open-source Gson library from Google.  Download the library [here](https://github.com/google/gson).

## Using the library

Most users simply need to download the jar file in the `target` directory.  Source code is available for those who wish to see or modify it in the `src` directory tree.

Use these classes to parse responses from the OtterTax API and marshall them into java objects.  The classes included in this package are:

* Add statement responses (e.g., AddF1098StatementResponse): Used for parsing responses to the various add mutations, for example `addF1098Statements`.  See example [here](https://doc.ottertax.com/f1098/adding/).
* Config: Convenience class used for storing configuration information for the OtterTax API.  See the source code for the [OtterTax tutorials](https://github.com/OtterTax/tutorial-source-code) for an example.
* ConfirmRegistrationResponse: Used to marshall the response when confirming your registration.  See example [here](https://doc.ottertax.com/registration/registration_confirmation/).
* Credential: Used to marshall the credential returned when authenticating.  See example [here](https://doc.ottertax.com/authentication/how_to_authenticate/).
* DeleteResponse: Used to marshall the response to the `deleteStatements` mutation.  See example [here](https://doc.ottertax.com/all_statement_types/deleting/).
* DownloadResponse: Used to download statements.  For performance reasons, the various classes used to get statements do not include the PDF object.  This class includes only three elements the OtterTax ID, the uploader ID, and the PDF.  See example [here](https://doc.ottertax.com/all_statement_types/downloading_pdfs/).
* Base responses (e.g., F1098ResponseStatement): Used only as subclasses of other objects; should not be used directly.
* Input statements (e.g., F1098InputStatement): Used only as subclasses of other objects; should not be used directly.
* Update objects (e.g., F1098Update): Convenience classes for updating statements.  See the source code for the [OtterTax tutorials](https://github.com/OtterTax/tutorial-source-code) for an example.
* FinalizeResponse: Used to marshall the response to the `finalizeStatements` mutation.  See example [here](https://doc.ottertax.com/all_statement_types/finalizing/).
* Get distinct statement responses (e.g., GetF1098StatementsResponse): Used to marshall the responses to the various get statement queries, for example, `getF1098Statements`.  See example [here](https://doc.ottertax.com/f1098/reviewing/).
* GetStatementsResponse: Used to marshall the response to the `getStatements` query.  See example [here](https://doc.ottertax.com/all_statement_types/reviewing/).
* LogoutResponse: Used to marshall the response returned by the server when logging out.  See the source code for the [OtterTax tutorials](https://github.com/OtterTax/tutorial-source-code) for an example.
* SecretGreetingResponse: Used to marshall the response to the `secretGreeting` query; useful when testing authentication.  See example [here](https://doc.ottertax.com/authentication/testing_authentication/).
* Statement: Used only as subclasses of other objects; should not be used directly.
* StatementDefinitionsResponse: Used to marshall the response to the `statementDefinitions` query.  See example [here](https://doc.ottertax.com/statement_documentation/documentation/).
* SubmitResponse: Used to marshall the response to the `submitStatements` mutation.  See example [here](https://doc.ottertax.com/all_statement_types/submitting/).
* Update responses (e.g., UpdateF1098StatementsResponse): Used to marshall the responses to the various update statement mutations, for example, `updateF1098Statements`.  See example [here](https://doc.ottertax.com/f1098/updating/).

## License

This project is licensed under the terms of the MIT license.  See LICENSE.txt.
