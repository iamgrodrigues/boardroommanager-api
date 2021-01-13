# BoardroomManager API

[![Author](https://img.shields.io/badge/author-GuilhermeRodrigues-2aa889?style=flat-square)](https://github.com/iamgrodrigues)
[![Languages](https://img.shields.io/github/languages/count/iamgrodrigues/boardroommanager-api?color=2aa889&style=flat-square)](#)
[![Stars](https://img.shields.io/github/stars/iamgrodrigues/boardroommanager-api?color=2aa889&style=flat-square)](https://github.com/iamgrodrigues/boardroommanager-api/stargazers)
[![Forks](https://img.shields.io/github/forks/iamgrodrigues/boardroommanager-api?color=2aa889&style=flat-square)](https://github.com/iamgrodrigues/boardroommanager-api/network/members)
[![Contributors](https://img.shields.io/github/contributors/iamgrodrigues/boardroommanager-api?color=2aa889&style=flat-square)](https://github.com/iamgrodrigues/boardroommanager-api/graphs/contributors)

> A Rest API that helps you to manage boardrooms :rocket:

<p align="center">
  <img align="center" src="https://i.ibb.co/89GSVBN/Boardroom-Manager-API.png" alt="boardroommanager-api" border="0">
</p>


# :pushpin: Table of Contents

* [Features](#rocket-features)
* [Requirements](#requirements)
* [Installation](#construction_worker-installation)
* [Getting Started](#runner-getting-started)
* [FAQ](#postbox-faq)
* [Found a bug? Missing a specific feature?](#bug-issues)
* [Contributing](#tada-contributing)
* [License](#closed_book-license)

# :rocket: Features

- CREATE 
- READ 
- UPDATE 
- DELETE 

Sample Valid JSON Request Body

Create -> ```/api/v1/boardrooms```

```json
[
  {
	"name": "Quebec",
	"date": "16/02/2021",
	"startHour": "09hs",
	"endHour": "12hs"
  }
]
```
[![Run in Insomnia}](https://insomnia.rest/images/run.svg)](https://insomnia.rest/run/?label=BoardroomManager%20API&uri=https%3A%2F%2Fgithub.com%2Fiamgrodrigues%2Fboardroommanager-api%2Fblob%2Fmaster%2F.github%2Fdocs/BoardroomManager-API)

It's important to mention that this is one of the applications from the BoardroomManager System

In order to explore the others, feel free to click on the link below:

* [BoardroomManager WEB](https://github.com/iamgrodrigues/boardroommanager-web)

# Requirements

For building and running the application you need:

- [JDK 8](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
- [Maven](https://maven.apache.org)

# :construction_worker: Installation

To install this application, run the following commands:

```bash
git clone https://github.com/iamgrodrigues/boardroommanager-api.git
```

If you have a SSH key registered in your Github account, clone the project using this command:

```bash
git clone git@github.com:iamgrodrigues/boardroommanager-api.git
```

# :runner: Getting Started

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.iamgrodrigues.boardroommanagerapi.BoardroommanagerApiApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```
Afeter the above command, you can navigate to the following address to see the project up and runnig:

```shell
http://localhost:8082/api/v1/people
```

## Status Codes

BoardroomManager returns the following status codes in its API:

| Status Code | Description |
| :--- | :--- |
| 200 | `OK` |
| 404 | `NOT FOUND` |
| 500 | `INTERNAL SERVER ERROR` |

# :postbox: Faq

**Question:** What are the tecnologies used in this project?

**Answer:** The tecnologies used in this project are [Java](https://www.java.com) + [Spring Boot](https://spring.io).

# :bug: Issues

Feel free to **file a new issue** with a respective title and description on the the [boardroommanager API](https://github.com/iamgrodrigues/boardroommanager-api/issues) repository. If you already found a solution to your problem, **I would love to review your pull request**! Have a look at our [contribution guidelines](https://github.com/iamgrodrigues/boardroommanager-api/blob/master/CONTRIBUTING.md) to find out about the coding standards.

# :tada: Contributing

Check out the [contributing](https://github.com/iamgrodrigues/boardroommanager-api/blob/master/CONTRIBUTING.md) page to see the best places to file issues, start discussions and begin contributing.

# :closed_book: License

Released in 2021.
This project is under the [MIT license](https://github.com/iamgrodrigues/boardroommanager-api/blob/master/LICENSE).

Made with love by [Guilherme Rodrigues](https://github.com/iamgrodrigues) 💚🚀
