$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('Features\Registration.feature');
formatter.feature({
  "line": 1,
  "name": "Registration Functionality",
  "description": "",
  "id": "registration-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Registration button exists",
  "description": "",
  "id": "registration-functionality;registration-button-exists",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I open guru99 website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter valid data on the page",
  "rows": [
    {
      "cells": [
        "Fields",
        "Values"
      ],
      "line": 6
    },
    {
      "cells": [
        "Title",
        "Miss"
      ],
      "line": 7
    },
    {
      "cells": [
        "First Name",
        "Nandhini"
      ],
      "line": 8
    },
    {
      "cells": [
        "Surname",
        "Shanmugam"
      ],
      "line": 9
    },
    {
      "cells": [
        "Phone",
        "9807896541"
      ],
      "line": 10
    },
    {
      "cells": [
        "Year_DOB",
        "1994"
      ],
      "line": 11
    },
    {
      "cells": [
        "Month_DOB",
        "October"
      ],
      "line": 12
    },
    {
      "cells": [
        "Date_DOB",
        "17"
      ],
      "line": 13
    },
    {
      "cells": [
        "License Period",
        "10"
      ],
      "line": 14
    },
    {
      "cells": [
        "Occupation",
        "Social worker"
      ],
      "line": 15
    },
    {
      "cells": [
        "Address",
        "Rangan Street"
      ],
      "line": 16
    },
    {
      "cells": [
        "City",
        "Chennai"
      ],
      "line": 17
    },
    {
      "cells": [
        "Country",
        "India"
      ],
      "line": 18
    },
    {
      "cells": [
        "Postal code",
        "600 006"
      ],
      "line": 19
    },
    {
      "cells": [
        "Email id",
        "nandy@gmail.com"
      ],
      "line": 20
    },
    {
      "cells": [
        "Password",
        "urspassword@123"
      ],
      "line": 21
    },
    {
      "cells": [
        "Confirm password",
        "urspassword@123"
      ],
      "line": 22
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "the user registration should be successful",
  "keyword": "Then "
});
formatter.match({
  "location": "Registration.open_guru99()"
});
formatter.result({
  "duration": 3794295600,
  "status": "passed"
});
formatter.match({
  "location": "Registration.enter_valid_data(DataTable)"
});
formatter.result({
  "duration": 39358182000,
  "status": "passed"
});
formatter.match({
  "location": "Registration.successful_login()"
});
formatter.result({
  "duration": 24716700,
  "status": "passed"
});
});